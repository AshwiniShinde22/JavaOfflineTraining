package com.yash.assign2.ques4;

import java.util.Scanner;
import java.util.logging.Logger;

public class Area {
	static Logger logger = Logger.getLogger(Area.class.getName());
	 static Scanner sc = new Scanner(System.in);



	 public void areaofTriangle()
	  {
	          logger.info("Enter the base: ");
	        int base = sc.nextInt();
	        logger.info("Enter the height: ");
	        int height = sc.nextInt();
	        double area = (0.5) * (base * height);
	        logger.info("The area of triangle is: "+area);  
	  }
	  public void areaOfSquare()
	  {
	      double a,s;
	      logger.info("Enter the side of the square:");
	      s = sc.nextDouble();
	      a = s*s;
	      logger.info("Area of the square is: " + a);            
	  }
	  public void areOfRectangle()
	  {
	      double width, height, Area;
	        
	      logger.info(" Please Enter the Width of a Rectangle =  ");
	        width = sc.nextDouble();
	        logger.info(" Please Enter the Height of a Rectangle = ");
	        height = sc.nextDouble();
	        Area = width * height;
	        System.out.format(" The Area of a Rectangle = %.2f\n",Area);



	 }
	  public static void main(String[] args)
	  {
	      int noOfSides;
	      Area a =new Area();
	      
	           System.out.println("please Enter the sides of shape: ");
	           System.out.println("please enter 1 if you want to print the are of Square");
	           System.out.println("please enter 3 if you want to print the are of Traingle");
	           System.out.println("please enter 2 if you want to print the are of Rectangle");
	           noOfSides =sc.nextInt();
	           if(noOfSides == 1)
	           {
	               a.areaOfSquare();
	           }
	           else if(noOfSides == 3)
	           {
	               a.areaofTriangle();
	               
	           }
	           else
	           {
	               a.areOfRectangle();
	           }



	   }
	      

}
