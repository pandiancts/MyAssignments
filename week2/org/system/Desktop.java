package org.system;

public class Desktop  extends Computer{

	public void desktopSize() {
		System.out.println("Different desktop sizes");
	}

	public static void main(String[] args) {
		Desktop a = new Desktop();
		a.computerModel();
		a.desktopSize();
	}
}


