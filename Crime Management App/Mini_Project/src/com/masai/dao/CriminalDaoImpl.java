package com.masai.dao;

import java.awt.image.DataBuffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Criminal;
import com.masai.bean.CriminalDTO;
import com.masai.bean.Police_Station;
import com.masai.exceptions.Police_StationException;
import com.masai.exceptions.CriminalException;
import com.masai.utility.DBUtil;

public class CriminalDaoImpl implements CriminalDao {

	// @Override
//	public String registerStudent(String name, int marks, String email, String password) {
//
//		String message = "Not Inserted..";
//
//		try (Connection conn = DBUtil.provideConnection()) {
//
//			PreparedStatement ps = conn
//					.prepareStatement("insert into student(name,marks,email,password) values(?,?,?,?)");
//
//			ps.setString(1, name);
//			ps.setInt(2, marks);
//			ps.setString(3, email);
//			ps.setString(4, password);
//
//			int x = ps.executeUpdate();
//
//			if (x > 0)
//				message = "Student Registered Sucessfully !";
//
//		} catch (SQLException e) {
//			message = e.getMessage();
//		}
//
//		return message;
//	}

	@Override
	public String registerCriminal(Criminal criminal) {

		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into Criminal(Criminal_Name, Criminal_NickName,Arrest_Date, DateOfCrime,Criminal_Address, Place_Crime,Age,Gender,Occupation,BirthMark,CrimeType,CrimeDetails) values(?,?,?,?,?,?,?,?,?,?,?,?)");

			ps.setString(1, criminal.getCriminal_Name());

			ps.setString(2, criminal.getCriminal_NickName());

			ps.setString(3, criminal.getArrest_Date());

			ps.setString(4, criminal.getDateOfCrime());

			ps.setString(5, criminal.getCriminal_Address());

			ps.setString(6, criminal.getPlace_Crime());

			ps.setInt(7, criminal.getAge());

			ps.setString(8, criminal.getGender());

			ps.setString(9, criminal.getOccupation());

			ps.setString(10, criminal.getBirthMark());

			ps.setString(11, criminal.getCrimeType());

			ps.setString(12, criminal.getCrimeDetails());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Criminal Registered Sucessfully !";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;

	}

	@Override
	public String registerPoliceStation(Police_Station police) {

		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into Police_Station(PoliceStation_Name, PoliceStation_Area) values(?,?)");

			ps.setString(1, police.getPoliceStation_Name());

			ps.setString(2, police.getPoliceStation_Area());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Police Station Registered Sucessfully !";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public Criminal getCriminalByID(int Criminal_Id) throws CriminalException {

		Criminal criminal = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Criminal where Criminal_Id=?");

			ps.setInt(1, Criminal_Id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				int id = rs.getInt("Criminal_Id");
				String na = rs.getString("Criminal_Name");
				String p1 = rs.getString("Criminal_NickName");
				String p2 = rs.getString("Arrest_Date");
				String p3 = rs.getString("DateOfCrime");
				String p4 = rs.getString("Criminal_Address");
				String p5 = rs.getString("Place_Crime");
				int age = rs.getInt("Age");
				String p6 = rs.getString("Gender");
				String p7 = rs.getString("Occupation");
				String p8 = rs.getString("birthMark");
				String p9 = rs.getString("crimeType");
				String p10 = rs.getString("crimeDetails");

				criminal = new Criminal(id, na, p1, p2, p3, p4, p5, age, p6, p7, p8, p9, p10);
				;

			} else
				throw new CriminalException("Criminal does not exist with Criminal Id " + Criminal_Id);

		} catch (SQLException e) {

			e.printStackTrace();

			throw new CriminalException(e.getMessage());

		}

