def call(string url,string branch) {
  echo "this is for writing the code"
  git url:"$(url)",branch:"$(branch)"
  echo "code clone is done successful"
}
