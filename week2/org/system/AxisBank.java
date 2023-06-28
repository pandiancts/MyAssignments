package org.system;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("This is the updated deposit amount");
	}
	

	public static void main(String[] args) {
		AxisBank b = new AxisBank();
		b.saving();
		b.fixed();
		b.deposit();
		

	}

}
