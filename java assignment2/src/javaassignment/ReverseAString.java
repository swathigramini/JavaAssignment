package javaassignment;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("Enter a String !!");
	  
	  String text = sc.next();
	  
	  char [] text1 = text.toCharArray();
	  
	  for(int i = text1.length-1 ; i>=0 ; i--) {
		  System.out.println(text1[i]);
	  }
	   
	}
}
