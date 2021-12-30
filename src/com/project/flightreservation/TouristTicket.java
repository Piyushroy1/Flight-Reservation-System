package com.project.flightreservation;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

//IMPORTING THE INSTANCES OF PASSENGER ADDRESS AND PASSENGER CONTACT CLASS
import com.project.flightreservation.Passenger.Address;
import com.project.flightreservation.Passenger.Contact;

//"TOURIST TICKET" CLASS IS A CHILD CLASS OF "TICKET" IN WHICH
//ALL THE TICKET DETAILS ARE STORED AND THE TOURIST DETAILS
//OF THEIR HOTEL AND TOURIST LOCATIONS ARE ALSO STORED
public class TouristTicket extends Ticket{									//IMPLEMENTATION OF INHERITANCE


	//CREATING OBJECTS OF "FLIGHT" AND "PASSENGER" CLASS IN ORDER TO 
	//CALL THE METHODS AND INSTANTIATE THE ATTRIBUTES WITH RESPECT TO 
	//THE "TOURIST TICKET"
	Passenger passenger_object=new Passenger();
	Flight flight_object=new Flight();
	
	

	//CONTACT AND ADDRESS CLASSES ARE NESTED SO, IT REQUIRES A SPECIAL TYPE OF
	//OBJECT CREATION
	Passenger.Contact passenger_contact_object= passenger_object.new Contact();
	Passenger.Address passenger_address_object=passenger_object.new Address();


	Scanner sc=new Scanner(System.in);

	//NO-ARG CONSTRUCTOR
	public TouristTicket() {}
	

	//CALLING THE METHOD "gettingTicketDetails()" FOR STORING THE FLIGHT DETAILS
	//THAT THE PASSENGER HAS CHOSEN
	public void gettingTicketDetails() {
		flight_object.FlightSelection();
	}
	
	//THIS METHOD WILL INCREASE THE SEATS BOOKED BY 1 WHENEVER A PASSENGER BOOKS A SEAT
	public void booking_seat_status() {
		flight_object.checkSeatBooking("1");
	}
	
	//THIS METHOD STORES ALL THE CONTACT DETAILS OF THE PASSENGER
	public void gettingContactDetails() {
		passenger_contact_object.getContactDetails();
	}
	
	//THIS METHOD STORES ALL THE ADDRESS DETAILS OF THE PASSENGER
	public void gettingAddressDetails() {
		passenger_address_object.getAddressDetails();
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
	
	
	
	//THIS IS INSTANTIATION OF ANOTHER ABSTRACT METHOD INSIDE THE PARENT ABSTRACT CLASS "TICKET"
	//THIS METHOD PRINTS THE TICKET WITH THE WHOLE DETAILS OF THE PASSENGER.
	public void printTicket(int choice9,String Hotel_Address,String[] Tourist_Locations_selected,String[] flight,String[] contact, String address[]) {												//POLYMORPHISM IMPLEMENTATION
		System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~YOUR TICKET HAS BEEN SUCCESSFULLY BOOKED~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("YOUR TICKET DETAILS ARE AS FOLLOWS--> \n");
		gettingPNRDetails();
		System.out.println("\nTYPE OF TICKET BOOKED: TOURIST TICKET\n");
			System.out.println("HOTEL ADDRESS: "+Hotel_Address);
			System.out.println("\nSELECTED TOURIST LOCATIONS: ");
			for(int y=0;y<5;y++) {
				System.out.println("Location "+(y+1)+": "+Tourist_Locations_selected[y]);}
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