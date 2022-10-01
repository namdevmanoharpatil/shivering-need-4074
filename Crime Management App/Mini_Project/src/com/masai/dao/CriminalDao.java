package com.masai.dao;

import java.util.List;

import com.masai.bean.CrimeDTO;
import com.masai.bean.Criminal;
import com.masai.bean.CriminalDTO;
import com.masai.bean.Police_Station;
import com.masai.bean.SuspectsDTO;
import com.masai.bean.VictimsDTO;
import com.masai.exceptions.Police_StationException;
import com.masai.exceptions.CriminalException;

public interface CriminalDao {


	public String registerCriminal(Criminal criminal); // REgister the Criminal

	public String registerPoliceStation(Police_Station police); // Register the Police Station:

	public Criminal getCriminalByID(int Criminal_Id) throws CriminalException; // Get all Criminals by ID

	public Criminal getCriminalByCrimeType(String CrimeType, String Arrest_Date) throws CriminalException;
	
	public List<SuspectsDTO> getSuspectsfromCrimeRegister(String Suspects_Name) throws Police_StationException;
	
	public List<VictimsDTO> getVictimsfromCrimeRegister(String Victims_Name) throws Police_StationException;
	
	public Criminal loginCriminal(String username, String password) throws CriminalException; // Login Criminal

	public List<Criminal> getAllCriminalDetails() throws CriminalException; // Get all Criminals

	public String registerCriminalInsideAStation(int StationId, int Criminal_Id) // Register new Criminal
			throws CriminalException, Police_StationException;

	public List<CriminalDTO> getAllCriminalsByPolice_Station_name(String PoliceStation_Area) // Searching By Police
																								// station name;
			throws Police_StationException;

	public List<Criminal> DeleteCriminalFromRegister(int Criminal_Id) throws CriminalException; // Delete criminal;

	public boolean PoliceOfficer(String username, String password); // Login of Officer ;

	public String GetNumberOfCases_solved() throws  Exception;

	public String GetNumberOfCases_Month() throws CriminalException, Exception;
	
}
