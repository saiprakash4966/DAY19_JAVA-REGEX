package com.bl;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User 
{
	Scanner sc = new Scanner(System.in);

	/**
	 * creating method firstNameCheck to check firstName is valid or not
	 */
	public void firstNameCheck() {
		System.out.print("Enter First Name of User: ");
		String fName = sc.next();
		/*
		 * As a User need to enter a valid firstName -firstName starts with Cap and has
		 * minimum 3 characters
		 */

		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
		if (check)
			System.out.println("Valid");
		else
			System.out.println("Please Enter a Valid firstName with Only \"One Starting Capital\" letter");
	}

	/**
	 * creating method lastNameCheck to check lastName is valid or not
	 */
	public void lastNameCheck() {
		/*
		 * It will take the input from the User
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Name of User: ");
		String lName = sc.next();
		/*
		 * As a User needs to check the regex pattern for the lastName
		 */
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
		if (check)
			System.out.println("Valid");
		else
			System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" letter");
	}

	/**
	 * creating method email() to check email is valid or not
	 */
	public void email() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Email of User: ");
		String eMail = sc.next();
		/*
		 * As a User needs to check the regex pattern for the emailId
		 */
		boolean check = Pattern
				.matches("([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*", eMail);
		if (check)
			System.out.println("Valid");
		else
			System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
	}

	/**
	 * creating method mobileNum() to check mobileNum is valid or not
	 */
	public void mobileNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mobile number with country code (91)  : ");
		String mobileNum = sc.nextLine();
		/*
		 * As a User needs to check the regex pattern for the MobileNumber
		 */
		boolean check = Pattern.matches("^[+0-9]{2}{10}$", mobileNum);
		if (check)
			System.out.println("Valid");
		else
			System.out.println("Please Enter a Valid Mobile Num ex:- 91 9121912144");
	}

	/**
	 * create method password() which contains minimum 8 characters
	 */
	public void passWord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[a-zA-Z]{8,}", passWord);
		if (check)
			System.out.println("Valid");
		else
			System.out.println("Please Enter a Valid password, it should have minimum 8 characters");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * It will take input from the User
		 */
		User user = new User();

		System.out.println("Welcome to User Registration Program");

		user.firstNameCheck();
		user.lastNameCheck();
		user.email();
		user.mobileNum();
		user.passWord();
	}
}