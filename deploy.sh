#!/usr/bin/env bash

if [[ -z ${SD103_PEM_PATH+x} ]]; then
	printf "Please set the SD103_PEN_PATH environment variable\n"
	exit 1
fi

set -x
scp -o StrictHostKeyChecking=no -i "$SD103_PEM_PATH" target/ServiceLearning.BackEnd-1.0.jar ubuntu@128.31.25.49:~/ServiceLearning.BackEnd-1.0.jar && \
ssh -o StrictHHostKeyChecking=no -i "$SD103_PEM_PATH" ubuntu@128.31.25.49 'pkill standalone; pkill java; rm ServiceLearning.BackEnd-1.0.jar; java -jar ServiceLearning.BackEnd-1.0.jar -b'
set +x