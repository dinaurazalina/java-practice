package day47_blocks;

public class VariableAccess {
	//instance variable
		int myInstanceVar = 40;
			
			
	//static variable
		static int myStaticVariable = 55;
	
		public static void main(String[] args) {
		//System.out.println(myInstanceVar);  < doesnt work
		System.out.println(myStaticVariable);
	
		//create object of VariableAccess and print myInstanceVar
		
		VariableAccess v = new VariableAccess();
		System.out.println(v.myInstanceVar);
		//access static variable using object 
		System.out.println(v.myStaticVariable);
		//access static variable using classname
		System.out.println(VariableAccess.myStaticVariable);
		}
}
