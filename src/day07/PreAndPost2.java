package day07;

public class PreAndPost2 {
	public static void main(String[] args) {
		
//		int messages = 10;
//		messages++;
//		++messages;
//		System.out.println("Messages: " + messages);
//		
//		int readMessages = --messages;
//		System.out.println("Read messages: " + readMessages);
//		System.out.println("Messages: " + messages);
//		
//		
//		int unreadMessages = readMessages--;
//		System.out.println("unread Messages " + unreadMessages);
//		System.out.println("read messages: " + readMessages);
//		
//								//11			-	10
//		
//		int totalMessages = unreadMessages++ - readMessages--; 
//		System.out.println("unread Messages " + unreadMessages); //12
//		System.out.println("read messages: " + readMessages);//9
//		System.out.println("totalMessages" + totalMessages);//1
//	
//	
//		int count = 20;
//		int count2 = 10;
//						//	21 +		 9
//		int totalCount = ++count + --count2;
//		
//		System.out.println("count: " +count);//21
//		System.out.println("count2: " +count2);//9
//		System.out.println("totalCount: " +totalCount);//30
//	
		
	
		int count = 3;
						
		count = count++ + ++count;
		count += --count;
		System.out.println("count: " + count);
		
		
		
		
		
		
	
	}

}
