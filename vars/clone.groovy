def call(String repoUrl, String branch) {

    sh """
        git clone -b ${branch} ${repoUrl} .
    """
}
