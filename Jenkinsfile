pipeline {
  agent any
  stages {
    stage('Build Maven ') {
      steps {
        sh 'clean install compile '
      }
    }
  }
}