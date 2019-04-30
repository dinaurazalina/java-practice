
			
			
			System.out.println("Select storage type:");
			storageType = scan.next();
			System.out.println("Enter memory size:");
			memorySize = scan.nextInt();
			
			switch (storageType) {
			case "HDD" :
				price = price +( memorySize/500)*50;
			case"SSD" :
				price = price +( memorySize/500)*100;
			}
			
		
			
			System.out.println("Enter screen resolution:");
			String screenResolution = scan.next();
			switch (screenResolution) {
			case "FULLHD":
				price +=100;
				
			case "4K":
				price+=200;
			}
	
	
	}
	

}
