package day49_inheritance_02;

import day49_inheritance.*;
//Non-sub class in different package
public class OverseasFactory {

	public static void main(String[] args) {
		device dv= new device();
		dv.brand = "Samsung";
	//	dv.model = "3200"; //it is not visible bc model is protected > it is non sub class in different package
	//	dv.price= 1000; is it  not visible bc it is default > it doesnt work in different packages
	//	dv.country = "China"; < < not visible, cuz its private
	}
}
