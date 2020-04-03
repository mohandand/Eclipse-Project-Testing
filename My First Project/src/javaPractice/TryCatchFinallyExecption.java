package javaPractice;

public class TryCatchFinallyExecption {

	public static void main(String[] args) {
		
		System.out.println("start");
		try {
		int divide= 10/0;
		
		System.out.println(divide);
		}catch(Exception e)
		{
			System.out.println("Execption occured and remaing line executed as follows:");
		}
		
		finally {
			System.out.println("No matter what whether try/catch is ececuted or not but all lines with in finally block will be executed");
		}

	}

}
