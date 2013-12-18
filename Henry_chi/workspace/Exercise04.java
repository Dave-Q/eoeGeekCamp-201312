package com.eoe.exercise;

import java.util.Scanner;

public class Exercise04 {

	/**
	 * 键盘输入两个int类型的数，打印这两个数是否相等。
	        要求：用true和false表示两个数是否相等。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a   b=");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("a=b:"+((a^b)==0));
		
	}

}
