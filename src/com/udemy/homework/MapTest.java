package com.udemy.homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> mp = new HashMap<>();

		mp.put(12, "juju");
		mp.put(2, "shanu");
		mp.put(17, "balak");
		mp.put(26, "bhuru");
		mp.put(5, "gudu");

		for (Map.Entry ep : mp.entrySet()) {
			System.out.println(ep.getKey() + " " + ep.getValue());
		}

		System.out.println("**********Before Sorting With Iterator***********");
		Iterator iterator = mp.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry pm = (Map.Entry) iterator.next();
			System.out.println(pm.getKey() + " " + pm.getValue());

		}
		System.out.println("*********After Sorting***********");

		Map<Integer, String> tMap = new TreeMap<>(mp);

		Iterator iterator1 = tMap.entrySet().iterator();

		while (iterator1.hasNext()) {
			Map.Entry pm = (Map.Entry) iterator1.next();
			System.out.println(pm.getKey() + " " + pm.getValue());
		}

		System.out.println("*********Sorting according to values***********");

		Map<Integer, String> sortMap = sortByValues(mp);

		Iterator iterator2 = sortMap.entrySet().iterator();

		while (iterator2.hasNext()) {
			Map.Entry pm = (Map.Entry) iterator2.next();
			System.out.println(pm.getKey() + " " + pm.getValue());
		}
	}

	private static HashMap sortByValues(HashMap map) {
		List list = new LinkedList(map.entrySet());

		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}

		});

		HashMap sortedHashMap = new LinkedHashMap();

		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;

	}

}
