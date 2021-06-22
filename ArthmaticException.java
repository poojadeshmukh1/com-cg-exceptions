package com.cg.demo.exception;

public class ArthmaticException extends Exception {
	  public static void main(String args[])
	    {
	        try {
	            int a = 30, b = 0;
	            int c = a/b;  // cannot divide by zero
	            System.out.println ("Result = " + c);
	        }
	        catch(ArithmeticException e) {
	            System.out.println ("Can't divide a number by 0");
	        }
		  //edited
	    }


}

© 2021 GitHub, Inc.
