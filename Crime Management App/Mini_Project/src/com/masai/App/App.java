package com.masai.App;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.masai.bean.Criminal;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;
import com.masai.exceptions.CriminalException;
import com.masai.exceptions.Police_StationException;
import com.masai.usecases.DeleteCriminalFromRegister;
import com.masai.usecases.GetAllCriminalUseCase;
import com.masai.usecases.GetCriminalbyCrimeType;
import com.masai.usecases.GetCriminalbyID;
import com.masai.usecases.GetCriminalsFromPolice_StationUseCase;
import com.masai.usecases.GetNumberOfCases_Month;
import com.masai.usecases.GetNumberOfCases_solved;
import com.masai.usecases.GetSuspectsfromCrimeRegister;
import com.masai.usecases.GetVictimsfromCrimeRegister;
import com.masai.usecases.LoginUseCase;
import com.masai.usecases.RegisterCriminal;

public class App {

	public static void main(String[] args) throws SQLException, CriminalException, Police_StationException {

		try {
			System.out.println("                          *****Welcome to Crime Management System Application*****");
			System.out.println(
					"==================================================================================================================");
			                
			Scanner in = new Scanner(System.in);

//			System.out.println("Enter UserName");
//			String username = in.next();
//
//			System.out.println("Enter Password");

//			String password = in.next();
//			CriminalDao edao = new CriminalDaoImpl();
//
//			if (edao.PoliceOfficer(username, password)) {
//				System.out.println("   Sucessfully Logged-In  : " + username);
//				System.out.println("   Please Select Queries which you want to Apply ");
//
//			} else {
//
//				System.out.println("Please Check Credentials");
//			}

			while (true) {

				System.out.println(" "
						+"  \n   1. Please Log In Officer : "
						+ " \n   2. View All Criminals Data  : "
						+ " \n   3. Please enter Criminal Id to search to Criminal data : "
						+ " \n   4. Please enter For Update of Criminal data  : "
						+ " \n   5. Show all Criminals Details from Crime Types OR Crime Date : "
						+ " \n   6. Information of all Criminals get from Police station Area : "
						+ " \n   7. Information of Victims : " + " \n   8. Information of Main Suspects : "
						+ " \n   9. Please enter Criminal Id to Delete  : "
						+ " \n  10. Number of Solved and Unsolved crime   : "
						+ " \n  11. Number of Crimes recorded in the Current Month." + " \n  12. Exit the App");

				System.out.println("===================================================================");
				int choice = in.nextInt();
				switch (choice) {
				
				case 1:
					System.out.println("                               Please Login as Assistant Police Inspector  ");
					System.out.println("                            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					LoginUseCase.main(args);
					break;

				case 2:
					GetAllCriminalUseCase.main(args);
					break;

				case 3:
					GetCriminalbyID.main(args);

					break;

				case 4:
					RegisterCriminal.main(args);
					break;

				case 5:
					GetCriminalbyCrimeType.main(args);
					break;

				case 6:
					GetCriminalsFromPolice_StationUseCase.main(args);
					break;

				case 7:
					GetVictimsfromCrimeRegister.main(args);

					break;

				case 8:
					GetSuspectsfromCrimeRegister.main(args);

					break;

				case 9:
					DeleteCriminalFromRegister.main(args);
					break;

				case 10:
					GetNumberOfCases_solved.main(args);
					break;

				case 11:
					GetNumberOfCases_Month.main(args);
					break;
				case 12:
					App.exitApp();
					break;

				default:

					System.out.println("Wrong Credentials..!!");
					break;

				}
			}
		} catch (Exception e) {
			App.error(e.getMessage());

		}

	}

	public static void error(String message) {
		System.out.println("Wrong Credentials..!!");

	}

	public static void exitApp() {

		System.out.println("Thanks for using this App !");
		System.exit(0);
	}

}
//   Output

/*
                          *****Welcome to Crime Management System Application*****
==================================================================================================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
1
                               Please Login as Assistant Police Inspector  
                            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Enter Username:
namdev
Enter Password:
1234
Invalid Username or password.. 
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
1
                               Please Login as Assistant Police Inspector  
                            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Enter Username:
Namdevpatilm@gamil.com
Enter Password:
827515
@@  Welcome Officer @@:
     Station ID    :   1
     Username      :   Namdevpatilm@gamil.com
     Station Area  :   West Mumbai
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
2
Criminal Name :Ramesh
Criminal Address: Delhi
Criminal Arrest Date: 2021-05-15
Criminal Crime Place: Mumbai
Criminal Age: 25
Criminal Crime Type: Robbery
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Elizabeth
Criminal Address: England
Criminal Arrest Date: 2022-08-25
Criminal Crime Place: Bangalore
Criminal Age: 24
Criminal Crime Type: Teft
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Suresh
Criminal Address: Karnataka
Criminal Arrest Date: 2020-09-12
Criminal Crime Place: Mumbai
Criminal Age: 54
Criminal Crime Type: Homicide
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Anthony
Criminal Address: Bihar
Criminal Arrest Date: 2020-02-01
Criminal Crime Place: Thane
Criminal Age: 26
Criminal Crime Type: Homicide
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Akash
Criminal Address: Sonpur
Criminal Arrest Date: 2021-05-13
Criminal Crime Place: Nagpur
Criminal Age: 32
Criminal Crime Type: Theft
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Gajanan
Criminal Address: Jodhpur
Criminal Arrest Date: 2015-06-18
Criminal Crime Place: Mumbai
Criminal Age: 23
Criminal Crime Type: Theft
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Raghav
Criminal Address: Nagpur
Criminal Arrest Date: 2018-05-18
Criminal Crime Place: Rayagad
Criminal Age: 33
Criminal Crime Type: Sharper
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Subhash
Criminal Address: 2020-08-22
Criminal Arrest Date: 2022-08-26
Criminal Crime Place: Nagpur
Criminal Age: 29
Criminal Crime Type: Homicide
Criminal Crime Status: null
===============================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
3
Enter Criminal ID :
4
  $$$$$$$$$$$$$$$               Criminal               $$$$$$$$$$$$$$$$$
====================================================================
  Criminal_Id  =  4, 
  Criminal_Name  =  Anthony, 
  Arrest_Date  =  2020-02-01, 
  Criminal_Address  =  Bihar, 
  Place_Crime  =  Thane, Age=  26,
   Gender  =  Male, 
  Occupation  =  Teacher,
   BirthMark  =  DoubleFinger, 
  CrimeType  =  Homicide, 
  CrimeDetails  =  Half,
 Crime_Status  = Unsolved
=========================================================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
4
Enter Criminal Name:
Mahesh
Enter Criminal Arrest Date :
2022-10-01
Enter Criminal Address:
Madavale
Enter Place of Crime:
Belgaum
Enter Criminal Age:
31
Enter Criminal Gender:
Male
Enter Criminal Occupation:
Chemist
Enter Criminal Birth Mark:
BlackColor
Enter Criminal Crime Type:
Theft
Enter Criminal Crime Details:
MoneyHeist
Enter Criminal Crime Status:
Unsolved
Criminal Registered Sucessfully !
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
2
Criminal Name :Ramesh
Criminal Address: Delhi
Criminal Arrest Date: 2021-05-15
Criminal Crime Place: Mumbai
Criminal Age: 25
Criminal Crime Type: Robbery
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Elizabeth
Criminal Address: England
Criminal Arrest Date: 2022-08-25
Criminal Crime Place: Bangalore
Criminal Age: 24
Criminal Crime Type: Teft
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Suresh
Criminal Address: Karnataka
Criminal Arrest Date: 2020-09-12
Criminal Crime Place: Mumbai
Criminal Age: 54
Criminal Crime Type: Homicide
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Anthony
Criminal Address: Bihar
Criminal Arrest Date: 2020-02-01
Criminal Crime Place: Thane
Criminal Age: 26
Criminal Crime Type: Homicide
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Akash
Criminal Address: Sonpur
Criminal Arrest Date: 2021-05-13
Criminal Crime Place: Nagpur
Criminal Age: 32
Criminal Crime Type: Theft
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Gajanan
Criminal Address: Jodhpur
Criminal Arrest Date: 2015-06-18
Criminal Crime Place: Mumbai
Criminal Age: 23
Criminal Crime Type: Theft
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Raghav
Criminal Address: Nagpur
Criminal Arrest Date: 2018-05-18
Criminal Crime Place: Rayagad
Criminal Age: 33
Criminal Crime Type: Sharper
Criminal Crime Status: Unsolved
===============================================
Criminal Name :Subhash
Criminal Address: 2020-08-22
Criminal Arrest Date: 2022-08-26
Criminal Crime Place: Nagpur
Criminal Age: 29
Criminal Crime Type: Homicide
Criminal Crime Status: null
===============================================
Criminal Name :Mahesh
Criminal Address: Madavale
Criminal Arrest Date: 2022-10-01
Criminal Crime Place: Belgaum
Criminal Age: 31
Criminal Crime Type: Theft
Criminal Crime Status: null
===============================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
5
Enter Criminal Crime Type :
Homicide
Enter Criminal Date of Crime :
2022-08-26
  $$$$$$$$$$$$$$$               Criminal               $$$$$$$$$$$$$$$$$
====================================================================
  Criminal_Id  =  3, 
  Criminal_Name  =  Suresh, 
  Arrest_Date  =  2020-09-12, 
  Criminal_Address  =  Karnataka, 
  Place_Crime  =  Mumbai, Age=  54,
   Gender  =  Male, 
  Occupation  =  Don-Buisnessman,
   BirthMark  =  Tatto, 
  CrimeType  =  Homicide, 
  CrimeDetails  =  Full-Murder,
 Crime_Status  = Unsolved
=========================================================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
6
Enter the Police Station Area :
West Mumbai
     $$$$$$$$$$$$$$$$    Criminal By Area Of Police Station    $$$$$$$$$$$$$$ 
=========================================================================
   Criminal_Id    =1, 
   Criminal_Name    =Ramesh,
   Criminal_Address   =Delhi, 
    PoliceStation_Name   =Andheri Police Station, 
   PoliceStation_Area    =West Mumbai
=========================================================================
     $$$$$$$$$$$$$$$$    Criminal By Area Of Police Station    $$$$$$$$$$$$$$ 
=========================================================================
   Criminal_Id    =10, 
   Criminal_Name    =Mahesh,
   Criminal_Address   =Madavale, 
    PoliceStation_Name   =Andheri Police Station, 
   PoliceStation_Area    =West Mumbai
=========================================================================
     $$$$$$$$$$$$$$$$    Criminal By Area Of Police Station    $$$$$$$$$$$$$$ 
=========================================================================
   Criminal_Id    =7, 
   Criminal_Name    =Raghav,
   Criminal_Address   =Nagpur, 
    PoliceStation_Name   =Andheri Police Station, 
   PoliceStation_Area    =West Mumbai
=========================================================================
     $$$$$$$$$$$$$$$$    Criminal By Area Of Police Station    $$$$$$$$$$$$$$ 
=========================================================================
   Criminal_Id    =9, 
   Criminal_Name    =Subhash,
   Criminal_Address   =2020-08-22, 
    PoliceStation_Name   =Andheri Police Station, 
   PoliceStation_Area    =West Mumbai
=========================================================================
     $$$$$$$$$$$$$$$$    Criminal By Area Of Police Station    $$$$$$$$$$$$$$ 
=========================================================================
   Criminal_Id    =3, 
   Criminal_Name    =Suresh,
   Criminal_Address   =Karnataka, 
    PoliceStation_Name   =D B Marg Police Station, 
   PoliceStation_Area    =West Mumbai
=========================================================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
7
Enter the Victims Registered in  Police Station  :
Simran
   $$$$$$$$$$$$$$$$$$$$$$           Suspects         $$$$$$$$$$$$$$$$$$$$$$  
============================================================================
   Victims_Name  = Simran,
   CrimeType  = Theft, 
   CrimeDetails  = Money-Heist,
  Place_Crime  = Mumbai,
  Crime_status  = Unsolved 
============================================================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
8
Enter the Suspect Registered in  Police Station  :
Zamin
   $$$$$$$$$$$$$$$$$$$$$$           Suspects         $$$$$$$$$$$$$$$$$$$$$$ 
============================================================================
   CrimeType   =  Theft, 
   CrimeDetails    =  Money-Heist,
  Suspects_Name  = Zamin,
   Victims_Name  = Simran,
  DateOfCrime  = 2019-05-28,
  Place_Crime =Mumbai,
  Crime_status  =Unsolved
=========================================================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
8
Enter the Suspect Registered in  Police Station  :
Suresh
   $$$$$$$$$$$$$$$$$$$$$$           Suspects         $$$$$$$$$$$$$$$$$$$$$$ 
============================================================================
   CrimeType   =  Homicide, 
   CrimeDetails    =  Full-Murder,
  Suspects_Name  = Suresh,
   Victims_Name  = Irrappa,
  DateOfCrime  = 2020-05-16,
  Place_Crime =Mumbai,
  Crime_status  =Unsolved
=========================================================================
   $$$$$$$$$$$$$$$$$$$$$$           Suspects         $$$$$$$$$$$$$$$$$$$$$$ 
============================================================================
   CrimeType   =  Homicide, 
   CrimeDetails    =  Half-Murder,
  Suspects_Name  = Suresh,
   Victims_Name  = Marappa,
  DateOfCrime  = 2019-05-28,
  Place_Crime =Bangalore,
  Crime_status  =Unsolved
=========================================================================
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
10
[Solved, 4, Unsolved, 5]
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
10
[Solved, 4, Unsolved, 5]
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
11
[2022-09-22, 1, 2022-09-15, 1]
   
   1. Please Log In Officer :  
   2. View All Criminals Data  :  
   3. Please enter Criminal Id to search to Criminal data :  
   4. Please enter For Update of Criminal data  :  
   5. Show all Criminals Details from Crime Types OR Crime Date :  
   6. Information of all Criminals get from Police station Area :  
   7. Information of Victims :  
   8. Information of Main Suspects :  
   9. Please enter Criminal Id to Delete  :  
  10. Number of Solved and Unsolved crime   :  
  11. Number of Crimes recorded in the Current Month. 
  12. Exit the App
===================================================================
12
Thanks for using this App !
 
 */
