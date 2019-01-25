package com.collections.arraylist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class HashMapSample {

	public static void main(String args[]) {
		HashMap<String, String> test = new HashMap<String, String>();

		test.put("1", null);
		test.put("2", null);
		test.put(null, "Ram");
		test.put(null, "Shiva");

		for (Map.Entry<String, String> e : test.entrySet()) {

			System.out.println(" Key :" + e.getKey() + " Value :" + e.getValue() + " HashCode :" + e.hashCode());
		}

		LinkedHashMap<Integer, String> lhash = new LinkedHashMap<Integer, String>();

		lhash.put(1, "Shiva");

		lhash.put(2, "Barath");

		for (Entry<Integer, String> e : lhash.entrySet()) {
			System.out.println(" Key :" + e.getKey() + " Value :" + e.getValue() + " HashCode :" + e.hashCode());
		}

		// Hashtable

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(2, "A");
		ht.put(1, "B");
		ht.put(3, "c");
 
		ht.put(null, "rj");
		ht.put(5, "shiva");
		
		// while Iterate data we need to convert hashtable  to Set 
		Set<Integer> keys = ht.keySet();
        for(Integer key: keys){
            System.out.println("Value of "+key+" is: "+ht.get(key));
        }
	
		System.out.println("Hashtable : " + ht.toString());

		// HashSet
		HashSet<String> hset = new HashSet<String>();

		hset.add("shiva");

		hset.add("shiva");
		hset.add("ram");
		Iterator<String> itr = hset.iterator();

		while (itr.hasNext()) {
			System.out.println("HashSet Values :" + itr.next());

		}

		System.out.println("HashSet :" + hset.toString());
		
		
		// TreeSet
		TreeSet<String> tset = new TreeSet<String>();

		tset.add("Balaji");

		tset.add("Venkatesh");
		tset.add("Balaji");
		System.out.println("TreeSet :" + tset.toString());

		Iterator<String> titr = tset.iterator();

		while (titr.hasNext()) {
			System.out.println("HashSet Values :" + titr.next());

		}

		// TreeMap

		// Queue

		// PriorityQueue

		// SortedSet

	}

}
