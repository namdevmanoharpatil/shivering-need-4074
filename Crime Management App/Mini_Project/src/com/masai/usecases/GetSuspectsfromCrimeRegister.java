package com.masai.usecases;

import java.util.List;
import java.util.Scanner;
import com.masai.bean.CriminalDTO;
import com.masai.bean.SuspectsDTO;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;

public class GetSuspectsfromCrimeRegister {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Suspect Registered in  Police Station  :");

		String Suspects_Name = sc.nextLine();

		CriminalDao dao = new CriminalDaoImpl();

		try {
			List<SuspectsDTO> dtos = dao.getSuspectsfromCrimeRegister(Suspects_Name);

			dtos.forEach(dto -> System.out.println(dto));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
