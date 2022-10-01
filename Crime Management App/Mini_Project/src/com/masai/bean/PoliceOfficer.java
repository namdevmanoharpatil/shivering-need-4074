package com.masai.bean;

public class PoliceOfficer {

	String Username;
	String Password;
	int StationId;
	String PoliceStation_Area;

	@Override
	public String toString() {
		return "PoliceOfficer [Username=" + Username + ", Password=" + Password + ", StationId=" + StationId
				+ ", PoliceStation_Area=" + PoliceStation_Area + "]";
	}

	public PoliceOfficer(String username, String password, int stationId, String policeStation_Area) {
		super();
		Username = username;
		Password = password;
		StationId = stationId;
		PoliceStation_Area = policeStation_Area;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getStationId() {
		return StationId;
	}

	public void setStationId(int stationId) {
		StationId = stationId;
	}

	public String getPoliceStation_Area() {
		return PoliceStation_Area;
	}

	public void setPoliceStation_Area(String policeStation_Area) {
		PoliceStation_Area = policeStation_Area;
	}

	public PoliceOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
