package com.eoe.exercise;

import java.util.Scanner;

public class Exercise07 {

	/**
	 * 键盘输入三个整数，找出最大数、最小数和中间数。
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = Math.max(a, Math.max(b, c));
		int e = Math.min(a, Math.min(b, c));
		System.out.println("最大数："+d);
		System.out.println("最小数："+e);
		System.out.println("中间数："+((a+b+c)-(d+e)));

	}

}
