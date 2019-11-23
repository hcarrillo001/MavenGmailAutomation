pipeline {
  agent none
  stages {
    stage('Build') {
      steps {
        sh 'clean install compile exec:java -Dexec.mainClass="com.hcarrill.mavengmailautomation.GmailAutomation"'
      }
    }
  }
}