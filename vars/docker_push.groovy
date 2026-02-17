def call(String project, String tag, String user) {

    withCredentials([usernamePassword(
        credentialsId: 'dockerhubcred',
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass'
    )]) {

        sh '''
            echo "$dockerHubPass" | docker login -u "$dockerHubUser" --password-stdin
        '''

        sh """
            docker push ${user}/${project}:${tag}
        """
    }
}
