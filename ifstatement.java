package com.info.Java;
import java.util.Scanner;
public class ifstatement {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the num ");
		num = scanner.nextInt();
		if(num>0) {
			System.out.println(num +" is positive");
		} 
		
		
		if(num==0)
			System.out.println(num+" is neutral");
		else 
		{
			System.out.println(num +" is negative"); 
		}
		{ 

		}
	}
}