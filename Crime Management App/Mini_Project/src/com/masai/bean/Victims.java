package com.masai.bean;

public class Victims {

	private int Victims_Id;
	private String Victims_Name;

	public int getVictims_Id() {
		return Victims_Id;
	}

	public void setVictims_Id(int victims_Id) {
		Victims_Id = victims_Id;
	}

	public String getVictims_Name() {
		return Victims_Name;
	}

	public void setVictims_Name(String victims_Name) {
		Victims_Name = victims_Name;
	}

	@Override
	public String toString() {
		return "Victims [Victims_Id=" + Victims_Id + ", Victims_Name=" + Victims_Name + "]";
	}

	public Victims() {
		super();

	}

	public Victims(int victims_Id, String victims_Name) {
		super();
		Victims_Id = victims_Id;
		Victims_Name = victims_Name;
	}

}
