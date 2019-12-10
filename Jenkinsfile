pipeline {
    agent any

    stages {
        stage('Testing FAQS Springboot Backend') {
            steps {
		    echo "Testing a project"
            }
        }
        stage('Building FAQS Springboot Backend') {
            steps {
                    sh 'mvn package -DskipTests'
		    sh 'docker build -t="rakimsv/faqs-springboot-backend:latest" .'
            }
        }
        stage('Staging FAQS Springboot Backend') {
            steps {
                   echo "Staging"
            }
        }
        stage('Deploying FAQS Springboot Backend') {
            steps {
		   sh 'docker push "rakimsv/faqs-springboot-backend:latest"'
                   echo "Deploy"
            }
        }
        stage('FAQS Springboot Backend deployed') {
            steps {
                    sh 'chmod +x DockerRun.sh'
                    sh "ssh jenkins@104.198.153.5 'bash -s' < ./DockerRun.sh"
                echo "Project Deployed"
            }
        }
        stage('Running FAQS Springboot Backend') {
            steps {
                sh 'docker run "rakimsv/faqs-springboot-backend:latest"'
                echo "Project Running"
            }
        }
    }
}
