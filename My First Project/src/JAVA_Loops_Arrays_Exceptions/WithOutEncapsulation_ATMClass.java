package JAVA_Loops_Arrays_Exceptions;

public class WithOutEncapsulation_ATMClass {

	public static void main(String[] args) {
		
		//created object for WithOutEncapsulation_BankClass class and acessedwithDrawAmount method as follows
		
		WithOutEncapsulation_BankClass obj=new WithOutEncapsulation_BankClass();
		
		obj.withDrawAmount(123456,123 , 1000);
		
		/*if you uncomment below lines and comment above lines then you can access above method after changing pin as well and 
		youcan with draw money after updating pin like below
		*/
		
		//obj.pinNo=222;
		
		//obj.withDrawAmount(123456,222,1000);

	}

}
