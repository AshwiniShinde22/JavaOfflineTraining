package com.yash.collection.q7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.yash.exception.ques1.ResultException;

public class TestStudentInfo {
	
	 public static void main(String[] args) {
	        @SuppressWarnings("resource")
	        List<StudentInfo> StudentInfoList = Arrays.asList(new StudentInfo(101, "someshwar", 45), new StudentInfo(102, "mahesh", 40),
	                new StudentInfo(103, "anurag", 70), new StudentInfo(104, "nikhil", 75));
	        List<Double> collect2 = StudentInfoList.stream().map(StudentInfo::getAvg).collect(Collectors.toList());
	        List<Double> firstThreeNumbers = collect2.stream().sorted().collect(Collectors.toList());
	        firstThreeNumbers.forEach(System.out::println);
	        List<StudentInfo> nameBelowFiftyMarks = StudentInfoList.stream().filter(s -> s.getAvg() < 50)
	                .collect(Collectors.toList());
	        nameBelowFiftyMarks.forEach(System.out::println);
	        List<StudentInfo> nameBelowThirtyfive = StudentInfoList.stream().filter(s -> s.getAvg() < 35)
	                .collect(Collectors.toList());
	        nameBelowThirtyfive.forEach(System.out::println);
	        List<String> byName = StudentInfoList.stream().map(StudentInfo::getSname).collect(Collectors.toList());
	        byName.forEach(System.out::println);
	    }
}
