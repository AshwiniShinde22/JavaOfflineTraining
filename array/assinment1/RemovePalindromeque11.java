package com.yash.array.assinment1;

public class RemovePalindromeque11 {
	          			
	   public static String Palindrome(String reverse) {

	          String temp = reverse;
	          String rev = "";
	          for (int i = temp.length() - 1; i >= 0; i--) {

	              rev = rev + temp.charAt(i);
	          }
	          return rev;
	      }
	public static void main(String[] args) {

		 String[] arr = { "yash", "pune", "magarpatta", "technology","mam"};


         for (int i = 0; i < arr.length; i++) {

             if (arr[i].equalsIgnoreCase(Palindrome(arr[i]))) {

                 System.out.print(arr[i] + " ");

             }
         }
	}
}
