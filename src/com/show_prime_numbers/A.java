package com.show_prime_numbers;
import java.util.Scanner;
public class A {
	public static void main(String args[]) {
		//below scanner class used for user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number whithin you want to show the prime numbers:");
		int num=scan.nextInt();
		System.out.println("Below are all the prime numbers within"+" "+num+":");
		
		//below code to print prime numbers
		for(int i=1;i<=num;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}			
			if(count==2) {
				System.out.print(i+",");
			}			
		}
		
		//below code to print non prime numbers
		System.out.println();
		System.out.println("Below are the non prime numbers within"+" "+num+":");
		for(int i=1;i<=num;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count!=2) {
				System.out.print(i+",");
			}			
		}	
	}
}
