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
import com.masai.usecases.GetCriminalbyID;
import com.masai.usecases.GetCriminalsFromPolice_StationUseCase;
import com.masai.usecases.RegisterCriminal;

public class App {

//	private static CriminalDao service;
//
//	public static void exitApp() {
//
//		System.out.println("Thanks for using this App !");
//		System.exit(0);
//	}
//
//	public static void selectOption() {
//
//		try {
//			System.out.println(
//					"                        *****Welcome to Crime Management System Application*****                    ");
//			System.out.println("\n  Please select an Option to continue...");
//			System.out.println("\n1. Police Officer Login" + "\n2. View All Criminals Data "
//					+ " \n3. Please enter Criminal details" + " \n4. Please enter Criminal Id to search"
//					+ " \n5. Information get from Police station name" + " \n6. Please enter criminalId to delete"
//					+ " \n7. Exit the App");
//
//			Scanner sc = new Scanner(System.in);
//			int choice = sc.nextInt();
//
//			switch (choice) {
//
//			case 1:
//				System.out.println("Admin Login..");
//				String name = sc.nextLine();
//				String username = sc.nextLine();
//				service.loginCriminal(name, username);
//				break;
//
//			case 2:
//
//				System.out.println("View All Criminals Data : ");
//
//				List<Criminal> criminal = service.getAllCriminalDetails();
//
//				criminal.forEach(Crime -> {
//
//					System.out.println("Criminal Name :" + Crime.getCriminal_Name());
//					System.out.println("Criminal Address: " + Crime.getCriminal_Address());
//					System.out.println("Criminal Arrest Date: " + Crime.getArrest_Date());
//					System.out.println("Criminal Crime Place: " + Crime.getPlace_Crime());
//					System.out.println("Criminal Age: " + Crime.getAge());
//					System.out.println("Criminal Crime Type: " + Crime.getCrimeType());
//
//					System.out.println("===============================================");
//				});
//
//				break;
//
//			case 3:
//				System.out.println("Please enter Criminal details : ");
//				Criminal crime = new Criminal();
//				service.registerCriminal(crime);
//				break;
//
//			case 4:
//				System.out.println("Please enter Criminal Id to search : ");
//				Integer Criminal_Id = sc.nextInt();
//				service.getCriminalByID(Criminal_Id);
//				break;
//
//			case 5:
//				System.out.println("Information get from Police station Information : ");
//				String area = sc.nextLine();
//				service.getAllCriminalsByPolice_Station_name(area);
//				break;
//
//			case 6:
//				System.out.println("Please enter criminalId to delete : ");
//
//				service.getAllCriminalDetails();
//				break;
//
//			case 7:
//
//				App.exitApp();
//				break;
//
//			default:
//
//				System.out.println("Wrong Credentials..!!");
//				break;
//
//			}
//			sc.close();
//		} catch (Exception e) {
//			App.error(e.getMessage());
//			App.selectOption();
//		}
//	}
//
//	public static void error(String message) {
//		System.out.println("Wrong Credentials..!!");
//
//	}
//
//	public static void main(String[] args) {
//		App.selectOption();
//
//	}

	public static void main(String[] args) throws SQLException, CriminalException, Police_StationException {

		System.out.println("*****Welcome to Crime Management System Application*****");
		System.out.println("Press 1 to Login as Assistant Police Inspector");
		System.out.println("Press 2 to Login as Sub-Inspector ");

		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();

		while (true) {

			System.out.println("Enter UserName");
			String username = in.next();

			System.out.println("Enter Password");

			String password = in.next();
			CriminalDao edao = new CriminalDaoImpl();

			if (edao.PoliceOfficer(username, password)) {
				System.out.println("Sucessfully LoggedIn");
				System.out.println("Please Select Queries which you want to Apply ");

				System.out.println("\n  Please select an Option to continue...");
				System.out.println("\n1. View All Criminals Data " + " \n2. Please enter Criminal details"
						+ " \n3. Please enter Criminal Id to search" + " \n4. Information get from Police station name"
						+ " \n5. Please enter criminalId to delete" + " \n6. Exit the App");

				switch (choice) {

				case 1:
					GetAllCriminalUseCase.main(args);
					break;

				case 2:
					RegisterCriminal.main(args);
					break;

				case 3:
					GetCriminalbyID.main(args);
					break;

				case 4:
					GetCriminalsFromPolice_StationUseCase.main(args);
					break;

				case 5:
					DeleteCriminalFromRegister.main(args);
					break;

				case 6:
					App.exitApp();
					break;

				}
				break;

			} else {

				System.out.println("Please Check Credentials");
			}

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
