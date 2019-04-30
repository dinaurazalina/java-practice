package mentoringSession;

public class HTML {
	public static void main(String[] args) {
		
		String html = "<lsihdkrufhnd87454684765743!@#@!!!!!!fkjjfvn id=\"myid\"kjbfkbdc";
	
	
		
		//0123
		//id="
		if(html.contains("id=")) {
		int a = html.indexOf("id=");
		int b = html.indexOf("\"", a+5);
		System.out.println(html.substring(a+4,b));
	}else {
		System.out.println("Invalid input");
	}
		
	}

}
