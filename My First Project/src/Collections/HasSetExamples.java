package Collections;

import java.util.HashSet;
import java.util.Set;

public class HasSetExamples {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Mohan");
		
		set.add("Selenium");
		
		set.add("Appium");
		
		set.add("Mohan");
		
	System.out.println(set);
	
	for(String var: set)
		
	{
		System.out.println(var);
	}

	}

}
