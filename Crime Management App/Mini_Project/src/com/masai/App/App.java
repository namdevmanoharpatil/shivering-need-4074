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
import com.masai.usecases.RegisterCriminal;

public class App {

	public static void main(String[] args) throws SQLException, CriminalException, Police_StationException {

		try {
			System.out.println("                          *****Welcome to Crime Management System Application*****");
			System.out.println(
					"==================================================================================================================");
			System.out.println("                               Please Login as Assistant Police Inspector  ");
			System.out.println("                            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			Scanner in = new Scanner(System.in);

			System.out.println("Enter UserName");
			String username = in.next();

			System.out.println("Enter Password");

			String password = in.next();
			CriminalDao edao = new CriminalDaoImpl();

			if (edao.PoliceOfficer(username, password)) {
				System.out.println("   Sucessfully Logged-In  : " + username);
				System.out.println("   Please Select Queries which you want to Apply ");

			} else {

				System.out.println("Please Check Credentials");
			}

			while (true) {

				System.out.println(" \n   1. View All Criminals Data  : "
						+ " \n   2. Please enter Criminal Id to search to Criminal data : "
						+ " \n   3. Please enter For Update of Criminal data  : "
						+ " \n   4. Show all Criminals Details from Crime Types OR Crime Date : "
						+ " \n   5. Information of all Criminals get from Police station Area : "
						+ " \n   6. Information of Victims : " + " \n   7. Information of Main Suspects : "
						+ " \n   8. Please enter Criminal Id to Delete  : "
						+ " \n   9. Number of Solved and Unsolved crime   : "
						+ " \n  10. Number of Crimes recorded in the Current Month." + " \n  11. Exit the App");

				int choice = in.nextInt();
				switch (choice) {

				case 1:
					GetAllCriminalUseCase.main(args);
					break;

				case 2:
					GetCriminalbyID.main(args);

					break;

				case 3:
					RegisterCriminal.main(args);
					break;

				case 4:
					GetCriminalbyCrimeType.main(args);
					break;

				case 5:
					GetCriminalsFromPolice_StationUseCase.main(args);
					break;

				case 6:
					GetVictimsfromCrimeRegister.main(args);

					break;

				case 7:
					GetSuspectsfromCrimeRegister.main(args);

					break;

				case 8:
					DeleteCriminalFromRegister.main(args);
					break;

				case 9:
					GetNumberOfCases_solved.main(args);
					break;

				case 10:
					GetNumberOfCases_Month.main(args);
					break;
				case 11:
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
                               Please Login as Assistant Police Inspector  
                            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Enter UserName
Namdev
Enter Password
Namdev
   Sucessfully Logged-In  : Namdev
   Please Select Queries which you want to Apply 
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
1
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
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
2
Enter Criminal ID :
5
  $$$$$$$$$$$$$$$               Criminal               $$$$$$$$$$$$$$$$$
====================================================================
  Criminal_Id  =  5, 
  Criminal_Name  =  Akash, 
  Arrest_Date  =  2021-05-13, 
  Criminal_Address  =  Sonpur, 
  Place_Crime  =  Nagpur, Age=  32,
   Gender  =  Male, 
  Occupation  =  Farmer,
   BirthMark  =  EyeDamage, 
  CrimeType  =  Theft, 
  CrimeDetails  =  Money,
 Crime_Status  = Unsolved
=========================================================================
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
3
Enter Criminal Name:
Somnath
Enter Criminal Arrest Date :
2022-08-26
Enter Criminal Address:
2022-07-25
Enter Place of Crime:
Bangalore
Enter Criminal Age:
31
Enter Criminal Gender:
Male
Enter Criminal Occupation:
Enginner
Enter Criminal Birth Mark:
Tatto
Enter Criminal Crime Type:
Homicide
Enter Criminal Crime Details:
Murder
Enter Criminal Crime Status:
Unsolved
Criminal registered Successfully..
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
1
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
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
4
Enter Criminal Crime Type :
Robbery
Enter Criminal Date of Crime :
2022-08-25
  $$$$$$$$$$$$$$$               Criminal               $$$$$$$$$$$$$$$$$
====================================================================
  Criminal_Id  =  1, 
  Criminal_Name  =  Ramesh, 
  Arrest_Date  =  2021-05-15, 
  Criminal_Address  =  Delhi, 
  Place_Crime  =  Mumbai, Age=  25,
   Gender  =  Male, 
  Occupation  =  Painter,
   BirthMark  =  Face-Scratch, 
  CrimeType  =  Robbery, 
  CrimeDetails  =  Money-Heist,
 Crime_Status  = Unsolved
=========================================================================
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
5
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
   Criminal_Id    =3, 
   Criminal_Name    =Suresh,
   Criminal_Address   =Karnataka, 
    PoliceStation_Name   =D B Marg Police Station, 
   PoliceStation_Area    =West Mumbai
=========================================================================
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
6
Enter the Victims Registered in  Police Station  :
Inamdar
   $$$$$$$$$$$$$$$$$$$$$$           Suspects         $$$$$$$$$$$$$$$$$$$$$$  
============================================================================
   Victims_Name  = Inamdar,
   CrimeType  = Robbery, 
   CrimeDetails  = Money-Heist,
  Place_Crime  = Mumbai,
  Crime_status  = Solved 
============================================================================
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
7
Enter the Suspect Registered in  Police Station  :
Mukesh
   $$$$$$$$$$$$$$$$$$$$$$           Suspects         $$$$$$$$$$$$$$$$$$$$$$ 
============================================================================
   CrimeType   =  Robbery, 
   CrimeDetails    =  Money-Heist,
  Suspects_Name  = Mukesh,
   Victims_Name  = Inamdar,
  DateOfCrime  = 2020-05-16,
  Place_Crime =Mumbai,
  Crime_status  =Solved
=========================================================================
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
8
Enter Criminal ID :
 6
 Successfully delete 1 Criminal of Id=6
 1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
1
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
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
9
[Solved, 4, Unsolved, 5]
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
10
[2022-09-22, 1, 2022-09-15, 1]
 
   1. View All Criminals Data  :  
   2. Please enter Criminal Id to search to Criminal data :  
   3. Please enter For Update of Criminal data  :  
   4. Show all Criminals Details from Crime Types OR Crime Date :  
   5. Information of all Criminals get from Police station Area :  
   6. Information of Victims :  
   7. Information of Main Suspects :  
   8. Please enter Criminal Id to Delete  :  
   9. Number of Solved and Unsolved crime   :  
  10. Number of Crimes recorded in the Current Month. 
  11. Exit the App
11
Thanks for using this App !
 
 */