		return criminal;

	}

	@Override
	public Criminal loginCriminal(String Criminal_Name, String CrimeType) throws CriminalException {

		Criminal criminal = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("select * from Criminal where Criminal_Name = ? AND CrimeType = ?");

			ps.setString(1, Criminal_Name);
			ps.setString(2, CrimeType);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				int id = rs.getInt("Criminal_Id");
				String na = rs.getString("Criminal_Name");
				String p1 = rs.getString("Criminal_NickName");
				String p2 = rs.getString("Arrest_Date");
				String p3 = rs.getString("DateOfCrime");
				String p4 = rs.getString("Criminal_Address");
				String p5 = rs.getString("Place_Crime");
				int age = rs.getInt("Age");
				String p6 = rs.getString("Gender");
				String p7 = rs.getString("Occupation");
				String p8 = rs.getString("birthMark");
				String p9 = rs.getString("crimeType");
				String p10 = rs.getString("crimeDetails");

				criminal = new Criminal(id, na, p1, p2, p3, p4, p5, age, p6, p7, p8, p9, p10);

			} else
				throw new CriminalException("Invalid Username or password.. ");

		} catch (SQLException e) {
			throw new CriminalException(e.getMessage());
		}

		return criminal;

	}

	@Override
	public List<Criminal> getAllCriminalDetails() throws CriminalException {

		List<Criminal> Criminals = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Criminal");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int id = rs.getInt("Criminal_Id");
				String na = rs.getString("Criminal_Name");
				String p1 = rs.getString("Criminal_NickName");
				String p2 = rs.getString("Arrest_Date");
				String p3 = rs.getString("DateOfCrime");
				String p4 = rs.getString("Criminal_Address");
				String p5 = rs.getString("Place_Crime");
				int age = rs.getInt("Age");
				String p6 = rs.getString("Gender");
				String p7 = rs.getString("Occupation");
				String p8 = rs.getString("birthMark");
				String p9 = rs.getString("crimeType");
				String p10 = rs.getString("crimeDetails");

				Criminal criminal = new Criminal(id, na, p1, p2, p3, p4, p5, age, p6, p7, p8, p9, p10);

				Criminals.add(criminal);

			}

		} catch (SQLException e) {
			throw new CriminalException(e.getMessage());
		}

		if (Criminals.size() == 0)
			throw new CriminalException("No Criminal found..");

		return Criminals;
	}

	@Override
	public String registerCriminalInsideAStation(int StationId, int Criminal_Id)
			throws CriminalException, Police_StationException {

		String message = "Not Resgistered";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Criminal where Criminal_Id =?");

			ps.setInt(1, Criminal_Id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				PreparedStatement ps2 = conn.prepareStatement("select * from Police_Station where StationId=?");

				ps2.setInt(1, StationId);

				ResultSet rs2 = ps2.executeQuery();

				if (rs2.next()) {

					PreparedStatement ps3 = conn.prepareStatement("insert into PoliceStation_Criminal values(?,?)");

					ps3.setInt(1, StationId);
					ps3.setInt(2, Criminal_Id);

					int x = ps3.executeUpdate();

					if (x > 0)
						message = "Criminal Registred/Arrested inside the Police_Station Sucessfully.. ";
					else
						throw new CriminalException("Techical error..");

				} else
					throw new Police_StationException("Invalid Police_Station...");

			} else
				throw new CriminalException("Invalid Criminal...");

		} catch (SQLException e) {
			throw new CriminalException(e.getMessage());
		}

		return message;
	}

	@Override
	public List<CriminalDTO> getAllCriminalsByPolice_Station_name(String PoliceStation_Area)
			throws Police_StationException {

		List<CriminalDTO> dtos = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"select c.Criminal_Id, c.Criminal_Name,c.Criminal_Address, p.PoliceStation_Name, p.PoliceStation_Area from  Criminal c INNER JOIN Police_Station p INNER JOIN PoliceStation_Criminal pc ON c.Criminal_Id = pc.CriminalId AND p.StationId = pc.StationId AND p.PoliceStation_Area= ?");

			ps.setString(1, PoliceStation_Area);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int id = rs.getInt("Criminal_Id");
				String na = rs.getString("Criminal_Name");
				String p1 = rs.getString("Criminal_Address");
				String p2 = rs.getString("policeStation_Name");
				String p3 = rs.getString("policeStation_Area");

				CriminalDTO dto = new CriminalDTO(id, na, p1, p2, p3);

				dtos.add(dto);

			}

		} catch (SQLException e) {
			throw new Police_StationException(e.getMessage());
		}

		if (dtos.isEmpty())
			throw new Police_StationException("No Criminal found in that Police Staion ");

		return dtos;

	}

	@Override
	public List<Criminal> DeleteCriminalFromRegister(int Criminal_Id) throws CriminalException {
		List<Criminal> ccdd = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("delete from Criminal where Criminal_Id = ?");

			ps.setInt(1, Criminal_Id);

			int x = ps.executeUpdate();

			if (x > 0)
				System.out.println(x + " Record deleted Sucessfully");
			else
				System.out.println("Record does not exist.");

		} catch (SQLException e) {
			throw new CriminalException(e.getMessage());
		}

		return ccdd;
	}

	@Override
	public boolean PoliceOfficer(String username, String password) {
		
		return true;
	}

}
