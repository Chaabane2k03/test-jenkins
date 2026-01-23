
@Library('jenkins-shared-library')_

pipeline{
	agent any
	tools {
		maven 'maven-latest'
	}
	stages {
		stage("build jar"){
			steps{
				script{
					buildJar()
				}
			}
		}

		stage("build image"){
			steps{
				script{
					buildImage 'chaabane2k03/calculator-app:stable-1.0'
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

