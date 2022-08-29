package com.yash.oops.ques7;

import java.util.Scanner;

public class CopareString implements StringInterface {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str1 = sc.next();
String str2 = sc.next();
      System.out.println("Enter String");

		
		
	}

	@Override
	public String checkString() {
		
		String str1 = null,str2 = null;
		if(str1.equals(str2))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
		return str2;		
	}

}
