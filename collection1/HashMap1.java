package collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Naruto");
		hm.put(2, "Hunter");
		hm.put(3, "Erased");
		System.out.println(hm);
		System.out.println(hm.size());
		
		Set<Integer> ks=hm.keySet();
		System.out.println(ks);
		
		Collection<String> cv=hm.values();
		System.out.println(cv);
		
		Set<?> entry=hm.entrySet();
		System.out.println(entry);
		
		System.out.println(hm.containsKey(1));

	}

}
