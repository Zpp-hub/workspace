package com.ali.homework;

class TestMarry{
	public static void main(String[] args){
		Husband hus = new Husband();
		hus.name = "邓超";
		hus.age = 38;		
		
		Wife wife = new Wife();
		wife.name = "孙俪";
		wife.age = 35;
		
		//结婚
		wife.h = hus;
		hus.w = wife;
		
		System.out.println("丈夫：");
		System.out.println("姓名：" + hus.name + ",年龄：" + hus.age +"，妻子：" + hus.w.name );
		System.out.println("妻子：");
		System.out.println("姓名：" + wife.name + ",年龄：" + wife.age +"，丈夫：" + wife.h.name );
	}
}
class Husband{
	String name;
	int age;
	Wife w;//妻子属性
}
class Wife{
	String name;
	int age;
	Husband h;//丈夫属性
}