package OCAQuizzes;

import java.util.Arrays;

public class Quize01 {

	public static void main(String[] args) {
		/*
	     
	     
	     1.  What's the result of the following code fragments?
	     
	        int[][] arr=new int[][] { {1,2}, {3,4} };
	                arr[1] = arr[0];
	            System.out.println(arr[0]);
	            
	            A. Compile Error                             B. [ 1, 2 ]
	            C. [ 3, 4 ]                                  C. hashcodes <<<<(CORRECT)
	            
	               
	     
	     */
			int[] arr0 = {1, 2, 3};
			int [] arr1 = new int[2];
			int [] arr2 = new int[] {1, 2};
	    
	        int []arr = {1, 2, 4};
	        System.out.println(arr);//will give us hashcode
	        //convert to String: Arrays.toString(variableName)
	        System.out.println(Arrays.toString(arr));
	        
	    
	    
	    /*
	     
	     
	     2. which one of the following will give compile error?
	     
	        A. int[][] arr=new int[2][5];
	        B. double[][] arr=new double[][] { {1,2}, {3,4} };
	        C. long[][] arr=new long[2][] { {1,2}, {3,4} }; (CORRECT)
	        D. int[][] arr ={ {'A', 'B'}, {'C' , 'D' } };
	            
	     [index num of single dimentional array][index num of elements in 1D array]
	     */
	        int[][] arr7=new int[2][5];
	        System.out.println(Arrays.deepToString(arr7));
	        double[][] arr8=new double[][] { {1,2}, {3,4} };
	       //long[][] arr9=new long[2][] { {1,2}, {3,4} };//you only can specify size OR values
	        int[][] arr6 ={ {'A', 'B'}, {'C' , 'D' } };
	        
	        char a ='l';
	        int a2 = 'l';
	        long a3 = a2;
	        int a4 = (int) a3;
	        
	        
	    /*
	     
	     3. what's the result of the following code fragment?
	                int[][] arr= { {1,2,3}, {3,4} };
	            for(int i=0; i<2; i++) {
	                for(int j=0; j<2; j++) {
	                    System.out.print(arr[i][j]+" ");
	                }
	            }
	            
	            A.  1 2 3 3 4                             B. 1 2 3 4(CORRECT)
	            C.  1 2 3                                 D. Throws an Exception
	            E. Compile Error
	     
	     */
	        int[][] arrz= { {1,2,3}, {3,4} };
            for(int i=0; i<2; i++) {		//i=0; i=1
            	
                for(int j=0; j<2; j++) {	//j=0; j=1
                    System.out.print(arrz[i][j]+" "); //[0][0] [0][1]     [1][0]  [1][1]
                    				// 1 2 3 4
                }
            }
	    
	        
	    
	    
	    /*
	     
	      4. Which Three lines fail to compile?
	            1   int ivar = 100;
	            2   double dvar = 123;
	            3   float fvar = 200; 
	            4       ivar = fvar; ERROR
	            5       fvar = ivar; COMPILE
	            6       dvar = fvar; COMPILE
	            7       fvar = dvar; ERROR
	            8       dvar = ivar; COMPILE
	            9       ivar = dvar; ERROR
	            
	        A. line 3, line 5, line 8                        B. line 4, line 7, line 9 (CORRECT)
	        C. line 5, line 6, line 9                        D. line 4, line 5, line 8
	     
	     */
	    
	        long a0 = 10l;
	        double g = 10l;
	      float f1 = 10f;
	      double d1= 10F;
	    
	    
	    /*
	     5. Which code fragment, when inserted at line 3, enables the code to print 10:20?
	            public static void main(String[] args) {
	            
	                 line 3 **
	                 arr[0]=10;
	                 arr[1]=20;
	                 System.out.println(arr[0]+" "+ arr[1]); 
	            }
	            
	            A. int arr[2] ;                           B. int[] arr n = new int[2];
	            C. int[] arr;     arr = int[2];           D. int arr[] = new int[2]; Correct
	 
	     
	     */
	    int [] array = new int[2];
	    
	    
	    
	     /*
	            6.  What's the result?
	            public static void main(String[] args) {
	        
	                    System.out.println("Result A"+0+1);
	                    System.out.println("Result B"+(1)+(2));
	                    
	                }
	        A. ResultA01     ResultB12 <<Correct                    B. ResultA01     ResultB3
	        C. ResultA1      ResultB3                      C. ResultA1      ResultB12
	      
	      */
	    System.out.println("Result A"+0+1);
        System.out.println("Result B"+(1)+(2));
	    System.out.println("Result A".concat("0").concat("1"));
	        
	    
	    
	    
	      /*
	                7.  What's the result?
	                
	                public static void main(String[] args) {
	        
	                        System.out.println("5 + 2 = "+3+4);
	                        System.out.println("5 + 2 = "+(3+4));
	                        
	                    }
	            
	            A. 5 + 2 = 34     5 + 2 = 7< (correct)            B. 5 + 2 = 34    5 + 2 =34
	            C. 7 = 7        7 + 7                  D. 5 + 2 = 3 + 4     5 + 2 = 7
	       
	       
	       */
	    
	    
	    
	    
	      
	       /*
	          8. What's the result?
	          
	            public static void main(String[] args) {
	                    String str = " ";
	                        str.trim();
	                    System.out.println(str.equals("") +"   "+str.isEmpty());    
	                }
	                
	           A. false     true                    B. true    true
	           C. false     false  (Correct)          D. true    false
	     
	     
	       */
	    String str = " ";
        str.trim();//you need to write str= str.trim() so that it removes space and make everything true;
     System.out.println(str.equals("") +"   "+str.isEmpty());   
	    
	        
	        /*
	            9. what's the result ?
	                    public static void main(String[] args) {
	                            int[][] arr=  { {1,2}, {3,4} };
	                            for(int i=arr.length-1; i>=0; i-- ) {
	                                for(int j=0; j<arr.length; j++) {
	                                    System.out.println(arr[i][j]+" ");
	                                }
	                            }
	                        }
	                        
	            A.  3 4 1 2       (correct)                  B. 1 2 3 4
	            C.  4 3 2 1                         D. 2 1 3 4
	            
	         
	         */
	    
     int[][] arry=  { {1,2}, {3,4} };
     for(int i=arry.length-1; i>=0; i-- ) {  //i=1 i=0 
         for(int j=0; j<arry.length; j++) {	 //j=0 j=1;
             System.out.println(arry[i][j]+" "); //[1][0] [1][1] 	[0][0]  [0][1]
             									// 3		4		1			2		
         }
     }
	    
	        
	        /*
	             10. Which statement is true about Java byte code?
	                  A.  it can run on any platform.
	            
	                  B. it can run on any platform only if it was compiled for that platform.
	            
	                  C. It can run on any platform that has the Java Runtime Environment.(correct)
	            
	                  D. It can run on any platform that has a Java compiler.
	                  
	         
	         */
	    
	}
}
