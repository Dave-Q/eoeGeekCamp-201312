package com.eoe.exercise;

import java.util.Scanner;

public class Exercise05 {

	/**  键盘输入一个整数，要求只输入四位数。然后将该数反向打印。
     *   例如：输入5327,显示7235
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a=");
		int a=scanner.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/100%10;
		int f=a/1000;
		System.out.println("a="+b+c+d+f);
		
		

	}

}
