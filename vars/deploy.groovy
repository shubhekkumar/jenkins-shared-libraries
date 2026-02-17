def call() {

    sh """
        docker compose down || true
        docker compose pull || true
        docker compose up -d
    """
}
