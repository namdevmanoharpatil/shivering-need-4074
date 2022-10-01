package com.masai.usecases;

import java.rmi.StubNotFoundException;
import java.util.Scanner;
import com.masai.bean.Criminal;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;

public class RegisterCriminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Criminal Name:");
		String Criminal_Name = sc.next();

//		System.out.println("Enter Criminal Nick-Name:");
//		String NickName = sc.next();

		System.out.println("Enter Criminal Arrest Date :");
		String Arrest_Date = sc.next();

//		System.out.println("Enter Criminal Date Of Crime:");
//		String DateOfCrime = sc.next();

		System.out.println("Enter Criminal Address:");
		String Criminal_Address = sc.next();

		System.out.println("Enter Place of Crime:");
		String Place_Crime = sc.next();

		System.out.println("Enter Criminal Age:");
		int Age = sc.nextInt();

		System.out.println("Enter Criminal Gender:");
		String Gender = sc.next();

		System.out.println("Enter Criminal Occupation:");
		String Occupation = sc.next();

		System.out.println("Enter Criminal Birth Mark:");
		String BirthMark = sc.next();

		System.out.println("Enter Criminal Crime Type:");
		String CrimeType = sc.next();

		System.out.println("Enter Criminal Crime Details:");
		String CrimeDetails = sc.next();
		
		System.out.println("Enter Criminal Crime Status:");
		String Crime_Status = sc.next();
		
		CriminalDao dao = new CriminalDaoImpl();

		Criminal criminal = new Criminal();
		
		criminal.setCriminal_Name(Criminal_Name);


		criminal.setArrest_Date(Arrest_Date);


		criminal.setCriminal_Address(Criminal_Address);

		criminal.setPlace_Crime(Place_Crime); 

		criminal.setAge(Age);

		criminal.setGender(Gender);

		criminal.setOccupation(Occupation);

		criminal.setBirthMark(BirthMark);

		criminal.setCrimeType(CrimeType);
		
		criminal.setCrimeDetails(CrimeDetails);
		
		criminal.setCrimeDetails(Crime_Status); //add the column

		String result = dao.registerCriminal(criminal);

		System.out.println(result);
	}

}

/*
 mysql> select * from Criminal ;
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           1 | Ramesh        | 2021-05-15  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    | Unsolved     |
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | Unsolved     |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | Unsolved     |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | Unsolved     |
|           5 | Akash         | 2021-05-13  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          | Unsolved     |
|           6 | Gajanan       | 2015-06-18  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          | Unsolved     |
|           7 | Raghav        | 2018-05-18  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  | Unsolved     |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+ 
 */
