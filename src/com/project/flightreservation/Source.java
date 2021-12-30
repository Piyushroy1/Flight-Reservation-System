package com.project.flightreservation;
import java.util.*;


//THIS IS THE IMPLEMENTATION CLASS, WHERE ALL THE OBJECTS ARE INITIALISED 
//AND ALL THE METHODS OF ALL THE CLASSES ARE CALLED AND IMPLEMENTED
public class Source {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//OBJECT OF FLIGHT CLASS
		Flight f=new Flight();

		//OBJECT OF REGULAR TICEKT CLASS
		RegularTicket r=new RegularTicket();

		//OBJECT OF TOURIST TICKET CLASS
		TouristTicket t=new TouristTicket();

		//OBJECTS OF PARENT TICKET CLASS
		Ticket Parent_Ticket_Tourist=new TouristTicket();
		Ticket Parent_Ticket_Regular=new RegularTicket();
		Ticket Regular_Ticket_flight=new RegularTicket();
		Ticket Tourist_Ticket_flight=new TouristTicket();
		Ticket Tourist_Address=new TouristTicket();
		Ticket Regular_Address=new TouristTicket();
		Ticket Regular_Contact=new TouristTicket();
		Ticket Tourist_Contact=new TouristTicket();

		//CHOICE9 WILL STORE THE SPECIAL SERVICES NUMBER ENTERED BY THE PASSENGER
		int choice9;

		//STORES THE ADDRESS OF THE HOTEL FOR THE PASSENGERS SELECTING TOURIST TICKETS
		String Hotel_Address=null;

		//THE TOURIST LOCATIONS THAT THE PASSENGERS ARE PLANNING TO VISIT ON SELECTING TOURIST TICKETS
		String[] Tourist_Locations_selected=new String[5];

		//NESTED CLASS OBJECTS OF PASSENGER CLASS
		Passenger.Contact c=new Passenger().new Contact();
		Passenger.Address a=new Passenger().new Address();

		//STARTING OF THE PROJECT
		System.out.println("                                         ..........WELCOME TO FLIGHT RESERVATION SYSTEM..........\n");
		System.out.println("                                                      MADE BY- PIYUSH ROY CHOWDHURY\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Press 1 to see available flights and Press 2 to book a flight-->");
		int choice=sc.nextInt();

