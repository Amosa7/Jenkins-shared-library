#!/usr/bin/env groovy

def call() {
    echo "building the application Jar..."
    sh "mvn package"
}