pipeline{
	agent any
	tools {
		maven 'maven-latest'
	}
	stages {
		stage("build jar"){
			steps{
				echo 'Building The application . . .'
				sh 'mvn package'
			}
		}

		stage("build image"){
			steps{
				echo 'Building the Docker image'
				withCredentials([usernamePassword(credentialsId: 'docker-auth', passwordVariable: 'PASS', usernameVariable: 'USER')]){
					sh 'docker build -t chaabane2k03/calculator-app:beta .'
					sh "echo $PASS | docker login -u $USER --password-stdin"
					sh 'docker push chaabane2k03/calculator-app:beta'
				}
			}
		}

		stage("deploy"){
			steps{
				echo "Deploying version . . ."
			}
		}
	}

}

