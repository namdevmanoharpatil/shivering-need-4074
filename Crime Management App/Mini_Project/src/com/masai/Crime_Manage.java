package com.masai;

import java.util.Scanner;

import com.masai.dao.CriminalDao;

public class Crime_Manage {

	private static void exitApp() {

		System.out.println("Thanks for using this App !");
		System.exit(0);
	}

	public static void selectOption() {

		try {

			System.out.println("\nPlease select an option to continue");
			System.out.println(
					"\n1.View All Criminlas Data " + "\n2. View Criminal by its id " + "\n3. Add new Criminal Data "
							+ "\n4. Criminals details to update " + "\n5. criminalId to delete   ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("List of all Criminals");
//				CriminalDao.getAllCriminalsDetails();
				break;

			case 2:
				System.out.println("Please enter Criminal Id to search : ");

//				CriminalDao.getStudentByRoll();
				break;

			case 3:
				System.out.println("Please enter Criminal details: ");

//				CriminalDao.registerStudent();
				break;

			case 4:
				System.out.println("Please enter Criminals details to update : ");

//				CriminalDao.getAllCriminalsDetails();
				break;

			case 5:
				System.out.println("Please enter criminalId to delete : ");

//				CriminalDao.getAllCriminalsDetails();
				break;

			case 6:

				Crime_Manage.exitApp();
				break;

			default:

				System.out.println("Wrong Credintials..!!");
				break;

			}
			sc.close();
		} catch (Exception e) {
			Crime_Manage.error(e.getMessage());
			Crime_Manage.selectOption();
		}
	}

	private static void error(String message) {
		System.out.println("Wrong Credintials..!!");

	}

}
