package JAVA_Loops_Arrays_Exceptions;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		int Count=0;
		
		while(i<=3)
		{
			for (int j=0;j<=4;j++)
			{
				int  k=0;
				do {
					
					System.out.println("I is:"+i+" J is:"+j+" K is:"+k);
					k++;
					Count++;
					
				   }while(k<=5);
			
			}
			i++;
			
		}
System.out.println("number of loops:"+Count);
	}

}
