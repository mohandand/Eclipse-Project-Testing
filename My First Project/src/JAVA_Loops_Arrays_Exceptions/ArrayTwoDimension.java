package JAVA_Loops_Arrays_Exceptions;

public class ArrayTwoDimension {

	public static void main(String[] args) {
		
		int[][] array1=new int[2][3];
		
		array1[0][0] =10;
		array1[0][1] =20;
		array1[0][2] =30;
		array1[1][0] =40;
		array1[1][1] =50;
		array1[1][2] =60;
		
		//Printing single element based on index
		
		System.out.println(array1[1][2]);
		
		//printing all elements using for loop
		
		for(int i=0;i<2;i++)
		{
		
	        for(int j=0;j<3;j++)
	        {
	        	System.out.println(array1[i][j]);
	        }

	    }
		
		//printing all elements using for loop and by not varblizing legth
		
		
				for(int i=0;i<array1.length;i++)
				{
				
			        for(int j=0;j<array1[i].length;j++)
			        {
			        	System.out.println(array1[i][j]+"");
			        }
                 //to go to next line after executing innerloop
			        
			        System.out.println();
			    }
	}
 
}
