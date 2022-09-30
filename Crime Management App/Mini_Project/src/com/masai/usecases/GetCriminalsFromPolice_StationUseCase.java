package com.masai.usecases;

import java.util.List;
import java.util.Scanner;
import com.masai.bean.CriminalDTO;
import com.masai.dao.CriminalDao;
import com.masai.dao.CriminalDaoImpl;

public class GetCriminalsFromPolice_StationUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Police Station Area :");

		String Station_Area = sc.nextLine();

		CriminalDao dao = new CriminalDaoImpl();

		try {
			List<CriminalDTO> dtos = dao.getAllCriminalsByPolice_Station_name(Station_Area);

			dtos.forEach(dto -> System.out.println(dto));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
