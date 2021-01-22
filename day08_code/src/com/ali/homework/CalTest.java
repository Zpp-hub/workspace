//1、声明一个矩形类型，定义长和宽
//2、声明一个矩形数组，存储5个矩形，从键盘输入矩形的长和宽
//3、按照矩形的面积排序

package com.ali.homework;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Rectangle[] arr = new Rectangle[5]; // 声明数组
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle();
			System.out.print("请输入长：");
			arr[i].length = input.nextDouble();
			System.out.print("请输入宽：");
			arr[i].weight = input.nextDouble();
			System.out.println("面积是：" + arr[i].length*arr[i].weight);
		}
	}
}

class Rectangle {
	double length;
	double weight;
}
