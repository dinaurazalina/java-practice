package day50_inheritance03;

public class AppsFactory {

	public static void main(String[] args) {
		
		IphoneApp iApp = new IphoneApp();
		IphoneApp iApp2 = new IphoneApp("Uber");
		
		AndroidApp aApp = new AndroidApp();
		AndroidApp aApp2 = new AndroidApp("Lyft");
		
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());
		
		System.out.println(aApp.getName());
		System.out.println(aApp2.getName());
		
		App.count = 33; //static variable has a shared variable
		System.out.println(IphoneApp.count); //bc it is inherited we can use it directly 
		
		AndroidApp.count = 100;
		System.out.println("App.count: "+App.count );//100 
		System.out.println("IphoneApp.count: "+IphoneApp.count);//100
		System.out.println("AndroidApp.count: "+AndroidApp.count ); //100
		
		//if anyone changes a static value, it changes everywhere for all the variables
		
		
		App.builtWith("Swift");
		IphoneApp.builtWith("Objective C");
		AndroidApp.builtWith("Java");
		aApp2.builtWith("JS");
	
	}
}
