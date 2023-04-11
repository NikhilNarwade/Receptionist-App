package com.Hospital;

public class Patient
{
	int token;
	String name;
	long cno;
	String address;
	double money;
	public Patient(int token, String name, long cno, String address, double money) {
		super();
		this.token = token;
		this.name = name;
		this.cno = cno;
		this.address = address;
		this.money = money;
	}
	public Patient(int token, String name, long cno, String address) {
		super();
		this.token = token;
		this.name = name;
		this.cno = cno;
		this.address = address;
	}
	
	
	public String toString()
	{
		return "*Token No = "+token+" *Name = "+name+" *Contact No = "+cno+" *Address = "+address;
	}

}
