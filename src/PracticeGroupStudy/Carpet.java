package PracticeGroupStudy;

public class Carpet {
	
		 //do not change -- Start
		  public double width,length,unitPrice,totalPrice;
		  public boolean isPersian;
		 //do not change -- End
		 
		 //Add constructors below
		   
		   public Carpet(){
		     width = 300;
		     length = 300;
		     totalPrice= 200;
		     unitPrice = 0;
		     
		   }
		   public Carpet(double width, double length, double unitPrice, boolean isPersian){
		     
		     this.width = width;
		     this.length = length;
		     this.unitPrice = unitPrice;
		     this.isPersian = isPersian;
		     totalPrice = width * length * unitPrice;
		     if(isPersian){
		       totalPrice+=200;
		     }else {
		    	 unitPrice = 0;
		     }
		   }
		  
		  
		}

