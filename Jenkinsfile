pipeline {
    agent any
    
    tools{
        maven 'mymaven'
    }

    stages {
        stage('build maven') {
            steps {
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'myjenkinsgitcredential', url: 'https://github.com/upadhyay-rajesh/dddd']])
               bat 'mvn clean install'
            }
        }
         stage('build docker image') {
            steps {
                script{
                    bat 'docker build -t raj050178/myjenkins .'
                }
               
            }
        }
        
        stage('push docker image to docker hub'){
		steps{
		    script{
		        withCredentials([string(credentialsId: 'mydockerhubpassword', variable: 'mydockerhubpassword')]) {
                    bat 'docker login -u upadhyay.rajesh@rediffmail.com -p Rajesh123@ docker.io'
                    
                    bat 'docker push raj050178/myjenkins'
                }
		    }
		}
	}
        
    }
}