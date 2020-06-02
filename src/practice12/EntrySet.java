package practice12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EntrySet {

	public static void main(String[] args) {
		Map<Integer,String> m= new HashMap<>();
		m.put(1,"ram");
		m.put(2,"jag");
		m.put(3,"sudha");
		
		for(Entry<Integer,String> mm:m.entrySet()) {
			System.out.println(mm.getKey()+" "+mm.getValue());
		}

	}

}
