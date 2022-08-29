package com.yash.array.assinment1;

import java.util.Scanner;
import java.util.logging.Logger;

public class VowelCountQues8 {

	static Logger logger= Logger.getLogger(VowelCountQues8.class.getName());
	public static void main(String[] args) {

		
		logger.info("Enter character");
		Scanner sc= new Scanner(System.in);
		char arr1[]=sc.next().toCharArray();
		char arr[];
		int vcount=0,ccount=0,i;
		for( i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]== 'a'||arr1[i]== 'A'|| 
			arr1[i]=='e'|| arr1[i]== 'E'||
			arr1[i]=='o'|| arr1[i]== 'O'||
			arr1[i]=='i'||arr1[i]== 'I'||
			arr1[i]=='u'||arr1[i]== 'U')
			{
				logger.info("vowels="+arr1[i]);
			}
		else if(arr1[i]!= 'a'|| arr1[i]!= 'A'||
			    arr1[i]!='e'|| arr1[i]!= 'E'||
			    arr1[i]!='o'||arr1[i]!= 'O'||
				arr1[i]!='i'|| arr1[i]!= 'I'||
				arr1[i]!='u'||arr1[i]!= 'U')
			{
				logger.info("Consonants="+arr1[i]);
			}
		}
		
	}

}
