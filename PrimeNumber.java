package com.Bridgelabz.Logical;

import java.util.Scanner;

import com.Bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Number to check Prime or not");
		int num=scan.nextInt();
	
			for(int i=2; i<num/2; i++) {
				if(num%i==0) {
					System.out.println(num+"is not prime number");
					prime=0;
					break;		
				}
			}

		
		if(prime==1) {
			System.out.println(num+" is prime number");
		}
		scan.close();
	}
}

