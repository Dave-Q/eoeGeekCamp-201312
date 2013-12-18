package com.eoe.exercise;

import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class Exercise08 {

	/**
	 * 编写程序，计算2^n，要求：
	   //a<<n;
	(1)n由键盘输入。
	(2)不能使用Math.pow()
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		System.out.println("2^n="+(1<<n));
		
		

	}

}
