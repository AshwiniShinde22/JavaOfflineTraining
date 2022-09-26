package com.yash.exception.ques8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class PasswordException {

	static Logger logger=Logger.getLogger(PasswordException.class.getName());
	public static void main(String[] args) throws PasswordFormatException {
		BasicConfigurator.configure();
	    
	    Scanner obj=new Scanner(System.in);
	    logger.info("Enter your password");
	    String name=obj.nextLine();
	    printpassword(name);
	    
	}
	 public static void printpassword(String input) throws PasswordFormatException {

		 int n=input.length();
		 boolean specialChar=false,isLower=false,isUpper=false,isDigit=false;
		 Set<Character>charNames=new HashSet<Character>(Arrays.asList('!','@','#','$','%','^','&','*','~','+','?'));


		 for(char i:input.toCharArray()) {
		     if(charNames.contains(i))
		         specialChar=true;
		         if(Character.isLowerCase(i))
		             isLower=true;
		         if(Character.isUpperCase(i))
		             isUpper=true;
		         
		         if(Character.isDigit(i))
		             isDigit=true;
		                     }
		 logger.info("Strong password should be:");
		 if (isDigit && isLower && isUpper && specialChar && (n >= 8)&&(n<=14) || isDigit &&
		 isLower && isUpper && specialChar && (n >= 8)&&(n<=14)) {
		 System.out.println("Your password is Strong .proceed.....");
		 }
		 else {
		           throw new PasswordFormatException("your password is weak.plz try again better...."); }
		     }
		
		 }
