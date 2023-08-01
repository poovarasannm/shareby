package com.info.Java;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {

		//for loop
		//		for (int i = 0; i <5; i++) {
		//			System.out.println("Hai Divya");
		//			
		//		}
		//


		// while loop
		//	  int i=5;
		//	  while (i<10) 
		//	  {
		//		System.out.println("Divi");
		//		i++;
		//	}
		//	


		//dowhile loop concept
		//	  int j=2;
		//	  do {
		//		  System.out.println(" Divi ");
		//		  j++;
		//	  }  
		//		  while (j<9); 

		//nested for loop


		//		for (int i=1; i<=5; i++) {
		//			for (int j=1; j<=i; j++) {
		//
		//				System.out.print(" @ ");
		//			}
		//			System.out.println(" ");
		//		}
		//	

		//Nested for loop using scanner class
//		int a,i,j;
//		Scanner input=new Scanner(System.in);
//		a=input.nextInt();
//
//		for (i=1; i<=a; i++) {
//			for (j=1; j<=i; j++) {
//				System.out.print(i);
//			}
//
//			System.out.println(" ");
//		}
		
//    pyramid using while loop
		
//		int rows = 5, k = 0;
//
//	    for (int i = 1; i <= rows; ++i, k = 0) {
//	      for (int space = 1; space <= rows - i; ++space) {
//	        System.out.print("  ");
//	      }
//
//	      while (k != 2 * i - 1) {
//	        System.out.print();
//	        ++k;
//	      }
//
//	      System.out.println();
//	      
//	      
//	      
//	    }
//	}
//	
//	
// }
	    int rows = 5, k = 0, count = 0, count1 = 0;

	    for (int i = 1; i <= rows; ++i) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	        ++count;
	      }

	      while (k != 2 * i - 1) {
	        if (count <= rows - 1) {
	          System.out.print((i + k) + " ");
	          ++count;
	        } else {
	          ++count1;
	          System.out.print((i + k - 2 * count1) + " ");
	        }

	        ++k;
	      }
	      count1 = count = k = 0;

	      System.out.println();
	    }
	  }
	}

		
		
		
		








