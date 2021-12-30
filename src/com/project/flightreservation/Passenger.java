package com.project.flightreservation;

import java.util.*;

//"PASSENGER" CLASS IS RESPONISBLE FOR TAKING INPUTS FROM USER ABOUT 
//THE BASIC CONTACT AND ADDRESS DETAILS OF THE PASSENGER AND STORING
//IT INSIDE AN ARRAY LIST
public class Passenger {
	
	//DECLARING ARRAYLIST TO KEEP THE RECORDS OF THE PASSENGERS STORED
	public ArrayList<String> Passenger_contact=new ArrayList<String>();
	public ArrayList<String> Passenger_address=new ArrayList<String>();
	
	//STATIC ATTRIBUTES
	public static Contact Contact;
	public static Address Address;
	
	//ENCAPSULATING THE ATTRIBUTES OF PASSENGER CLASS
	private String P_name;
	private String Cont_num;
	private String Cont_email;
	private String street;
	private String city;
	private String state;

	Scanner sc=new Scanner(System.in);
	
	//NO-ARG CONSTRUCTOR
	public Passenger() {}
	
	//PAREMETERISED CONSTRUCTOR
	public Passenger(String P_name,String Cont_num,String Cont_email,String street,String city,String state) {
		this.P_name=P_name;
		this.Cont_num=Cont_num;
		this.Cont_email=Cont_email;
		this.street=street;
		this.city=city;
		this.state=state;
	}
	
	//GETTERS AND SETTERS
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		this.P_name = p_name;
	}
	public String getCont_num() {
		return Cont_num;
	}
	public void setCont_num(String cont_num) {
		this.Cont_num = cont_num;
	}
	public String getCont_email() {
		return Cont_email;
	}
	public void setCont_email(String cont_email) {
		this.Cont_email = cont_email;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//NESTED CLASS Contact INSIDE PASSENGER CLASS
	class Contact{

		//A METHOD NAMED getContactDetails() TO FETCH THE CONTACT DETAILS FROM THE PASSENGER
		public void getContactDetails() {
			
			System.out.println("\nEnter your Contact Details-->");
				System.out.print("Enter your Name: ");
				setP_name(sc.nextLine());
				Passenger_contact.add(P_name); //INSERTING IN ARRAYLIST "PASSENGER CONTACT"
				System.out.print("Enter your Contact Number: ");
				setCont_num(sc.nextLine());
				
				//IF THE CONTACT NUMBER ENTERED IS NOT OF 10 DIGITS, THE PASSENGER HAS TO REWRITE AGAIN 
				if(getCont_num().length()<10 && getCont_num().length()>10) {
					System.out.print("Invalid format of Contact number....Rewrite Again");
					System.out.print("Please enter your correct Contact Number: ");
					setCont_num(sc.nextLine());
					Passenger_contact.add(Cont_num); //INSERTING IN ARRAYLIST "PASSENGER CONTACT"
				}
				else
					Passenger_contact.add(Cont_num);
				System.out.print("Enter your Contact Email Id: ");
				setCont_email(sc.nextLine());
				Passenger_contact.add(Cont_email); //INSERTING IN ARRAYLIST "PASSENGER CONTACT"
				
				
				//DISPLAYING THE ARRAYLIST "PASSENGER CONTACT"
				System.out.println("\nThe Contact details that you have entered are: ");  
				for(String str: Passenger_contact)
					System.out.println(str);
			
		}
		public ArrayList<String> getList1(){
			return Passenger_contact;
			}
	}
	//NESTED CLASS Contact INSIDE PASSENGER CLASS
	class Address{
		//A METHOD NAMED getAddressDetails() TO FETCH THE ADDRESS DETAILS FROM THE PASSENGER
		public void getAddressDetails() {
			System.out.println("\nEnter your Address Details-->");
				System.out.print("Enter your Street: ");
				setStreet(sc.nextLine());
				Passenger_address.add(street);	//INSERTING IN ARRAYLIST "PASSENGER ADDRESS"
				System.out.print("Enter your City: ");
				setCity(sc.nextLine());
				Passenger_address.add(city);	//INSERTING IN ARRAYLIST "PASSENGER ADDRESS"
				System.out.print("Enter your State: ");
				setState(sc.nextLine());
				Passenger_address.add(state);	//INSERTING IN ARRAYLIST "PASSENGER ADDRESS"
				
				//DISPLAYING ARRAYLIST "PASSENGER ADDRESS"
				System.out.println("\nThe Address details that you have entered are: ");
				for(String str:Passenger_address)
					System.out.println(str);

			
		}
		public ArrayList<String> getList2(){
			return Passenger_address;
			}
			
		}
	}