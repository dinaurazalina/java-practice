package LeetCode;

public class RomanToInteger {
 public int getNum(String numbre) {// XV
	char roman[]= {'I', 'V',  'X', 'L', 'C', 'D',  'M'};
	int ints[] =  { 1,   5,   10,  50,  100, 500, 1000};
	 int [] mywhatever =new int [numbre.length()];
	int k =0;
	 for (int i =0 ; i < numbre.length(); i++) {
		for (int j = 0; j < roman.length; j++) {
		
			if(numbre.charAt(i)==roman[j]) {
				mywhatever[k++]=ints[j];
				break;
			}
		}
	}
	 
	 int result=0;
	 for (int i = 0; i < mywhatever.length-1; i++) {
		if(mywhatever[i]< mywhatever[i+1]) {
			result += mywhatever[i+1]-mywhatever[i];
			
		}else {
			result+=mywhatever[i];
		}
	}
 
 return 0;
 }
}
