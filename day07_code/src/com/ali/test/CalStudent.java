/*
2����ϰ��
����һ��ѧ����Student���������������ԣ��������Ա����䡢�绰����
�����������󣬲�Ϊ���ǵ����Ը�ֵ������ʾ���ǵ���Ϣ
*/
package com.ali.test;


class CalStudent {
	public static void main(String[] args) {
		// ��������
		Student s1 = new Student();
		Student s2 = new Student();

		// ��ֵ
		s1.name = "zpp";
		s1.gender = 'Ů';
		s1.age = 18;
		s1.tel = "123456";
		s1.birthday = new MyDate();
		s1.birthday.year = 2020;
		

		s2.name = "llz";
		s2.gender = '��';
		s2.age = 18;
		s2.tel = "123456";

		// ���
		System.out.println("����\t�Ա�\t����\t�绰\t");
		System.out.println(s1.name + "\t" + s1.gender + "\t" + s1.age + "\t" + s1.tel + "\t" + s1.birthday.date);
		System.out.println(s2.name + "\t" + s2.gender + "\t" + s2.age + "\t" + s2.tel);
	}
}

class Student {
	// ����
	String name;
	char gender;
	int age;
	String tel; // �绰�š�����֤�š������š��������룬���ֳ����Ҳ������������㣬һ����String
	MyDate birthday;
}

class MyDate{
	int year;
	int month;
	int date;
}
