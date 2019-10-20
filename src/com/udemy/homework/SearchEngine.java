package com.udemy.homework;

import java.util.ArrayList;
import java.util.Iterator;

class StringQuery {
	private String name;
	private int value;

	public StringQuery(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "StringQuery [name=" + name + ", value=" + value + "]";
	}

}

public class SearchEngine {

	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int t = ob.nextInt();

		ArrayList<StringQuery> list = new ArrayList<>();

		// System.out.println(ob.next());
		while (t-- > 0) {

			if (list.isEmpty()) {
				StringQuery query = new StringQuery(ob.next(), 1);
				list.add(query);
			} else {
				System.out.println("size: "+list.size());
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(ob.next())) {
						list.get(i).setValue(list.get(i).getValue() + 1);
					}else {
						StringQuery query = new StringQuery(ob.next(), 1);
						list.add(query);
					}
				}
				list.stream().forEach(null);
				/*for (StringQuery p : list) {
					if (p.getName().equals(ob.next())) {
						System.out.println(p.getValue());
						// p.setValue(p.getValue() + 1);
					} else {
						StringQuery query = new StringQuery(ob.next(), 1);
						list.add(query);
					}
				}*/
			}
		}
		for (StringQuery stringQuery : list) {
			System.out.println(stringQuery);
		}
	}

}
