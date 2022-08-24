package com.string.assingment1;

public class AllocateMemoryString6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Yash ";
		System.out.println("where is "+str1+" hashcode "+str1.hashCode());
		String str2 = "Yash Magarpatta";
		System.out.println("where is "+str2+" hashcode "+str2.hashCode());
		String str3 = new String("Yash");
		System.out.println("where is "+str3+" hashcode "+str3.hashCode());
		String name="";
		System.out.println("where is "+name+" hashcode "+name.hashCode());
		
	}

}
