pipeline {
    agent any

    stages {
        stage('Testing FAQS project') {
            steps {
		    echo "Testing a project"
            }
        }
        stage('Building FAQs project') {
            steps {
                    sh 'mvn package -DskipTests'
		    sh 'docker build -t="rakimsv/ratings:latest" .'
            }
        }
        stage('Staging FAQs project') {
            steps {
                   echo "Staging"
            }
        }
        stage('Deploying FAQs project') {
            steps {
		   sh 'docker push "rakimsv/ratings:latest"'
                   echo "Deploy"
            }
        }
        stage('FAQs project deployed') {
            steps {
                    chmod +x DockerRun.sh
                    sh ./DockerRun.sh
                echo "Project Deployed"
            }
        }
        stage('Running FAQS project') {
            steps {
                sh 'docker run "rakimsv/ratings:latest"'
                echo "Project Running"
            }
        }
    }
}