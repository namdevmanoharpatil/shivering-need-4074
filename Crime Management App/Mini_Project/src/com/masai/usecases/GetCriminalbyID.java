package com.masai.usecases;

import java.util.ArrayList;
import java.util.Scanner;

import com.masai.bean.Criminal;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;
import com.masai.exceptions.CriminalException;

public class GetCriminalbyID {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Criminal ID :");
		int Criminal_Id = sc.nextInt();

		CriminalDao dao = new CriminalDaoImpl();

		try {
			Criminal criminal = dao.getCriminalByID(Criminal_Id);

			// List<student>list = new ArrayList<>(criminal);

			System.out.println(criminal);

		} catch (CriminalException se) {
			System.out.println(se.getMessage());
		}

	}

}
