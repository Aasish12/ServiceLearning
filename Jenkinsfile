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
		
		stage('SonarQube') {
            steps {
                sh 'mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true'
                sh 'mvn sonar:sonar -Dsonar.host.url=http://128.31.24.224:9000'
            }
        }

		stage('DeployMaster') {
			when { branch 'master' }
			steps {
				echo "Hello Deploy in master."
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
