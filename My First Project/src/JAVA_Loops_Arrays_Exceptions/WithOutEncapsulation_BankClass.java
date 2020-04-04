package JAVA_Loops_Arrays_Exceptions;


//below details are accessible in some other class as well here we accessed in WithOutEncapsulaion_ATMClass

/*There we can change pin and and account number as well but which should not happen in real time thats why we are 
using encpsulation concept in some other class with name Encapsulatio_Bank and ATM classes
*/
public class WithOutEncapsulation_BankClass {

	 		public int accountNo=123456;
		
		public int pinNo=123;
		 
		public double balanceAmount=10000;
		
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


