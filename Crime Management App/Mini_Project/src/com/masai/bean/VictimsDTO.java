package com.masai.bean;

public class VictimsDTO {

	private int Victims_Id;
	private String Victims_Name;

	private String PoliceStation_Name;
	private String PoliceStation_Area;

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

	public String getPoliceStation_Name() {
		return PoliceStation_Name;
	}

	public void setPoliceStation_Name(String policeStation_Name) {
		PoliceStation_Name = policeStation_Name;
	}

	public String getPoliceStation_Area() {
		return PoliceStation_Area;
	}

	public void setPoliceStation_Area(String policeStation_Area) {
		PoliceStation_Area = policeStation_Area;
	}

	@Override
	public String toString() {
		return "VictimsDTO [Victims_Id=" + Victims_Id + ", Victims_Name=" + Victims_Name + ", PoliceStation_Name="
				+ PoliceStation_Name + ", PoliceStation_Area=" + PoliceStation_Area + "]";
	}

	public VictimsDTO(int victims_Id, String victims_Name, String policeStation_Name, String policeStation_Area) {
		super();
		Victims_Id = victims_Id;
		Victims_Name = victims_Name;
		PoliceStation_Name = policeStation_Name;
		PoliceStation_Area = policeStation_Area;
	}

	public VictimsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
