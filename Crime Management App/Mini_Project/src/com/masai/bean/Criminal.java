package com.masai.bean;

public class Criminal {

	private int Criminal_Id;
	private String Criminal_Name;
	private String Arrest_Date;
	private String Criminal_Address;
	private String Place_Crime;
	private int Age;
	private String Gender;
	private String Occupation;
	private String BirthMark;
	private String CrimeType;
	private String CrimeDetails;
	private String Crime_Status;

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

	public String getArrest_Date() {
		return Arrest_Date;
	}

	public void setArrest_Date(String arrest_Date) {
		Arrest_Date = arrest_Date;
	}

	public String getCriminal_Address() {
		return Criminal_Address;
	}

	public void setCriminal_Address(String criminal_Address) {
		Criminal_Address = criminal_Address;
	}

	public String getPlace_Crime() {
		return Place_Crime;
	}

	public void setPlace_Crime(String place_Crime) {
		Place_Crime = place_Crime;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getBirthMark() {
		return BirthMark;
	}

	public void setBirthMark(String birthMark) {
		BirthMark = birthMark;
	}

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

	public String getCrime_Status() {
		return Crime_Status;
	}

	public void setCrime_Status(String crime_Status) {
		Crime_Status = crime_Status;
	}

	@Override
	public String toString() {
		return "  $$$$$$$$$$$$$$$               Criminal               $$$$$$$$$$$$$$$$$"
				+ "\n===================================================================="				
				+ "\n  Criminal_Id  =  " +   Criminal_Id + ", \n  Criminal_Name  =  " + Criminal_Name + ", \n  Arrest_Date  =  "
				+ Arrest_Date + ", \n  Criminal_Address  =  " + Criminal_Address + ", \n  Place_Crime  =  " + Place_Crime + ", Age=  "
				+ Age + ",\n   Gender  =  " + Gender + ", \n  Occupation  =  " + Occupation + ",\n   BirthMark  =  " + BirthMark
				+ ", \n  CrimeType  =  " + CrimeType + ", \n  CrimeDetails  =  " + CrimeDetails + ",\n Crime_Status  = " + Crime_Status
				+ "";
	}

	public Criminal() {
		super();
		
	}

	public Criminal(int criminal_Id, String criminal_Name, String arrest_Date, String criminal_Address,
			String place_Crime, int age, String gender, String occupation, String birthMark, String crimeType,
			String crimeDetails, String crime_Status) {
		super();
		Criminal_Id = criminal_Id;
		Criminal_Name = criminal_Name;
		Arrest_Date = arrest_Date;
		Criminal_Address = criminal_Address;
		Place_Crime = place_Crime;
		Age = age;
		Gender = gender;
		Occupation = occupation;
		BirthMark = birthMark;
		CrimeType = crimeType;
		CrimeDetails = crimeDetails;
		Crime_Status = crime_Status;
	}

}
