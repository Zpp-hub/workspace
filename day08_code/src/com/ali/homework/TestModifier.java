package com.ali.homework;

public class TestModifier {

	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(1200);
		
		System.out.println("balance: " + a.getBalance());
	}

}
// �����һ�������˻���
// �˻����󴴽���������������˻��������������ǲ������޸ĵģ�
// ����ǲ�������Ϊ����

class Account {
	private String id;
	private double balance;

	// �ṩһ������Ϊbalance��ֵ
	public void setBalance(double b) {
		if (b > 0) {
			balance = b;
		}else {
			System.out.println("����Ϊ������");
		}
	}
	
	// �ṩһ����������balance��ֵ
	public double getBalance(){
		return balance;
	}
	
	
}
