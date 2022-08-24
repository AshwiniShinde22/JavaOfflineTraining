package com.string.assingment1;

import java.util.Scanner;

public class ReplaceStringIndex1 {

	public static void main(String[] args) {

		 Scanner scr=new Scanner(System.in);
	        
	        System.out.println("Enter Fisrst String");
	        String s1=scr.next();
	        StringBuffer sb1=new StringBuffer(s1);
	        
	        System.out.println("Enter Second String");
	        String s2=scr.next();
	        StringBuffer sb2=new StringBuffer(s2);
	        
	        System.out.println("Enter a Index on which you want to insert 2nd string");
	        int c=scr.nextInt();
	        StringBuffer out=sb1.insert(c, s2);
	        
	        System.out.println("final String "+out);
	        
        }
	}


