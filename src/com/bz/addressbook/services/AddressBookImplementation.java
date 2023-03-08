package com.bz.addressbook.services;

import java.util.Scanner;


import com.bz.addressbook.interfaces.InterfaceAddressBook;
import com.bz.addressbook.model.Contacts;
import com.bz.addressbook.utility.FileHandlingOfSelf;



public class AddressBookImplementation implements InterfaceAddressBook

{

	private static Scanner getDetailInput = new Scanner(System.in);
	JSONFile selHandling = new JSONFile();
	

	public void welcomeMessage() 
	{
		System.out.println("<<<<<Welcome To AdressBook>>>>>");	
	}

	//FileHandling
	public int createContacts(Contacts contacts) {
		System.out.println(" List of All the Contscts ");
		return selHandling.writeFile(contacts);	

	}		
	//FileHandling
	public void showAllContacts() 
	{
		System.out.println(" Contacts We Have ");
		selHandling.readFile();				
	}









}
