package com.Bridgelabz.Logical;

import java.util.Scanner;

import com.Bridgelabz.utility.Utility;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter count to print Fibonacci series");
		int count=scan.nextInt();
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i =2; i<count; i++)
		{
			 n3=n1+n2;    
			 System.out.print(" "+n3);    
			 n1=n2;    
			 n2=n3;    
		}

	}

}
