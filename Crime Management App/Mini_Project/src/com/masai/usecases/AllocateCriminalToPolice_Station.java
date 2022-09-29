package com.masai.usecases;

import java.util.Scanner;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;

public class AllocateCriminalToPolice_Station {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Police_Station_id :");
		int StationId = sc.nextInt();

		System.out.println("Enter the Criminal Id:");
		int Criminal_Id = sc.nextInt();

//		System.out.println("Enter the Police Station Area: ");
//		String PoliceStation_Area = sc.next();

		CriminalDao dao = new CriminalDaoImpl();

		try {
			String result = dao.registerCriminalInsideAStation(StationId, Criminal_Id);

			System.out.println(result);
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}
