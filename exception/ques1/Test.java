package com.yash.exception.ques1;

import java.util.Scanner;
import java.util.logging.Logger;

import com.yash.javatraining.exception.MultipaleCatch;
/**
 * 
 * @author ashwini.s
 *
 */
public class Test extends StudentResult {


	static Logger logger = Logger.getLogger(MultipaleCatch.class.getName());
	
	private void checkResult( Student st) throws ResultException {
		StudentResult s = st.getSrobj();
		double s1 = s.getSub1();
		double s2 = s.getSub2();
		double s3 = s.getSub3();
		double s4 = s.getSub4();
		double s5 = s.getSub5();

		double totalMarks =  s1+s2+s3+s3+s4+s5;
		
	    double percentage = totalMarks/500*100;
		if(percentage<40||s1<40||s2<40||s3<40||s4<40||s5<40)
		{
			throw new ResultException("Student fail");
		}
	else {
		System.out.println("Student pass :"+percentage);
	}
	   
	}
	
	public static void main(String[] args) throws ResultException {
		
		
		Test t = new Test();
		StudentResult marks = new StudentResult(89, 87, 88, 48, 50, 78);
		Student s = new Student(1, "Ashwini","pune", marks);
		//t.checkResult(s);
		t.checkResult(s);
			
		
	}
	

}
