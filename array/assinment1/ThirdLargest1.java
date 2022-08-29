package com.yash.array.assinment1;

import java.util.Arrays;

public class ThirdLargest1 {
	
	public static void main(String[] args) {

		int arr[]= {5,6,9,7,8,4};
		int temp;
		for(int i=0;i<arr.length;i++) {
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if(arr[i]>arr[j]) {
		            temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		System.out.println("Third Largest Number :"+arr[arr.length-3]);
		}
	}

