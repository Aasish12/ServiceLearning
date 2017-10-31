// Jenkinsfile to build java backend project, run junit tests and deploy system to mass open cloud

pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				echo "Building..."
				sh 'mvn clean'
			}
		}

		stage('Test') {
			steps {
				echo "testing..."
				sh 'mvn test || true'
				junit 'src/test/TestResults/*.xml'
			}
		}
	}

	post {
			always {
				echo "saving results..."
				archive 'target/**/*.jar'
			}
			success {
				echo "success..."
				slackSend (color: '#00FF00', message: "SUCCESSFUL: Job'${env.JOB_NAME}")
			}
			failure {
				echo "failure..."
				slackSend (color: '#FF0000', message: "FAILED: Job'${env.JOB_NAME}")
			}
		}
}
