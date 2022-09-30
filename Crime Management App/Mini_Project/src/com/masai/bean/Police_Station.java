package com.masai.bean;

public class Police_Station {

	private int StationId;
	private String PoliceStation_Name;
	private String PoliceStation_Area;

	public int getStationId() {
		return StationId;
	}

	public void setStationId(int stationId) {
		StationId = stationId;
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
		return "Police_Station [StationId=" + StationId + ", PoliceStation_Name=" + PoliceStation_Name
				+ ", PoliceStation_Area=" + PoliceStation_Area + "]";
	}

	public Police_Station(int stationId, String policeStation_Name, String policeStation_Area) {
		super();
		StationId = stationId;
		PoliceStation_Name = policeStation_Name;
		PoliceStation_Area = policeStation_Area;
	}

	public Police_Station() {
		super();

	}

}
