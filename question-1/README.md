public Account(requestedName){
  if(isAvailable(requestedName) == true){
    username = requestedName;
  }else{
    String practiceOne = requestedName;
    for(int i=1; isAvailable(practiceOne) == false; i++){
      practiceOne = requestedName;
      practiceOne += i;
    }
    username = practiceOne;
  }
}




public String getShortenedName(){
    String newName = "";
    for (int i = 0; i < username.length(); i++){
        if (username.charAt(i) == '-'){
            newName = newName.substring(0, newName.length() - 1);
        }
        else {
            newName += username.charAt(i);
        }
    }
    return newName;
}



