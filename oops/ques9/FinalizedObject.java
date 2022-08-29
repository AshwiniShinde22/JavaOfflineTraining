package com.yash.oops.ques9;

public class FinalizedObject {
	public static void main(String[] args) {
		FinalizedObject obj = new FinalizedObject();
	        System.out.println("Hashcode of object= " + obj.hashCode());
	        obj = null;
	        // calling garbage collector
	        System.gc();
	        System.out.println("end of garbage collection");

	   }
	   protected void finalize() {
	        System.out.println("finalize method called");
	}

}
