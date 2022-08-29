package com.yash.string.assingment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountNoOfAlphabets4 {

	public static void main(String[] args) {

		String str = "Ashwini";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j < str.length(); j++) {
          if (inp[i] == inp[j]) {
        	  
           System.out.println(inp[j]);
          cnt++;
           break;
          }
          
         }
        }
        
        
//		String s = "AShwini";
//        String[] sr = s.split("");
//
//       Map<String, Integer> map = new HashMap<String, Integer>();
//
//   for (int i = 0; i < sr.length; i++) {
//            if (map.containsKey(sr[i])) {
//         int count = map.get(sr[i]);
//                map.put(sr[i], count + 1);
//
//           } else {
//                map.put(sr[i], 1);
//
//           }   
//       }
//        System.out.println(map);
//
//	  }
	}
	}


