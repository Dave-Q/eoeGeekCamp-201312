package com.eoe.exercise;

import java.util.Scanner;

public class Exercise09 {

	/**
	 * 键盘输入一个int类型的负数，求出该数的补码。
	 */
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("a=");
		 int a=scanner.nextInt();
		 System.out.println("a的补码："+(~a+1));

	}

}
