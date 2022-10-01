package com.masai.bean;

public class CriminalDTO {

	private int Criminal_Id;
	private String Criminal_Name;
	private String Criminal_Address;

	private String PoliceStation_Name;
	private String PoliceStation_Area;

	public int getCriminal_Id() {
		return Criminal_Id;
	}

	public void setCriminal_Id(int criminal_Id) {
		Criminal_Id = criminal_Id;
	}

	public String getCriminal_Name() {
		return Criminal_Name;
	}

	public void setCriminal_Name(String criminal_Name) {
		Criminal_Name = criminal_Name;
	}

	public String getCriminal_Address() {
		return Criminal_Address;
	}

	public void setCriminal_Address(String criminal_Address) {
		Criminal_Address = criminal_Address;
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
		return "     $$$$$$$$$$$$$$$$    Criminal By Area Of Police Station    $$$$$$$$$$$$$$ "
				+ "\n========================================================================="
				+ "\n   Criminal_Id    =" + Criminal_Id + ", \n   Criminal_Name    =" + Criminal_Name + ",\n   Criminal_Address   ="
				+ Criminal_Address + ", \n    PoliceStation_Name   =" + PoliceStation_Name + ", \n   PoliceStation_Area    ="
				+ PoliceStation_Area + 
				"\n=========================================================================";
	}

	public CriminalDTO(int criminal_Id, String criminal_Name, String criminal_Address, String policeStation_Name,
			String policeStation_Area) {
		super();
		Criminal_Id = criminal_Id;
		Criminal_Name = criminal_Name;
		Criminal_Address = criminal_Address;
		PoliceStation_Name = policeStation_Name;
		PoliceStation_Area = policeStation_Area;
	}

	public CriminalDTO() {
		super();

	}

}
