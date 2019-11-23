pipeline {
  agent any
  stages {
    stage('Build Maven ') {
      steps {
        sh 'clean install compile '
        sh 'mvn -B -GmailAutomation clean package'
      }
    }
  }
}