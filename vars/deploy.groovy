def call(String project, String tag, String user, String port) {

    sh """
        docker compose down || true
        docker compose pull || true
        docker compose up -d
    """
}
