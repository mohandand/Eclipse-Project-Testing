package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Example {

	public static void main(String[] args) {
		
		
		Map<String , String> map = new HashMap<String , String>();
		
		map.put("FirstName", "Mohan");
		map.put("LastName", "Dandigam");
		System.out.println(map);
		System.out.println(map.get("FirstName"));
		
		//printing all values based on key name
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
			
		{
			System.out.println("Key is"+key+"Value is  "+map.get(key));
		}
		

	}

}
