package javaPractice;

public class Encapsulation_ATMClass {
	
	//Accessed private instance variables of another class using a public method of another class.

	public static void main(String[] args) {
		
     Encapsulation_BankClass obj=new Encapsulation_BankClass();
     
        obj.updatePin(123456,123,222);
		
		obj.withDrawAmount(123456,222, 1000);
		

	}

}
