package com.eoe.exercise;

import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;

public class Exercise06 {

	/**
	 * 键盘输入一个数，该数要求在0~5之间，当超过5时设置为5，当小于0时设置为0.	
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个人数：");
		int score=scanner.nextInt();
		score=Math.max(0, Math.min(5, score));
		System.out.println(score);

	}

}
