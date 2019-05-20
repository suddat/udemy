package com.udemy.controlflow;

public class Sum3And5 {

	public static void main(String[] args) {
		int cnt=0, sum=0;
		for(int i=1;i<=1000;i++) {
			if(i%3==0&&i%5==0) {
				cnt++;
				sum +=i;
				if(cnt ==5)
					break;
			}
		}
		System.out.println(sum);
	}

}
