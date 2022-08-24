package com.string.assingment1;


public class GarbageCollection7 {
	
	public void finalize()
	{
		System.out.println("finalize called");
	}
	
	public static void main(String[] args) {

		GarbageCollection7 gc = new GarbageCollection7();
		GarbageCollection7 gc1 = new GarbageCollection7();
		
		
		System.out.println(gc1.hashCode());
		
		
		// with Reference variable
			//gc=null;
			//gc1=null;
		
		// without Reference variable
		gc=gc1;
		System.out.println(gc.hashCode());
		
	System.gc();
	
	}

}
