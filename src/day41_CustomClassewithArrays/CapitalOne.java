package day41_CustomClassewithArrays;

public class CapitalOne {
public static void main(String[] args) throws InterruptedException {
	bankAccount myBa = new bankAccount();
	myBa.accountHolder ="Ms. Dina Urazalina";
	myBa.accountNum = 25347689;
	myBa.balance = 0;
	
	myBa.deposit(25000);
	myBa.showBalance();
	myBa.withdraw(1000);
	myBa.showBalance();
	
	myBa.charge(2000, "Gucci Bag");
	myBa.showBalance();
	
	
}
}
