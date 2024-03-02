package AllinOne;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacters {
	public static void main(String[] args) {
		int a[]= {1,5,9,7,1,9,7,5,9,10,10,10};
		HashMap<Integer, Integer>hm= new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}
			else {
				hm.put(a[i], 1);
			}
		}
		for(Map.Entry entry:hm.entrySet()) {
			System.out.println(entry.getKey()+ "  : " +entry.getValue());
		}
	}

}
