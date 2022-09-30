package com.masai.usecases;

import java.util.List;
import com.masai.bean.Criminal;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;
import com.masai.exceptions.CriminalException;

public class GetAllCriminalUseCase {

	public static void main(String[] args) {

		CriminalDao dao = new CriminalDaoImpl();

		try {
			List<Criminal> criminal = dao.getAllCriminalDetails();

			criminal.forEach(Crime -> {

				System.out.println("Criminal Name :" + Crime.getCriminal_Name());
				System.out.println("Criminal Address: " + Crime.getCriminal_Address());
				System.out.println("Criminal Arrest Date: " + Crime.getArrest_Date());
				System.out.println("Criminal Crime Place: " + Crime.getPlace_Crime());
				System.out.println("Criminal Age: " + Crime.getAge());
				System.out.println("Criminal Crime Type: " + Crime.getCrimeType());

				System.out.println("===============================================");
			});

		} catch (CriminalException se) {
			System.out.println(se.getMessage());
		}

	}

}
