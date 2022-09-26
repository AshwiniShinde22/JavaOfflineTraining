package com.yash.exception.ques3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class TryWithResource {

	static Logger logger = Logger.getLogger(TryWithResource.class.getName());
	public static void main(String[] args) {

		System.out.println("Enter Name: ");
        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in)))
        {
            String str =br.readLine();
            System.out.println(str);
        }
        catch (Exception e)
        {
           System.out.println(e);         
	}
        

	}
}

