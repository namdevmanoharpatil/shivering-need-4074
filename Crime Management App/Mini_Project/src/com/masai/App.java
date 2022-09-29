package com.masai;

import com.masai.usecases.LoginUseCase;

public class App extends Crime_Manage {

	public static void main(String[] args) {
		Crime_Manage crime_manage = new Crime_Manage();
		System.out.println("Start !!!");
		System.out.println("Welcome to Crime Management System Application");
		crime_manage.selectOption();
	}
}
