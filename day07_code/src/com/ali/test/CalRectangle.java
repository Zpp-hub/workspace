package com.ali.test;

class Rectangle {
	// ����
	double length;
	double width;

}

class CalRectangle{
	// ��
	public static void main(String[] args) {
		// ��������
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		// ��ֵ
		r1.length = 3;
		r1.width = 2;
		
		r2.length = 4;
		r2.width = 8;
		// �����
		System.out.println("Բ��r1������ǣ�" + r1.length*r1.width);
		System.out.println("Բ��r2������ǣ�" + r2.length*r2.width);
	}
}

