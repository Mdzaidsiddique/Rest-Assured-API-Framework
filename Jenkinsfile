pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK 22'
    }

    environment {
        // Optional: define environment variables here
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Mdzaidsiddique/Rest-Assured-API-Framework.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }

//         stage('Publish JUnit Results') {
//             steps {
//                 junit '**/target/surefire-reports/*.xml'
//             }
//         }

        stage('Generate Allure Report') {
            steps {
                allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
            }
        }
    }

    post {
        always {
            echo 'Cleaning up...'
        }

        success {
            echo 'Build completed successfully.'
        }

        failure {
            echo 'Build failed.'
        }
    }
}
