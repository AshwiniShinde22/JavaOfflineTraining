package com.yash.exception.ques10;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 2, 5, 6, 10 };
		Parent p = new Parent();
		p.largest(arr);
		Child c = new Child();
		c.largest(arr);

	}

}
