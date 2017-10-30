// Jenkinsfile to build java backend project, run junit tests and deploy system to mass open cloud

pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				echo "building..."
			}
		}

		stage('Test') {
			steps {
				echo "testing..."
			}
		}

		post {
			always {
				echo "saveing results..."
			}
			success {
				echo "success..."
			}
			failure {
				echo "failure..."
			}
		}
	}
}
