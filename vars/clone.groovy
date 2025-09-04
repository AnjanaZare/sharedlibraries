def call(String url,String branch) {
  echo "this is for writing the code"
  git url:"${url}",branch:"${branch}"
  echo "code clone is done successful"
}
