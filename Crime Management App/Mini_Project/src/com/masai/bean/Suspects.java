package com.masai.bean;

public class Suspects {

	private int Suspects_Id;
	private String Suspects_Name;

	public int getSuspects_Id() {
		return Suspects_Id;
	}

	public void setSuspects_Id(int suspects_Id) {
		Suspects_Id = suspects_Id;
	}

	public String getSuspects_Name() {
		return Suspects_Name;
	}

	public void setSuspects_Name(String suspects_Name) {
		Suspects_Name = suspects_Name;
	}

	@Override
	public String toString() {
		return "Suspects [Suspects_Id=" + Suspects_Id + ", Suspects_Name=" + Suspects_Name + "]";
	}

	public Suspects() {
		super();
		
	}

	public Suspects(int suspects_Id, String suspects_Name) {
		super();
		Suspects_Id = suspects_Id;
		Suspects_Name = suspects_Name;
	}

}
