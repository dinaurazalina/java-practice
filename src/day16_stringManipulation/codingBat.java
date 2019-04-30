public String nTwice(String str, int n) {
  String nTwice, a, b;
  
  if(n == 1){
    a = str.substring(0, 1);
    b = str.substring(str.length()-1);
    nTwice = a+b;
  }else if(n == 2){
    a = str.substring(0,2);
    b = str.substring(str.length()-2);
    nTwice= a+b;
  }else if(n == 3){
    a = str.substring(0,3);
    b = str.substring(str.length()-3);
    nTwice= a+b;
  }
  return nTwice;
}

