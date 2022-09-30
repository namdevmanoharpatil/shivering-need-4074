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
import com.masai.usecases.GetSuspectsfromCrimeRegister;
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
						+ " \n   6. Information of Victims : " + " \n   7. Information of main Suspects : "
						+ " \n   8. Please enter criminalId to delete  : "
						+ " \n   9.  Number of solved and unsolved crime   : "
						+ " \n  10.  Number of crimes recorded in the current month." + " \n  11.  Exit the App");

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
//					GetVictimsfromCrimeRegister.main(args);

					break;

				case 7:
					GetSuspectsfromCrimeRegister.main(args);

					break;

				case 8:
					DeleteCriminalFromRegister.main(args);
					break;

				case 9:
					// DeleteCriminalFromRegister.main(args);
					break;

				case 10:
					// DeleteCriminalFromRegister.main(args);
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
