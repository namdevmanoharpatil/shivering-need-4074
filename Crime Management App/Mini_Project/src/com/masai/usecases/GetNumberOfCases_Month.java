package com.masai.usecases;

import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;
import com.masai.exceptions.CriminalException;

public class GetNumberOfCases_Month {

	public static void main(String[] args) throws Exception {

		CriminalDao dao = new CriminalDaoImpl();

		try {
			String criminal = dao.GetNumberOfCases_Month();

			System.out.println(criminal);

		} catch (CriminalException se) {
			System.out.println(se.getMessage());
		}

	}

}
