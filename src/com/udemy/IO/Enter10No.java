package com.udemy.IO;

import java.util.Scanner;

public class Enter10No {

	public static void main(String[] args) {
		//create scanner instance
		Scanner sc = new Scanner(System.in);
		
		//ask user for input
		int counter=0;
		int sum=0;
		
		while(true) {
			int order = counter+1;
			System.out.println("Enter no #"+order+":");
			
			boolean isAnInt = sc.hasNextInt();
			if(isAnInt) {
				sum += sc.nextInt();
				counter++;
				if(counter==5)
					break;
			}else {
				System.out.println("Invalid Number");
			}
			sc.nextLine();
		}
		System.out.println("sum: "+sum);
		//close scanner
		sc.close();
	}

}
