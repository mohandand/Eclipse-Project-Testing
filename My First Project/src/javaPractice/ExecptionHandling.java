package javaPractice;

public class ExecptionHandling {

	public static void main(String[] args)
	{
		//handling execption using try and catch bloc and executing entire program without terminating in middle
		
		System.out.println("start");
		try {
		int divide= 10/0;
		
		System.out.println(divide);
		}catch(Exception e)
		{
			System.out.println("Execption occured and remaing line executed as follows:");
		}
		
        System.out.println("Finish");
        
        // If we won't handle execption then after execption the code wont execute as follows:
        
        System.out.println("start");
        
		int divide= 10/0;
		
		System.out.println(divide);
        
		System.out.println("This line wont print");
	}

}
