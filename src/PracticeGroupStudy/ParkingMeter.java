package PracticeGroupStudy;

	public class ParkingMeter{
		  private int timeLeft =0;
		  private int maxTime;
		  
		  public ParkingMeter(int maxTime){
		    this.maxTime = maxTime;
		  }
		  public boolean add (int time){
		  
		   boolean wasAdded = true;
		   if(timeLeft <= maxTime){
		    if(time == 25){
		      timeLeft+=30;
		      wasAdded = true;
		    }
		  }else{
		    wasAdded = false;
		  }
		    return wasAdded;
		  }
		  
		  public void tick(){
		    if(timeLeft > 0){
		    timeLeft--;
		      
		    }
		  }
		  
		  public boolean isExpired(){
		    boolean isExpired =true;
		    if(timeLeft !=0){
		      isExpired = false;
		    }
		    return isExpired;
		  }
		}

