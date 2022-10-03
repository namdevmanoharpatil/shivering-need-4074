package com.masai.usecases;

import java.util.List;
import java.util.Scanner;
import com.masai.bean.Criminal;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;
import com.masai.exceptions.CriminalException;

public class DeleteCriminalFromRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Criminal ID :");
		int CriminalId = sc.nextInt();
		
		System.out.println("Enter Station ID :");
		int StationId = sc.nextInt();
		

		CriminalDao dao = new CriminalDaoImpl();

		try {
			List<Criminal> criminal = dao.DeleteCriminalFromRegister(CriminalId,StationId);

			System.out.println(criminal);

		} catch (CriminalException se) {
			System.out.println(se.getMessage());
		}

	}
}
