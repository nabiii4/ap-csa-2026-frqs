public Account(requestedName){
  if(isAvailable == true){
    username = requestedName;
  }else{
  practiceOne = username;
  for(int i=0; practiceOne.isAvailable() == false; i++){
    practiceOne = username;
    practiceOne += i;
  }
  
  return practiceOne;
}
