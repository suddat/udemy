package com.udemy.controlflow;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumberToWords {
	public static void main(String args[]) {
		System.out.println(getLargestPrime(21));
		String str = "suddat shende";
		char[] charArr = new char[str.length()];
		charArr = str.toCharArray();
		Map<Character, Integer> store = new LinkedHashMap<>();
		
		for (char c : charArr) {
			if(c==' ')
				continue;
			if(store.containsKey(c)) {
				store.put(c, store.get(c)+1);
			}else {
				store.put(c, 1);
			}
		}
		
		for(char a : store.keySet()) {
			System.out.println(a+" ->"+ store.get(a));
		}
	}
	
	public static int getLargestPrime(int number){
        if(number <=1)
            return -1;
        for (int i = number; i > 1; i--) {
 
            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}
