
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
					buildImage()
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

