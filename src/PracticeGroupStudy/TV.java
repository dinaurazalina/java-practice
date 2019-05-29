package PracticeGroupStudy;
	public class TV {
		 private int channel = 1;
		 private int volumeLevel = 1;
		 private boolean on = false;
		 private String brand  = "undefined";

		public String toString() {
			return "TV [channel=" + channel + ", volumeLevel=" + volumeLevel + ", on=" + on + ", brand=" + brand + "]";
		}
		public TV (){
		  System.out.println("Creating TV object using no Args- constructor");
		}
		public TV (String brand){
		  System.out.println("Creating TV object using 1 arg - constructor");
		  this.brand = brand;
		}
		  
		  public void setVolumeLevel(int volumeLevel){
		    if(volumeLevel >0 && volumeLevel<8 && on == true) {
		    this.volumeLevel = volumeLevel;
		    }else{
		      System.out.println("ERROR: TV is either OFF or invalid Volume level");
		    }
		  }
		  
		  public int getVolumeLevel(){
		    return volumeLevel;
		  }
		  
		  public void setChannel(int channel){
		    if(channel >0 && channel < 120){
		    this.channel = channel;
		    }else{
		      System.out.println("ERROR: TV is either OFF or invalid Channel");
		    }
		  }
		  
		  public int getChannel(){
		    return channel;
		  }

		  public void setBrand(String brand){
		    this.brand = brand;
		  }
		  
		  public String getBrand(){
		    return brand;
		  }
		  
		  public void channelUp(){
		  channel++;
		  
		  }
		  public void channelDown(){
		  channel--;
		  }
		  public void volumeUp(){
		    volumeLevel++;
		  }
		  public void volumeDown(){
		    volumeLevel--;
		  }
		  public boolean isOn(){
		   return on;
		  }
		  public void turnOff(){
		    if(on){
		      on = true;
		    }else{
		      System.out.println("TV is already ON");
		    }
		  }
		  public void turnOn(){
		  if(on){
		    System.out.println("TV is already OFF");
		  }else{
		    on = true;
		  }
		  }
		  
		  
		  
		  
		  
		}

