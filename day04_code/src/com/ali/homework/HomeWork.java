package com.ali.homework;

import java.util.Scanner;

public class HomeWork {
	
	static void homeWork1(){
		Scanner input = new Scanner (System.in);
		
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		
		// if ... else
		if(num>0){
			System.out.println("num 是正数！");
		}else if(num<0){
			System.out.println("num 是负数！");
		}else{
			System.out.println("num 是零！");
		}
	}
	
	static void homeWork2(){
		System.out.println("\t1、取款");
		System.out.println("\t2、存款");
		System.out.println("\t3、查询");
		System.out.println("\t4、退出");
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("请输入要操作的功能的序号：");
		int select = input1.nextInt();
		
		switch(select){
			case 1:
				System.out.println("欢迎使用取款功能");
				break;
			case 2:
				System.out.println("欢迎使用存款功能");
				break;
			case 3:
				System.out.println("欢迎使用查询功能");
				break;	
			case 4:
				System.out.println("谢谢使用");
				break;
			default:
				System.out.println("输入有误");
		}
	}
	
	public static void main(String[] args){
//		homeWork1();
		homeWork2();
	}
}
