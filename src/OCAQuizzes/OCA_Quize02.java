package OCAQuizzes;

import java.util.Arrays;

public class OCA_Quize02 {
	

	public static void main(String[] args) {
		
		/*
		   
		   1. What's the result of the following code fragment? 

         String[][] arr= { { "A","B","C" }, { "D", "E" } };
         
                for(int i=0; i < arr.length; i++) {
                
                   for(int j=0; j<arr[i].length; j++) {
                   
                   
                       System.out.print( arr[ i ][ j ] ) ;
                       
                           if(arr[ i ][ j ].equals("B")) {
                                  break;
                                        }
                                        
                                        
                                     }
                                     
                               }
		 
		 		A. ACDE					     		B. ABC
		 		C. ABDE	<- Correct						C. Compile Error
		 		
		 */	
		
		 String[][] arr= { { "A","B","C" }, { "D", "E" } };
         			//	i <  2
         for(int i=0; i < arr.length; i++) { //i = 0; 		i =1;
        	 			//j    <		3
            for(int j=0; j<arr[i].length; j++) { // 0: j=0,  j=1, j=2
            
                System.out.print( arr[ i ][ j ] ) ;
                
                    if(arr[ i ][ j ].equals("B")) { //[0][0]  	A	[0][1]	B	
                    	
                    			// i=1; j<2; 		//[1][0] 	D   [1][1]  E
                    	
                    	// it will print ABDE
                           break; //exits inner loop and switch 
                                 }
                                 
                                 
                              }
                              
                        }
		System.out.println();
		
		
		/*
		 		2. what is the result? 

                 String[][] arr= { {"A","B","C"}, {"D","E"} };
                 
                   for(int i=0; i<arr.length; i++) {
                   
                       for(int j=0; j<arr[i].length; j++) {
                       
                            if(arr[i][j].equals("B")) {
                                      break;
                                        }
                                        
                         System.out.print(arr[i][j]);
                              }
                  }
                   	
                A. ADE	<- Correct 						B. ABDE      
		 		C. ACDE 							D. Compile Error
		 		
		 */
		
		//Continue, Return, Break, System.exit(0) are closing statements,
		//you cant put anything after those statements.
		//it will give you compile error, unreachable code
	//Continue :
         int []arr2 = {1, 2, 3, 4, 5};
        
		for(int each:arr2) {
			if(each ==3) continue;
			
			System.out.println(each);
		}
		
		
	//Return
		
//		for(int each:arr2) {
//			System.out.println(each);
//			if(each ==3) 
//				return;// it gets out of both loop, if shuts down from the method too
//			 
//			if(each ==3)System.exit(0); //it final shutdown. it greater than return 
//		}
		
		
		
		
		
		
		/*
	     3. What's the result of the given code fragment? 

                            int wd=0;
        		String[] days= {"sun","mon","wed","sat"};
        		
                  for(int i=0; i<days.length; i++) {
                  
                      switch (days[i]) {
                              case "sat": 
                              case "sun": 
                                            wd -=1;
                                            break;
                              case "mon": 
                                             wd++;
                              case "wed": 
                                            wd += 2; 
                                    }              
                                                                          
                               }
                                     
                       System.out.println(wd);
                       
            A. 0 									B. 4
            C. compile error						D. 3  <- correct         
	 
	 */
		   int wd=0;
   		String[] days= {"sun","mon","wed","sat"}; //4
   		
   		
             for(int i=0; i<days.length; i++) { //i =0; i =1; i=2; i=3
             
                 switch (days[i]) { //when i =0: wd 0-1=-1;  i=1: wd -1+1+2=2
                  					// i=2: 2+2=4; 			 i=3: 4-1= 3;
                         case "sat": 
                         case "sun": 
                                       wd -=1;
                                       break;
                         case "mon": 
                                        wd++;
                         case "wed": 
                                       wd += 2; 
                               }              
                                                                     
                          }
                                
                  System.out.println("wd is "+wd);
                  
		
		
		
		
		
		
		
		
		/*
		 
		 4. what's the result of the given code fragment?

                  int[] num1=new int[3];
                  int[] num2= {1,2,3,4,5};
                       num1=num2;
             for(int i=0; i<num1.length; i++) {
                        System.out.print(num1[i]);
                    }
                
             A. 000								B. 12345
             C. Compile Error					D. 123
		 
		 
		 
		 */
                  
                  //default values:
                  
            //byte= 0, short = 0; int =0; long = 0; double 0.0; float = 0.0, char = ''; String = "";
                  //all the wrapper classes default values == null
                  
                  String[] num12 = new String[3];
                  System.out.println(Arrays.toString(num12));
                  
                  
                  
                  int[] arr3 =new int[2];
                  arr3[0] =10;
                  arr3[1] =20;
                  arr3 = new int[4];
                  System.out.println(Arrays.toString(arr3));
                  
                  
                  
                  
                  int[] num1=new int[3];//[0, 0, 0]
                  int[] num2= {1,2,3,4,5};
                       num1=num2;
                       //num1 : [1, 2, 3, 4, 5]
                      
             for(int i=0; i<num1.length; i++) {
                        System.out.print(num1[i]);
                    }
             
            
             
             
             
             
                  
  //switch statements does not accept !!! double, long, float, boolean and their wrapper classes!!
		//it will give you  compile error
		
		
		/*
		 	5. Given the code fragent:

                      int[] arr1 = {1,2,3,4,5};
                           for(  XXX ) {
                         System.out.print(arr1[e]);
                           }

				Which option can replace xxx to enable the code to print 135 ?
				
		 A. int e = 0;  e < 5;  e += 2                B. int e = 1;  e <= 5;  e += 1
		 C. int e = 0;  e <= 4;  e++                  D. int e = 1;  e  <  5;  e +=2
		 
		 
		 */
		
		
		
		
		/*
		   6. Which statement is true about the switch statement?

				A. It must contain the default section.
				
				B. The break statement, at the end of each case block, is mandatory.
				
				C. Its case label literals can be changed at run time.
				
				D. Its expression must evaluate to a single value.
		 
		 
		 */
		
		
		
		
		
		/*
		 7. Given the code fragment: 

                    int x=100;
                    int a=x++;
                    int b=++x;
                    int c=x++;

              int d=(a<b) ? (a < c) ? a : ( b<c )? b : c;
               System.out.println(d);

			what's the result?
			
			A.  Compilation fails                        B. 100
			C. 101 										 D. 102
			
		 */
		
		
		
		
		
		/*
		   8. Which method signature do you use at line 1?
		   
		   public static void main(String[] args) {
		   
					int[] numbers= {1, 2, 3, 4, 5};
					int max =findMax(numbers);
					
				}
				
				 		line 1     {
					int max =0;
					return max;
							
				}
				
				A.  static int findMax (int[] numbers)
				B.  public int findMax (int[] numbers)
				C.  static int[] findMax (int max)
				D.  static int findMax (int numbers)
		   		
		   
		 */
		
		
		/*
		 	9. What's the result of the following code fragment?
		 				public static void main(String[] args) {
								int num = 10;
								add10(num);
								System.out.println(num);
								
							}
							public static void add10(int num) {
								num=num+10;
										
							}
		 	
			A. 0							B. 10
			C. compile error				D. 20

		 
		 */
		
		

		
		

	}

}