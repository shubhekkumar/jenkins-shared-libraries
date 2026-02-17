def call(String repoUrl, String branch) {
    deleteDir()
    sh """
        git clone -b ${branch} ${repoUrl} .
    """
}