		//IMPLEMENTATION OF SWITCH-CASE
		switch(choice) {          


		//CASE1: WHEN THE PASSENGER WANTS TO SEE THE AVIALBLE FLIGHTS AND THEN BOOK IT
		case 1:{
			//DISPLAYING THE AVAILABLE FLIGHTS IN THE SYSTEM
			f.getFlightDetails();

			System.out.println("\nDo you want to book a flight?  yes-->press 1  or  no-->press 2");
			int choice1=sc.nextInt();
			if(choice1==1) {
				System.out.println("");

				//SELECTION OF THE TYPE OF THE TICKET BY THE PASSENGER
				System.out.println("Enter the type of the ticket you want to book: ");
				System.out.println("1.Tourist");
				System.out.println("2.Regular");
				int choice8=sc.nextInt();
				if(choice8==1) {  						//IF TOURIST TICKET IS SELECTED

					//PROMPTS THE PASSENGER TO FETCH THE FLIGHT DETAILS FROM THE FLIGHT CLASS
					Tourist_Ticket_flight.gettingTicketDetails();
					System.out.println("\nPLEASE RE-ENTER YOUR FLIGHT DETAILS TO BE PRINTED ON THE TICKET--> ");
					String[] reentering_Flight=new String[3];
					System.out.print("Enter your Departure Location: ");
					reentering_Flight[0]=sc.next();
					System.out.print("Enter your Destination Location: ");
					reentering_Flight[1]=sc.next();
					System.out.print("Enter your Flight Number: ");
					reentering_Flight[2]=sc.next();

					//PROMPTS THE PASSENGER TO FETCH THE CONTACT DETAILS FROM THE PASSENGER-CONTACT NESTED CLASS
					Tourist_Contact.gettingContactDetails();
					System.out.println("\nPLEASE RE-ENTER YOUR CONTACT DETAILS TO BE PRINTED ON THE TICKET--> ");
					String[] reentering_Contact=new String[3];
					System.out.print("Enter your Name: ");
					reentering_Contact[0]=sc.next();
					System.out.print("Enter your Contact Number: ");
					reentering_Contact[1]=sc.next();
					System.out.print("Enter your Contact Email Id: ");
					reentering_Contact[2]=sc.next();
					
					System.out.println("\n\nTHANKYOU FOR RE-ENTERING THE DETAILS...\n\n");

					//PROMPTS THE PASSENGER TO FETCH THE ADDRESS DETAILS FROM THE PASSENGER-ADDRESS NESTED CLASS
					Tourist_Address.gettingAddressDetails();
					System.out.println("\nPLEASE RE-ENTER YOUR ADDRESS DETAILS TO BE PRINTED ON THE TICKET--> ");
					String[] reentering_address=new String[3];
					System.out.print("Enter your Street: ");
					reentering_address[0]=sc.next();
					System.out.print("Enter your City: ");
					reentering_address[1]=sc.next();
					System.out.print("Enter your State: ");
					reentering_address[2]=sc.next();
					
					System.out.println("\n\nTHANKYOU FOR RE-ENTERING THE DETAILS...\n");

					//UNIQUE TO THE TOURIST TICKETS
					System.out.println("\nAS YOU HAVE SELECTED TOURIST TICKET, SO PLEASE FILL THE FOLLOWING DETAILS--> \n");
					System.out.print("Enter your hotel address: ");
					Hotel_Address=sc.next();
					System.out.println("Enter the 5 tourist locations that you are planning to visit: ");
					for(int k=0;k<5;k++) {
						System.out.print("Location "+(k+1)+": ");
						//STORING  THE TOURIST LOCATIONS IN AN ARRAY BECAUSE FIXED SIZE OF 5 IS ALREADY MENTIONED
						Tourist_Locations_selected[k]= sc.next();
					}
					//CALLING OF THE PRINT TICKET METHOD USING PARENT TICKET CLASS OBJECT IN ORDER TO PRINT THE COMPLETE TICKET
					Parent_Ticket_Tourist.printTicket(choice8,Hotel_Address,Tourist_Locations_selected,reentering_Flight,reentering_Contact,reentering_address);
					break;
				}
				if(choice8==2) {						//IF REGULAR TICKET IS SELECTED

					//PROMPTS THE PASSENGER TO FETCH THE FLIGHT DETAILS FROM THE FLIGHT CLASS
					Regular_Ticket_flight.gettingTicketDetails();
					System.out.println("\nPLEASE RE-ENTER YOUR FLIGHT DETAILS TO BE PRINTED ON THE TICKET--> ");
					String[] reentering_Flight=new String[3];
					System.out.print("Enter your Departure Location: ");
					reentering_Flight[0]=sc.next();
					System.out.print("Enter your Destination Location: ");
					reentering_Flight[1]=sc.next();
					System.out.print("Enter your Flight Number: ");
					reentering_Flight[2]=sc.next();

					//PROMPTS THE PASSENGER TO FETCH THE CONTACT DETAILS FROM THE PASSENGER-CONTACT NESTED CLASS
					Regular_Contact.gettingContactDetails();
					System.out.println("\nPLEASE RE-ENTER YOUR CONTACT DETAILS TO BE PRINTED ON THE TICKET--> ");
					String[] reentering_Contact=new String[3];
					System.out.print("Enter your Name: ");
					reentering_Contact[0]=sc.next();
					System.out.print("Enter your Contact Number: ");
					reentering_Contact[1]=sc.next();
					System.out.print("Enter your Contact Email Id: ");
					reentering_Contact[2]=sc.next();
					
					System.out.println("\n\nTHANKYOU FOR RE-ENTERING THE DETAILS...\n");

					//PROMPTS THE PASSENGER TO FETCH THE ADDRESS DETAILS FROM THE PASSENGER-ADDRESS NESTED CLASS
					Regular_Address.gettingAddressDetails();
					System.out.println("\nPLEASE RE-ENTER YOUR ADDRESS DETAILS TO BE PRINTED ON THE TICKET--> ");
					String[] reentering_address=new String[3];
					System.out.print("Enter your Street: ");
					reentering_address[0]=sc.next();
					System.out.print("Enter your City: ");
					reentering_address[1]=sc.next();
					System.out.print("Enter your State: ");
					reentering_address[2]=sc.next();
					
					System.out.println("\n\nTHANKYOU FOR RE-ENTERING THE DETAILS...\n");

					//UNIQUE TO REGULAR TICKETS
					System.out.print("\nAS YOU HAVE SELECTED REGULAR TICKET, SO PLEASE FILL THE FOLLOWING DETAILS--> \n");
					System.out.println("Enter the special services that you want to add to your ticket: ");
					System.out.println("1.IF YOU DONT WANT TO ADD ANYTHING (PRESS 1)");
					System.out.println("2.FOOD-->PRESS 2");
					System.out.println("3.WATER-->PRESS 3");
					System.out.println("4.SNACKS-->PRESS 4");
					System.out.println("5.FOOD & SNACKS-->PRESS 5");
					System.out.println("6.WATER & SNACKS-->PRESS 6");
					System.out.println("7.FOOD & WATER-->PRESS 7");
					System.out.println("8.FOOD & WATER & SNACKS-->PRESS 8");
					System.out.print("\n Enter your choice: ");
					choice9=sc.nextInt();
					r.getRegularDetails(choice9);

					//CALLING OF THE PRINT TICKET METHOD USING PARENT TICKET CLASS OBJECT IN ORDER TO PRINT THE COMPLETE TICKET
					Parent_Ticket_Regular.printTicket(choice9,Hotel_Address,Tourist_Locations_selected,reentering_Flight,reentering_Contact,reentering_address);
					break;
				}
			}
			//IF THE PASSENGER SELECTS "NO" WHEN ASKED, DO YOU WISH TO BOOK A TICKET?
			else if(choice1==2) {
				System.exit(0);
			}

			//IF THE PASSENGER ENTERS INVALID CHOICE
			else {
				System.out.print("Invalid choice");
				System.exit(0);
			}
			break;
		}

		//CASE2: WHEN THE PASSENGER DIRECTLY WANTS TO BOOK A FLIGHT
		case 2:{
			System.out.println("");
			System.out.println("Enter the type of the ticket you want to book: ");
			System.out.println("1.Tourist");
			System.out.println("2.Regular");
			int choice8=sc.nextInt();
			if(choice8==1) {

				//THE PASSENGER TO FETCH THE FLIGHT DETAILS FROM THE FLIGHT CLASS
				Tourist_Ticket_flight.gettingTicketDetails();
				System.out.println("\nPLEASE RE-ENTER YOUR FLIGHT DETAILS TO BE PRINTED ON THE TICKET--> ");
				String[] reentering_Flight=new String[3];
				System.out.print("Enter your Departure Location: ");
				reentering_Flight[0]=sc.next();
				System.out.print("Enter your Destination Location: ");
				reentering_Flight[1]=sc.next();
				System.out.print("Enter your Flight Number: ");
				reentering_Flight[2]=sc.next();

				//PROMPTS THE PASSENGER TO FETCH THE CONTACT DETAILS FROM THE PASSENGER-CONTACT NESTED CLASS
				Tourist_Contact.gettingContactDetails();
				System.out.println("\nPLEASE RE-ENTER YOUR CONTACT DETAILS TO BE PRINTED ON THE TICKET--> ");
				String[] reentering_Contact=new String[3];
				System.out.print("Enter your Name: ");
				reentering_Contact[0]=sc.next();
				System.out.print("Enter your Contact Number: ");
				reentering_Contact[1]=sc.next();
				System.out.print("Enter your Contact Email Id: ");
				reentering_Contact[2]=sc.next();
				
				System.out.println("\n\nTHANKYOU FOR RE-ENTERING THE DETAILS...\n");

				//PROMPTS THE PASSENGER TO FETCH THE ADDRESS DETAILS FROM THE PASSENGER-ADDRESS NESTED CLASS
				Tourist_Address.gettingAddressDetails();
				System.out.println("\nPLEASE RE-ENTER YOUR ADDRESS DETAILS TO BE PRINTED ON THE TICKET--> ");
				String[] reentering_address=new String[3];
				System.out.print("Enter your Street: ");
				reentering_address[0]=sc.next();
				System.out.print("Enter your City: ");
				reentering_address[1]=sc.next();
				System.out.print("Enter your State: ");
				reentering_address[2]=sc.next();
				
				System.out.println("\n\nTHANKYOU FOR RE-ENTERING THE DETAILS...\n");

				//UNIQUE TO THE TOURIST TICKETS
				System.out.println("\nAS YOU HAVE SELECTED TOURIST TICKET, SO PLEASE FILL THE FOLLOWING DETAILS--> \n");
				System.out.print("Enter your hotel address: ");
				Hotel_Address=sc.next();
				System.out.println("Enter the 5 tourist locations that you are planning to visit: ");
				for(int k=0;k<5;k++) {
					System.out.print("Location "+(k+1)+": ");

					//STORING  THE TOURIST LOCATIONS IN AN ARRAY BECAUSE FIXED SIZE OF 5 IS ALREADY MENTIONED
					Tourist_Locations_selected[k]= sc.next();
				}

				//CALLING OF THE PRINT TICKET METHOD USING PARENT TICKET CLASS OBJECT IN ORDER TO PRINT THE COMPLETE TICKET
				Parent_Ticket_Tourist.printTicket(choice8,Hotel_Address,Tourist_Locations_selected,reentering_Flight,reentering_Contact,reentering_address);
				break;
			}
			if(choice8==2) {

				//PROMPTS THE PASSENGER TO FETCH THE FLIGHT DETAILS FROM THE FLIGHT CLASS
				Regular_Ticket_flight.gettingTicketDetails();
				System.out.println("\nPLEASE RE-ENTER YOUR FLIGHT DETAILS TO BE PRINTED ON THE TICKET--> ");
				String[] reentering_Flight=new String[3];
				System.out.print("Enter your Departure Location: ");
				reentering_Flight[0]=sc.next();
				System.out.print("Enter your Destination Location: ");
				reentering_Flight[1]=sc.next();
				System.out.print("Enter your Flight Number: ");
				reentering_Flight[2]=sc.next();

				//PROMPTS THE PASSENGER TO FETCH THE CONTACT DETAILS FROM THE PASSENGER-CONTACT NESTED CLASS
				Regular_Contact.gettingContactDetails();
				System.out.println("\nPLEASE RE-ENTER YOUR CONTACT DETAILS TO BE PRINTED ON THE TICKET--> ");
				String[] reentering_Contact=new String[3];
				System.out.print("Enter your Name: ");
				reentering_Contact[0]=sc.next();
				System.out.print("Enter your Contact Number: ");
				reentering_Contact[1]=sc.next();
				System.out.print("Enter your Contact Email Id: ");
				reentering_Contact[2]=sc.next();
				
				System.out.println("\n\nTHANKYOU FOR RE-ENTERING THE DETAILS...\n");

				//PROMPTS THE PASSENGER TO FETCH THE ADDRESS DETAILS FROM THE PASSENGER-ADDRESS NESTED CLASS
				Regular_Address.gettingAddressDetails();
				System.out.println("\nPLEASE RE-ENTER YOUR ADDRESS DETAILS TO BE PRINTED ON THE TICKET--> ");
				String[] reentering_address=new String[3];
				System.out.print("Enter your Street: ");
				reentering_address[0]=sc.next();
				System.out.print("Enter your City: ");
				reentering_address[1]=sc.next();
				System.out.print("Enter your State: ");
				reentering_address[2]=sc.next();
				
				System.out.println("\n\nTHANKYOU FOR RE-ENTERING THE DETAILS...\n");

				//UNIQUE TO REGULAR TICKETS
				System.out.print("\nAS YOU HAVE SELECTED REGULAR TICKET, SO PLEASE FILL THE FOLLOWING DETAILS--> \n");
				System.out.println("Enter the special services that you want to add to your ticket: ");
				System.out.println("1.IF YOU DONT WANT TO ADD ANYTHING (PRESS 1)");
				System.out.println("2.FOOD-->PRESS 2");
				System.out.println("3.WATER-->PRESS 3");
				System.out.println("4.SNACKS-->PRESS 4");
				System.out.println("5.FOOD & SNACKS-->PRESS 5");
				System.out.println("6.WATER & SNACKS-->PRESS 6");
				System.out.println("7.FOOD & WATER-->PRESS 7");
				System.out.println("8.FOOD & WATER & SNACKS-->PRESS 8");
				System.out.print("\n Enter your choice: ");
				choice9=sc.nextInt();
				
				//THIS METHOD WILL MATCH THE USER ENTERED CHOICE WITH THE AVAILABLE SPECIAL SERVICES IN THE SYSTEM
				//AND WILL STORE THE PRICE OF THAT SPECIAL SERVICE
				r.getRegularDetails(choice9);

				//CALLING OF THE PRINT TICKET METHOD USING PARENT TICKET CLASS OBJECT IN ORDER TO PRINT THE COMPLETE TICKET
				Parent_Ticket_Regular.printTicket(choice9,Hotel_Address,Tourist_Locations_selected,reentering_Flight,reentering_Contact,reentering_address);
				break;
			}

		}
		}
	}
}
