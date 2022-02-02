package com.Bridgelabz.Logical;

import java.util.Scanner;

public class Coupon {

    public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }

    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  
        int count = 0;                           
        int distinct  = 0;                       

        while (distinct < n) {
            int value = getCoupon(n); 
            count++;                  
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }


    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Enter a number");
    	int n=scan.nextInt();
        int count = collect(n);
        System.out.println("Count is "+count);
    } 
} 
