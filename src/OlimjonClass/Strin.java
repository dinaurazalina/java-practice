package OlimjonClass;

public class Strin {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder(""); // StringBuilder is a class, sb - object
			sb.append(" Java "); // it will charge the original string
			sb.append(39847); //you can add int
			
			boolean bo = true;//you can add boolean
			sb.append(bo); 	 //append == add
			
			sb.delete(0,  2);// delete == remove
			
		//	sb.reverse();
			String b = "Abc";
			
			System.out.println(sb.length());
			
			sb.insert(5, "gg");
			System.out.println(sb);
			
			
			sb.setCharAt(4, 'k');
			
			System.out.println(sb);
			
			//set length
			
			sb.setLength(3);
			System.out.println(sb);
			
			
			
			//in order to cast from StringBuilder to String 
			
			String str = new String (sb);
			//or
			String str2 = ""+ sb;
			//or
			String str3 = sb.toString();
	
	
	
	
	
	StringBuffer stri = new StringBuffer();
	
	
	
	}
}
