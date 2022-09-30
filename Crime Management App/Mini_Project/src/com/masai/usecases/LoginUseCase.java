package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Criminal;
import com.masai.bean.PoliceOfficer;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;
import com.masai.exceptions.CriminalException;

public class LoginUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username:");
		String uname = sc.next();

		System.out.println("Enter Password:");
		String pass = sc.next();

		// CriminalDao dao = new CriminalDaoImpl();
		CriminalDao dao = new CriminalDaoImpl();

		try {
			Criminal criminal = dao.loginCriminal(uname, pass);

			System.out.println("Welcome Officer :" + criminal.getCriminal_Name());

		} catch (CriminalException e) {
			System.out.println(e.getMessage());
		}
	}

}
