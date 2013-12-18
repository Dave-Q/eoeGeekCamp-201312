package com.eoe.exercise;

import java.util.Scanner;

public class Exercise01 {

	/**
	 * 、编写计算华氏转换为摄氏温度的程序，公式： 摄氏温度值=（华氏温度值-32）×5÷9
               要求：
   	 (1)华氏设施温度由键盘输入。
     (2)保留小数点后1位。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("华氏摄氏度：");
		double name=scanner.nextDouble();
		System.out.println("摄氏温度值="+(name-32)*5/9);

	}

}
