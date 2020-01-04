node{
stage('initiating'){
def var = callFunc('calling funcation')
}
callFunc(String text){
echo text
}
}
