package com.tnif.dayfour.thirdpackage;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		MyClass m= MyClass.getObject();
		MyClass m1=new MyClass();
		m1.setId(10);
		
		MyClass m2=MyClass.getObject();
		
		System.out.println(m1);
		System.out.println(m2);
		
		
		// TODO Auto-generated method stub

	}

}
