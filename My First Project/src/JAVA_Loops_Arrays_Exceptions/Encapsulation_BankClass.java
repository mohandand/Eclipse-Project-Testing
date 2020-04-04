package JAVA_Loops_Arrays_Exceptions;

public class Encapsulation_BankClass {
	
	//To Implement encapsulation we have did following actions
	//1.Changed instnace variable to Private
	//2.Created public methods in same class and utilized private variables
	//3.if you want you can change mehhods to getter and setter

	public int accountNo=123456;
	
	private int pinNo=123;
	 
	private double balanceAmount=10000;
	
		
	public void updatePin(int accNo, int oldPin, int newPin)

    {
			
			if(accNo==accountNo&&oldPin==pinNo)
				
			{
				pinNo=newPin;
				System.out.println("pin changed sucessfully");
			}
			
			else
			{
				System.out.println("Invalid Credentials");
			}
				
				
		}

	
	
		public void withDrawAmount (int accNo, int pin, int amount)
	
	{
		if(accNo==accountNo&&pin==pinNo)
		{
			if (amount<=balanceAmount)
				
			{
				balanceAmount=balanceAmount-amount;
				System.out.println("Amount withdrwal:"+amount);
				
			}
			else
			{
				System.out.println("Insuffecient balance");
				
			}
		}
		
		else
		{
			System.out.println("Invalid Credentials");
		}
		
		
		
		
	
			
	}
	
	

	

}
