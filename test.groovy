node{
stage('initiating'){
def var1 = callFunc('calling funcation')
}
def callFunc(String text){
echo text
}
}
