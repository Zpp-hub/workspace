/*
�������飺
1������һ��Բ���ͣ������ԣ��뾶radius
2������һ��Բ�����飬Ҫ�洢3��Բ����
3��Ϊ����Բ�İ뾶��ֵ���Ӽ�������
4��������Բ�����������ʾ
5�����հ뾶����
*/

package com.ali.test;

import java.util.Scanner;

class CalCircle {
	public static void main(String[] args) {
		Circle[] arr = new Circle[3];// ��û�д���Բ ֻ��������һ��������������λ��

		Scanner input = new Scanner(System.in);
		
		// �ȴ�������Բ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Circle();
			System.out.print("������Բ�İ뾶��");
			arr[i].radius = input.nextDouble();
			System.out.println("Բ�����Ϊ��" + arr[i].radius * arr[i].radius);
		}
	}
}

class Circle {
	double radius;
}
