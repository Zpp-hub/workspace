package com.ali.homework;

class TestMarry{
	public static void main(String[] args){
		Husband hus = new Husband();
		hus.name = "�˳�";
		hus.age = 38;		
		
		Wife wife = new Wife();
		wife.name = "��ٳ";
		wife.age = 35;
		
		//���
		wife.h = hus;
		hus.w = wife;
		
		System.out.println("�ɷ�");
		System.out.println("������" + hus.name + ",���䣺" + hus.age +"�����ӣ�" + hus.w.name );
		System.out.println("���ӣ�");
		System.out.println("������" + wife.name + ",���䣺" + wife.age +"���ɷ�" + wife.h.name );
	}
}
class Husband{
	String name;
	int age;
	Wife w;//��������
}
class Wife{
	String name;
	int age;
	Husband h;//�ɷ�����
}