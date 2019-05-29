package day51_inheritance;

public class AtTheGym {
public static void main(String[] args) {
	

	Exercise e =new  Exercise();
	Running run = new Running();
	Yoga yo = new Yoga();
	JuiJitsu jj = new JuiJitsu();
	Swimming sw = new Swimming();
	Sprint sp = new Sprint();
	 
	System.out.println(e.perform(30));	
	System.out.println(run.perform(30));
	System.out.println(yo.perform(60));	
	System.out.println(jj.perform(60));	
	System.out.println(sw.perform(60));
	System.out.println(sp.perform(45));	

System.out.println("************");
Snowboarding sn = new Snowboarding();
System.out.println(sn.perform(100));


}
}