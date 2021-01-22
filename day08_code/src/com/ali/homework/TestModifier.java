package com.ali.homework;

public class TestModifier {

	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(1200);
		
		System.out.println("balance: " + a.getBalance());
	}

}
// 设计了一个银行账户类
// 账户对象创建（卡办理），这个账户，户主的姓名是不可以修改的，
// 余额是不想设置为负数

class Account {
	private String id;
	private double balance;

	// 提供一个方法为balance赋值
	public void setBalance(double b) {
		if (b > 0) {
			balance = b;
		}else {
			System.out.println("余额不能为负数！");
		}
	}
	
	// 提供一个方法返回balance的值
	public double getBalance(){
		return balance;
	}
	
	
}
