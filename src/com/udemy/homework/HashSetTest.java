package com.udemy.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<>();

		hset.add("juju");
		hset.add("buju");
		hset.add("kuku");
		hset.add("babu");
		hset.add("cutie");

		Iterator i = hset.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("**************HashSet to Array***********");
		String[] arr = new String[hset.size()];

		hset.toArray(arr);

		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println("**************HashSet to TreeSet***********");

		Set<String> treeSet = new TreeSet<>(hset);

		for (String tstre : treeSet) {
			System.out.println("Tree Set converted : " + tstre);
		}

		System.out.println("**************HashSet to ArrayList***********");

		List<String> list = new ArrayList<>(hset);

		for (String lt : treeSet) {
			System.out.println("Tree Set converted : " + lt);
		}

		System.out.println("**************HashSet to LinkedHashSet***********");

		LinkedHashSet<String> linkedhset = new LinkedHashSet<>(hset);

		for (String linked : linkedhset) {
			System.out.println("Tree Set converted : " + linked);
		}

	}
}
