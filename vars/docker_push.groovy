def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'Pass', usernameVariable: 'username')]) {
      sh "docker login -u ${username} -p ${Pass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
