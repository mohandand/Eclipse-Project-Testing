package Collections;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();
		
    //Before adding data
		
	System.out.println(list);
	
	//Intiale Size
	

	System.out.println(list.size());
		
		
//in below add method taking parameter as object please keep courser on add to check that
		
	//In the bleow all primitive values are converted to object of respective classes such as Integer , Character
		
/*And those classes are having polymorphic reference with Object super class and
	  thats the reason we can able to give alltypes of values in list and using Wraping/Autoboxing its converting
	 */
		list.add(10);
		list.add("Mohan");
		list.add('e');
		list.add(true);
		list.add(null);
		list.add(10.555);
		list.add("Mohan");
		
		//After adding data
		
		System.out.println(list);
		
		System.out.println("Sizeafter adding data");
		
		System.out.println(list.size());
		
		//Fetching values from list
		
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		
		//Remving values from list
		
		list.remove(3);
		
		System.out.println(list);
		
		//Printing all values of list
		
		for(int i =0 ; i<list.size();i++)
			
		{
	
			System.out.println(list.get(i));
		}
		
	

	}

}
