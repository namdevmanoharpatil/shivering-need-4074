package com.masai.bean;

public class Criminal {

	private int Criminal_Id;
	private String Criminal_Name;
	private String Criminal_NickName;
	private String Arrest_Date;
	private String DateOfCrime;
	private String Criminal_Address;
	private String Place_Crime;
	private int Age;
	private String Gender;
	private String Occupation;
	private String BirthMark;
	private String CrimeType;
	private String CrimeDetails;

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

	public String getCriminal_NickName() {
		return Criminal_NickName;
	}

	public void setCriminal_NickName(String criminal_NickName) {
		Criminal_NickName = criminal_NickName;
	}

	public String getArrest_Date() {
		return Arrest_Date;
	}

	public void setArrest_Date(String arrest_Date) {
		Arrest_Date = arrest_Date;
	}

	public String getDateOfCrime() {
		return DateOfCrime;
	}

	public void setDateOfCrime(String dateOfCrime) {
		DateOfCrime = dateOfCrime;
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

	@Override
	public String toString() {
		return "Criminal [Criminal_Id=" + Criminal_Id + ", Criminal_Name=" + Criminal_Name + ", Criminal_NickName="
				+ Criminal_NickName + ", Arrest_Date=" + Arrest_Date + ", DateOfCrime=" + DateOfCrime
				+ ", Criminal_Address=" + Criminal_Address + ", Place_Crime=" + Place_Crime + ", Age=" + Age
				+ ", Gender=" + Gender + ", Occupation=" + Occupation + ", BirthMark=" + BirthMark + ", CrimeType="
				+ CrimeType + ", CrimeDetails=" + CrimeDetails + "]";
	}

	public Criminal(int criminal_Id, String criminal_Name, String criminal_NickName, String arrest_Date,
			String dateOfCrime, String criminal_Address, String place_Crime, int age, String gender, String occupation,
			String birthMark, String crimeType, String crimeDetails) {
		super();
		Criminal_Id = criminal_Id;
		Criminal_Name = criminal_Name;
		Criminal_NickName = criminal_NickName;
		Arrest_Date = arrest_Date;
		DateOfCrime = dateOfCrime;
		Criminal_Address = criminal_Address;
		Place_Crime = place_Crime;
		Age = age;
		Gender = gender;
		Occupation = occupation;
		BirthMark = birthMark;
		CrimeType = crimeType;
		CrimeDetails = crimeDetails;
	}

	public Criminal() {
		super();
		
	}

}
