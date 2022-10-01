package com.masai.usecases;

import java.util.List;
import java.util.Scanner;
import com.masai.bean.CriminalDTO;
import com.masai.bean.SuspectsDTO;
import com.masai.bean.VictimsDTO;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;

public class GetVictimsfromCrimeRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Victims Registered in  Police Station  :");

		String Victims_Name = sc.nextLine();

		CriminalDao dao = new CriminalDaoImpl();

		try {
			List<VictimsDTO> dtos = dao.getVictimsfromCrimeRegister(Victims_Name);

			dtos.forEach(dto -> System.out.println(dto));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
