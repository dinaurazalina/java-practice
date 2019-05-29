package day37_ArrayLisr;
import java.util.*;
public class MyCities {

	public static void main(String[] args) {
		
		ArrayList<String> myCities = new ArrayList<>();
		myCities.add("Tashket");
		myCities.add("Barnaul");
		myCities.add("Dushanbe");
		myCities.add("Sterling");
		myCities.add("Tashket");
		
		
		
		//print each city using for each loop separated by space
		
		for(String cit:myCities) {
			System.out.print(cit + " ");
		}
		
		System.out.println();
		for(int i =0; i< myCities.size(); i++) {
			System.out.print(myCities.get(i) +" ");
		}
		
		//remove Baku
		System.out.println();
		myCities.remove("Tashket");
		System.out.print("Removing Tashkent "+ myCities.toString());
		
		//isEmpty?
		System.out.println();
		System.out.println("Is list empty? " + myCities.isEmpty());
		
		
		
		myCities.add(0, "Seoul");
		System.out.println(myCities.toString());
		//replace one for another using index
		myCities.set(2, "Seoul");
		System.out.println(myCities.toString());
		
		//find Sterling in the list and give the index
		int idx = myCities.indexOf("Sterling");
		System.out.println("Sterling index: "+ idx);
		
		myCities.set(idx, "Zagreb");
		System.out.println(myCities.toString());
		
		myCities.clear();
		boolean empty = myCities.isEmpty();
		System.out.print("Is the list empty? - " + empty);
		
	}
}
