package javaPractice;

public class ArrayOneDimension {

	public static void main(String[] args) {
		
		int[] array1=new int[5];//declaring array for integer values with size 5
		
		String[] array2= new String[10];//declaring array for String values with size 10
		
		System.out.println(array1);//print loation of object
		
		System.out.println(array2.length);//print length of array
		
		//intilizing values to an array
		
		array1[0]= 10;
		array1[1]= 15;
		array1[4]= 20;
		
		//printing single array element based on index
		
		System.out.println(array1[1]);
		
		//Printing all the values of arrays using for loop
		
		for(int index=0;index<=array1.length;index++)
		{
			System.out.println(array1[index]);
		}
		
		
		
		
		
		
	
	}

}
