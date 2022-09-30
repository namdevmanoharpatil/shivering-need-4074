package com.masai.bean;

public class SuspectsDTO {

	private int Suspects_Id;
	private String Suspects_Name;

	private String PoliceStation_Name;
	private String PoliceStation_Area;

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
		return "SuspectsDTO [Suspects_Id=" + Suspects_Id + ", Suspects_Name=" + Suspects_Name + ", PoliceStation_Name="
				+ PoliceStation_Name + ", PoliceStation_Area=" + PoliceStation_Area + "]";
	}

	public SuspectsDTO(int suspects_Id, String suspects_Name, String policeStation_Name, String policeStation_Area) {
		super();
		Suspects_Id = suspects_Id;
		Suspects_Name = suspects_Name;
		PoliceStation_Name = policeStation_Name;
		PoliceStation_Area = policeStation_Area;
	}

	public SuspectsDTO() {
		super();

	}

}
