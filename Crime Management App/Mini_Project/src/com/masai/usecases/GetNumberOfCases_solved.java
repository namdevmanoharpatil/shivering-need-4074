package com.masai.usecases;

import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;
import com.masai.exceptions.CriminalException;

public class GetNumberOfCases_solved {

	public static void main(String[] args) throws Exception {

		CriminalDao dao = new CriminalDaoImpl();

		try {
			String criminal = dao.GetNumberOfCases_solved();

			System.out.println(criminal);

		} catch (CriminalException se) {
			System.out.println(se.getMessage());
		}

	}

}
