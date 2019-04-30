package day33_methodsWithReturnValue;

public class CalcTest {
public static void main(String[] args) {
	System.out.println(WarmUpAddValue.add(3, 1));
	System.out.println(Multiply.divide(6, 2));
	System.out.println(Multiply.minus(40, 12));
	System.out.println(Multiply.multiply(100, 2));
	
	int addResult = WarmUpAddValue.add(21, 42);
	int minusResult = (int) Multiply.minus(3, 1);
	int multiplyResult = (int)Multiply.multiply(5, 5);
	int divideResult = (int)Multiply.divide(60, 3);
	System.out.println("add result " + addResult);
	System.out.println("minus result "+ minusResult);
	System.out.println("multiply result " +multiplyResult );
	System.out.println("divide result " + divideResult );
	
	double a = 10.0, b = 5.0;
	double myResult = Multiply.minus(a, b);
	System.out.println("My result: " + myResult);
	
	double [] dNums = {2.0, 45.90};
	double resultArr = Multiply.multiply(dNums[0], dNums[1]);
	System.out.println("Result od multiplying 2 elements of array: "+ resultArr);

if(WarmUpAddValue.add(10, 16) == 26) {
	System.out.println("Add Unit test passed");
}else {
	System.out.println("Add Unit test failed");
}

String resultUnitTestAdd = WarmUpAddValue.add(340, 6) == 346 ? "Add Unit test passed": "Add Unit test failed";
System.out.println(resultUnitTestAdd);


}
}
