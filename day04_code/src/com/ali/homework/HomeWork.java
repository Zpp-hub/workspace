package com.ali.homework;

import java.util.Scanner;

public class HomeWork {
	
	static void homeWork1(){
		Scanner input = new Scanner (System.in);
		
		System.out.print("������һ��������");
		int num = input.nextInt();
		
		// if ... else
		if(num>0){
			System.out.println("num ��������");
		}else if(num<0){
			System.out.println("num �Ǹ�����");
		}else{
			System.out.println("num ���㣡");
		}
	}
	
	static void homeWork2(){
		System.out.println("\t1��ȡ��");
		System.out.println("\t2�����");
		System.out.println("\t3����ѯ");
		System.out.println("\t4���˳�");
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("������Ҫ�����Ĺ��ܵ���ţ�");
		int select = input1.nextInt();
		
		switch(select){
			case 1:
				System.out.println("��ӭʹ��ȡ���");
				break;
			case 2:
				System.out.println("��ӭʹ�ô���");
				break;
			case 3:
				System.out.println("��ӭʹ�ò�ѯ����");
				break;	
			case 4:
				System.out.println("ллʹ��");
				break;
			default:
				System.out.println("��������");
		}
	}
	
	public static void main(String[] args){
//		homeWork1();
		homeWork2();
	}
}
