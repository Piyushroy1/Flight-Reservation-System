package com.project.flightreservation;

import java.util.*;


//"TICKET CLASS" IS AN ABSTRACT PARENT CLASS WHICH CONTAINS
//FEW ABSTRACT METHODS, THAT ARE COMMON TO BOTH "REGULAR TICKET"
//AND "TOURIST TICKET"
public abstract class Ticket {							//DEMONSTRATION OF AGGREGATION AND COMPOSITION RELATIONSHIP BETWEEN TICKET 
														//AND REGULAR TICKET AND TOURIST TICKET

	//GENERATES PNR
	public abstract void  gettingPNRDetails();

	//PRINTS THE TICKET OF THE PASSENGER,
	//THESE TAKES ARGUMENTS SPECIFIC TO REGULAR AND TOURIST TICKETS
	//AND TAKES ARGUMENTS OF PASSENGER AND TICKET TYPES TO PRINT THE TICKETS
	public abstract void printTicket(int choice9,String Hotel_Address, String[] Tourist_Locations_selected,String[] flight,String[] contact, String[] address);

	//PROMPTS THE PASSENGER TO GIVE THE FLIGHT DETAILS THAT IS CHOSEN
	public abstract void gettingTicketDetails();
	
	public abstract void booking_seat_status();

	//GETS THE CONTACT DETAILS OF THE PASSENGER
	public abstract void gettingContactDetails();

	//GETS THE ADDRESS DETAILS OF THE PASSENGER
	public abstract void gettingAddressDetails();

}