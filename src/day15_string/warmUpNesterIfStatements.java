package day15_string;
import java.util.Scanner;
public class warmUpNesterIfStatements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an emoji");
		String emoji = scan.nextLine();
		
		if(emoji.length()!=2) {
			System.out.println("Invalid input");
		return;
		}
		
			
//			if (emoji.charAt(0) == ';') {
//				if (emoji.charAt(1)== ')') {
//					System.out.println("smile");
//				}else if(emoji.charAt(1)== '(') {
//					System.out.println("sad");
//				}else if(emoji.charAt(1)== '/') {
//					System.out.println("upset");
//				}else if (emoji.charAt(1)== 'p') {
//					System.out.println("playful");
//				}
//				
//			}else if(emoji.charAt(1)== ';') {
//				if(emoji.charAt(1)== ')') {
//					System.out.println("wink");
//				}else  if(emoji.charAt(1)== '0') {
//					System.out.println("surprised");
//				}
//			}
//		}
//		
		
				
				
				char first = emoji.charAt(0);
				char second = emoji.charAt(1);
				
				if (first == ':') {
					if(second == ')') {
					System.out.println("Smile");	
					}else if(second == '(') {
						System.out.println("Sad");
					}else if(second == '/') {
						System.out.println("Upset");
					}else if(second == 'p') {
						System.out.println("Playful");
						
				}
					}else if(first == ';') {
					if(second == ')') {
					System.out.println("Wink");	
					}else if(second == '0') {
						System.out.println("Surprised");	
					}else {
						System.out.println("Unknown");
						}					
					}else if(first == ')') {
					if (second == ':') {
						System.out.println("Smile reverse");
						}else if(second == ';') {
							System.out.println("wink reverse");
						
				}
					}else if(first == '(') {
					if(second == ';') {
						System.out.println("WInk Angry reverse");
					}else if(second == ':') {
						System.out.println("Angry reverse");
					}
					
				}
					
				else {
					System.out.println("Invalid entry");
				}
		
		}
	}


