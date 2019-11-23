pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'clean install compile exec:java -Dexec.mainClass="com.hcarrill.mavengmailautomation.GmailAutomation"'
      }
    }
  }
}