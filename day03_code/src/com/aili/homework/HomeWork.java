package com.aili.homework;

import java.util.Scanner;

public class HomeWork {
	
	static void homeWork1(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入一个整数（65~90）:");
		int num = input.nextInt();
		
		System.out.println(num + "对应的字母： " + (char)num);
		
	}

	public static void main(String[] args) {
		homeWork1();
	}
}
