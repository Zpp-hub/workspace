//1������һ���������ͣ����峤�Ϳ�
//2������һ���������飬�洢5�����Σ��Ӽ���������εĳ��Ϳ�
//3�����վ��ε��������

package com.ali.homework;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Rectangle[] arr = new Rectangle[5]; // ��������
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle();
			System.out.print("�����볤��");
			arr[i].length = input.nextDouble();
			System.out.print("�������");
			arr[i].weight = input.nextDouble();
			System.out.println("����ǣ�" + arr[i].length*arr[i].weight);
		}
	}
}

class Rectangle {
	double length;
	double weight;
}
