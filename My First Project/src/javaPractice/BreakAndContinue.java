package javaPractice;

public class BreakAndContinue {
	

	public static void main(String[] args) {
		
		//break can be used only when loops and switch cases are used
		//break will be used to get out of the loop based on certain conditions
		for(int i =0;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		//continue can only be used with loops only
	
		for(int j=0;j<=0;j++)
		{
			if(j>=0)
				continue;
			System.out.println(j);
			
		}
		System.out.println("outside loop");
		
		/*continue is used to skip some iterations in a loop for example if you want to execute
		1 to 10 numbers execpet 5 to 8 then we can use continue as follows
		*/
		
		for(int k=0;k<=10;k++)
		{
			if(k>=5 && k<=8)
				continue;
			System.out.println(k);
			
		}
		
		
		
		
	}

}
