pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'  // Must match the name in Jenkins global tool config
    }

    environment {
        GIT_REPO = 'https://github.com/starboyonkar/currency-converter-ui.git'
        BRANCH = 'main'
    }

    triggers {
        githubPush()  // Enables GitHub webhook trigger
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: "${BRANCH}",
                    url: "${GIT_REPO}"
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Run Application') {
            steps {
                echo 'Build complete. Run the app manually if needed.'
            }
        }
    }

    post {
        success {
            echo '✅ Build was successful!!!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
