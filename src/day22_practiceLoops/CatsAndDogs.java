package day22_practiceLoops;

public class CatsAndDogs {
public static void main(String[] args) {
	
String  str = "catscatsmycat";
int count = 0;
for (int i = 0; i <= str.length()-3; i++) {
	if(str.substring(i, i+3).equals("cat")) {
		count += 1;
	}
}
System.out.println("how many cats are in the sentence "+ count);	
}
}
