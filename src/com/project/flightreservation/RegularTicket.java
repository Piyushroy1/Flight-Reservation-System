package com.project.flightreservation;

import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

//IMPORTING THE INSTANCES OF PASSENGER ADDRESS AND PASSENGER CONTACT CLASS
import com.project.flightreservation.Passenger.Address;
import com.project.flightreservation.Passenger.Contact;

//"REGULAR TICKET" CLASS IS A CHILD CLASS OF "TICKET" IN WHICH
//ALL THE TICKET DETAILS ARE STORED AND THE SPECIAL SERVICES
//OF THE "REGULAR TICKET" ARE ALSO STORED
public class RegularTicket extends Ticket {				//IMPLEMENTATION OF INHERITANCE

	Scanner sc=new Scanner(System.in);

	public ArrayList<String> Special_service_selected=new ArrayList<String>();



	//CREATING OBJECTS OF "FLIGHT" AND "PASSENGER" CLASS IN ORDER TO 
	//CALL THE METHODS AND INSTANTIATE THE ATTRIBUTES WITH RESPECT TO 
	//THE "REGULAR TICKET"
	Flight flight_object=new Flight();
	Passenger passenger_object=new Passenger();

	//CONTACT AND ADDRESS CLASSES ARE NESTED SO, IT REQUIRES A SPECIAL TYPE OF
	//OBJECT CREATION
	Passenger.Contact passenger_contact_object=new Passenger().new Contact();
	Passenger.Address passenger_address_object=new Passenger().new Address();


	//ENCAPSULATED ATTRIBUTES
	private String special_services;

	//GETTERS AND SETTERS
	public String getSpecial_services() {
		return special_services;
	}

	public void setSpecial_services(String special_services) {
		this.special_services = special_services;
	}

	//NO-ARG CONSTRUCTOR
	public RegularTicket() {}

	//PARAMETERISED CONSTRUCTOR
	public RegularTicket(String special_services) {
		this.special_services=special_services;

	}

	//CALLING THE METHOD "gettingTicketDetails()" FOR STORING THE FLIGHT DETAILS
	//THAT THE PASSENGER HAS CHOSEN
	public void gettingTicketDetails() {
		flight_object.FlightSelection();
	}
	
	//THIS METHOD WILL INCREASE THE SEATS BOOKED BY 1 WHENEVER A PASSENGER BOOKS A SEAT
	public void booking_seat_status() {
		flight_object.checkSeatBooking("2");
	}

	//THIS METHOD STORES ALL THE CONTACT DETAILS OF THE PASSENGER
	public void gettingContactDetails() {
		passenger_contact_object.getContactDetails();
	}


	//THIS METHOD STORES ALL THE ADDRESS DETAILS OF THE PASSENGER
	public void gettingAddressDetails() {
		passenger_address_object.getAddressDetails();
	}


	//THIS IS A METHOD SPECIFIC TO THE CLASS "REGULAR TICKET" BECAUSE IT STORES
	//ALL THE SPECIAL SERVICES THAT THE PASSENGER HAS SELECTED
	public String getRegularDetails(int choice9) {
		if(choice9==1) {
			return ("NOTHING IS ADDED TO YOUR SPECIAL SERVICES. THANKYOU");
		}	

		else if(choice9==2) {
			return("You have added FOOD to your special services, Rs. 299 will be added to your ticket price");

		}

		else if(choice9==3) {
			return("You have added WATER to your special services, Rs. 99 will be added to your ticket price");

		}

		else if(choice9==4) {
			return("You have added SNACKS to your special services, Rs. 199 will be added to your ticket price");

		}
		else if(choice9==5) {
			return("You have added FOOD & SNACKS to your special services, Rs.498  will be added to your ticket price");


		}
		else if(choice9==6) {
			return("You have added WATER & SNACKS to your special services, Rs. 298 will be added to your ticket price");

		}
		else if(choice9==7) {
			return("You have added FOOD & WATER to your special services, Rs. 398 will be added to your ticket price");

		}
		else if(choice9==8) {
			return( "You have added FOOD & WATER & SNACKS to your special services, Rs. 596 will be added to your ticket price");

		}
		else
			return ("INVALID CHOICE");


	}


	//THIS IS INSTANTIATION OF THE ABSTRACT METHOD INSIDE THE PARENT ABSTRACT CLASS "TICKET"
	//WHICH GENERATES RANDOM INTEGER NUMBER AS PNR
	public void gettingPNRDetails(){
		int PNR = ThreadLocalRandom.current().nextInt();
		if(PNR<1) {
			
			System.out.println("PNR NUMBER: "+((-1)*PNR));
		}
		else
			System.out.println("PNR NUMBER: "+PNR);
	}
	
	public ArrayList<String> P_contact=passenger_object.Passenger_contact;
	public ArrayList<String> P_address=passenger_object.Passenger_address;

	//THIS IS INSTANTIATION OF ANOTHER ABSTRACT METHOD INSIDE THE PARENT ABSTRACT CLASS "TICKET"
	//THIS METHOD PRINTS THE TICKET WITH THE WHOLE DETAILS OF THE PASSENGER.
	public void printTicket(int choice9,String Hotel_Address,String[] Tourist_Locations_selected,String[] flight,String[] contact, String address[]) {			//POLYMORPHISM IMPLEMENTATION
		System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~YOUR TICKET HAS BEEN SUCCESSFULLY BOOKED~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("YOUR TICKET DETAILS ARE AS FOLLOWS--> \n");
		gettingPNRDetails();
		System.out.println("\nTYPE OF TICKET BOOKED: REGULAR TICKET\n");
		System.out.println("SPECIAL SERVICES--> ");
		System.out.println(getRegularDetails(choice9));
		System.out.println("\nFLIGHT DETAILS: ");
		System.out.println("DEPARTURE LOCATION: "+flight[0]);
		System.out.println("DESTINATION LOCATION: "+flight[1]);
		System.out.println("FLIGHT NUMBER: "+flight[2]);
		System.out.println("\n\n");
		
		System.out.println("\nPASSENGER CONTACT DETAILS--> ");
		System.out.println("PASSENGER NAME: "+contact[0]);
		System.out.println("PASSENGER CONTACT NUMBER: "+contact[1]);
		System.out.println("PASSENGER CONTACT EMAIL ID: "+contact[2]);
		System.out.println("\n\n");
		
		System.out.println("\nPASSENGER ADDRESS DETAILS--> ");
		System.out.println("STREET: "+address[0]);
		System.out.println("CITY: "+address[1]);
		System.out.println("STATE: "+address[2]);
		System.out.println("\n\n");
		
		System.out.println("\nYOU'LL BE SOON REDIRECTED TO PAYMENT GATEWAY");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~THANKYOU FOR CHOOSING FLIGHT RESERVATION SYSTEM~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}