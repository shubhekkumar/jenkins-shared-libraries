def call(String url, String branch){
  deleteDir()
  git url: "${url}", branch: "${branch}"
}
