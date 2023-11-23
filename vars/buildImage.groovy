#!/usr/bin/env groovy

def call() {
    echo "building docker image of the appliction docker Image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo2', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        sh "docker build -t amosa77/demo-app:njma-3.5 ."
        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
        sh "docker push amosa77/demo-app:njma-3.5"
    }
}
