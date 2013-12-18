package com.eoe.exercise;

public class Exercise02 {

	/**
	 * 不用第三个变量，用减法实现两个变量值互换。
	 */
	public static void main(String[] args) {
		 
		 int  a=32;
		 int  b=25;
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("a="+a+" "+"b="+b);
		 

	}

}
