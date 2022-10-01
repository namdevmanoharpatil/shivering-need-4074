package com.masai.bean;

public class CrimeDTO {

	
	String CrimeType;
	String CrimeDetails;
	String Suspects_Name;
	String Victims_Name;
	String DateOfCrime;
	String Place_Crime;
	String Crime_status;
	public String getCrimeType() {
		return CrimeType;
	}
	public void setCrimeType(String crimeType) {
		CrimeType = crimeType;
	}
	public String getCrimeDetails() {
		return CrimeDetails;
	}
	public void setCrimeDetails(String crimeDetails) {
		CrimeDetails = crimeDetails;
	}
	public String getSuspects_Name() {
		return Suspects_Name;
	}
	public void setSuspects_Name(String suspects_Name) {
		Suspects_Name = suspects_Name;
	}
	public String getVictims_Name() {
		return Victims_Name;
	}
	public void setVictims_Name(String victims_Name) {
		Victims_Name = victims_Name;
	}
	public String getDateOfCrime() {
		return DateOfCrime;
	}
	public void setDateOfCrime(String dateOfCrime) {
		DateOfCrime = dateOfCrime;
	}
	public String getPlace_Crime() {
		return Place_Crime;
	}
	public void setPlace_Crime(String place_Crime) {
		Place_Crime = place_Crime;
	}
	public String getCrime_status() {
		return Crime_status;
	}
	public void setCrime_status(String crime_status) {
		Crime_status = crime_status;
	}
	@Override
	public String toString() {
		return "Crime [CrimeType=" + CrimeType + ", CrimeDetails=" + CrimeDetails + ", Suspects_Name=" + Suspects_Name
				+ ", Victims_Name=" + Victims_Name + ", DateOfCrime=" + DateOfCrime + ", Place_Crime=" + Place_Crime
				+ ", Crime_status=" + Crime_status + "]";
	}
	public CrimeDTO(String crimeType, String crimeDetails, String suspects_Name, String victims_Name, String dateOfCrime,
			String place_Crime, String crime_status) {
		super();
		CrimeType = crimeType;
		CrimeDetails = crimeDetails;
		Suspects_Name = suspects_Name;
		Victims_Name = victims_Name;
		DateOfCrime = dateOfCrime;
		Place_Crime = place_Crime;
		Crime_status = crime_status;
	}
	public CrimeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
