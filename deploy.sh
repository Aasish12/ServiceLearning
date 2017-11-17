#!/usr/bin/env bash

if [[ -z ${SD103_PEM_PATH+x} ]]; then
	printf "Please set the SD103_PEN_PATH environment variable\n"
	exit 1
fi

set -x
scp -i "$SD103_PEM_PATH" $WORKSPACE/target/ServiceLearning.BackEnd-1.0.jar ubuntu@128.31.25.49:~/ServiceLearning.BackEnd-1.0.jar && \
ssh -i "$SD103_PEM_PATH" ubuntu@128.31.25.49 'sudo pkill standalone; sudo pkill java; sudo java -jar ServiceLearning.BackEnd-1.0.jar -b'
set +x