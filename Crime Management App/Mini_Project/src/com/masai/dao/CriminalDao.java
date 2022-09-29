package com.masai.dao;

import java.util.List;

import com.masai.bean.Criminal;
import com.masai.bean.CriminalDTO;
import com.masai.bean.Police_Station;
import com.masai.exceptions.Police_StationException;
import com.masai.exceptions.CriminalException;

public interface CriminalDao {

//	public String registerStudent(String name, int marks, String email, String passwrod);

	public String registerCriminal(Criminal criminal);

	public String registerPoliceStation(Police_Station police);

	public Criminal getCriminalByID(int Criminal_Id) throws CriminalException;

	public Criminal loginCriminal(String username, String password) throws CriminalException;

	public List<Criminal> getAllCriminalDetails() throws CriminalException;

	public String registerCriminalInsideAStation(int StationId, int Criminal_Id)
			throws CriminalException, Police_StationException;

	public List<CriminalDTO> getAllCriminalsByPolice_Station_name(String PoliceStation_Area)
			throws Police_StationException;

}
