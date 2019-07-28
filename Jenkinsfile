pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Inicio'
        sh 'mvn clean install -Dlicense.skip=true'
      }
    }
  }
}