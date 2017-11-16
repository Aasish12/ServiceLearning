// Jenkinsfile to build java backend project, run junit tests and deploy system to mass open cloud

pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				echo "Building..."
				sh 'mvn clean compile'
				sh 'mvn package'
			}
		}

		stage('Test') {
			steps {
				echo "testing..."
				sh 'mvn test || true'
				junit 'target/surefire-reports/*.xml'
			}
		}

		stage('Deploy') {
			when { branch 'SD103-Deploy-v1' }
			steps {
				checkout scm
				echo 'Deploying...'
				withCredentials([file(credentialsId: 'SD103-ssh-pem', variable: 'SD103_PEM_PATH')]) {
					sh 'chmod + x deploy.sh; bash deploy.sh'
				}
			}
		}
	}

	post {
			always {
				echo "saving results..."
				archive 'target/*.jar'
			}
			success {
				echo "success..."
			}
			failure {
				echo "failure..."
			}
		}
}
