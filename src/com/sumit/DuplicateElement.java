package com.sumit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateElement {


	public static void main(String[] args) {
		int[] list = {1,1,3,1,2,2,1,1,2,3};
		DuplicateElement de = new DuplicateElement();
		de.findDuplicate(list);

	}
	
	private void findDuplicate(int a[]) {
		HashMap<Integer,Object> hm = new HashMap();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i != j) {
					hm.put(a[i], null);
					//System.out.println("duplicate element:"+a[i]);
				}
			}
			
		}
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry mapElement =  (Map.Entry)it.next();
			System.out.println(mapElement.getKey());
		}
		
	}
}
