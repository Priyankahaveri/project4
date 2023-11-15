package com.tnif.dayfour.thirdpackage;

public class MyClass {
	private static MyClass obj=new MyClass();
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public MyClass() {
		System.out.println("myclass obj created");
	}
	public static MyClass getObject()
	{
		return obj;
		
	}
	@Override
	public String toString() {
		
		return "MyClass[id="+id+"]";
	}
}

