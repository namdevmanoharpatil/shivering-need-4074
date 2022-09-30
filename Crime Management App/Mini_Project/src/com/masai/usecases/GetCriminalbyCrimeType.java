package com.masai.usecases;

import java.util.ArrayList;
import java.util.Scanner;

import com.masai.bean.Criminal;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;
import com.masai.exceptions.CriminalException;

public class GetCriminalbyCrimeType {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Criminal Crime Type :");
		String CrimeType = sc.next();
		
		System.out.println("Enter Criminal Date of Crime :");
		String CrimeDAte = sc.next();

		CriminalDao dao = new CriminalDaoImpl();

		try {
			Criminal criminal = dao.getCriminalByCrimeType(CrimeType, CrimeDAte);

			System.out.println(criminal);

		} catch (CriminalException se) {
			System.out.println(se.getMessage());
		}
	}

}
