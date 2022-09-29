package com.masai.usecases;

import java.rmi.StubNotFoundException;
import java.util.Scanner;
import com.masai.bean.Criminal;
import com.masai.bean.Police_Station;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;

public class RegisterPolice_Station {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Police-Station name:");
		String PoliceStation_Name = sc.nextLine();

		System.out.println("Enter Police Station Area :");
		String PoliceStation_Area = sc.nextLine();

		CriminalDao dao = new CriminalDaoImpl();

		Police_Station police = new Police_Station();
		
		police.setPoliceStation_Name(PoliceStation_Name);

		police.setPoliceStation_Area(PoliceStation_Area);

		String result = dao.registerPoliceStation(police);

		System.out.println(result);
	}

}
