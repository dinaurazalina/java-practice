package day41_CustomClassewithArrays;

public class bankAccount {

	double balance;
	String accountHolder;
	int accountNum;
	
	public void deposit(double amount) {
		System.out.println("Depositing $" + amount +" to "+ accountNum);
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from "+ accountNum);
		balance-=amount;
		if(balance < 0) {
			balance-= 35;
		}
	}
	
	public void showBalance() {
		System.out.println(" ================================================");
		System.out.println("|	Account Holder: *"+accountHolder +"*	|");
		System.out.println("|	Account Number: "+ accountNum + "		|");
		System.out.println("|	Available balance: "+ balance +"		|");
		System.out.println(" ================================================");
	}
	
	public void charge(double price, String item) throws InterruptedException {
		if(price<=balance) {
			balance-=price;
			System.out.println("Buying " + item + " for $" + price+ " from "+accountNum);
			
			int n=0;
			while(n<4) {
				Thread.sleep(1000);
				System.out.print(".");
				n++;
				
			}
			System.out.println();
			System.out.println("Congatulations! Transaction was completed successfully!");
			System.out.println(item +" will be shipped in 2 business days");
		}else {
			System.out.println("***ERROR***");
			System.out.println("INSUFFUCIENT FUNDS!");
		}
		
	}
}
