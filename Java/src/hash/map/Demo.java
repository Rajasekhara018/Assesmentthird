package hash.map;

import java.util.HashMap;

public class Demo 
{

	public static void main(String[] args) 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("raja", "101");
		map.put("shekar", "101");
		map.put("Badam", "101");
		map.put("Reddy", "101");
		
		System.out.println(map);
		TemporaryDemo td = new TemporaryDemo();
		System.out.println(td);//if we call the object jvm wil call the toString() method internally.
		System.gc(); //garbage collector
		System.out.println(td.toString());
		
	}

}
