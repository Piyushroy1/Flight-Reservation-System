package com.project.flightreservation;
import java.util.*;

//CLASS "FLIGHT" WILL DSIPLAY THE AVAILABLE FLIGHTS IN THE SYSTEM
//AND THEN TAKE THE INPUT FROM THE USER ABOUT WHICH FLIGHT TO BE BOOKED 
// AND DISPLAY THE INPUT DETAILS TO THE USER
public class Flight {

	//THESE ARE THE FOLLOWING FLIGHT OPTIONS AVAILABLE TO BOOK FROM
	public int[] flightno=new int[]{1101,9865,4432,7698,11987,55023,1050,6678,22297,33607}; 
	public String[] airline=new String[]{"AirIndia","AirAsia","Indigo","SpiceJet","Emirates","Vistara","GoFirst","Qatar","Srilankan","Etihad"};
	public int[] capacity=new int[]{552,700,362,259,1090,445,672,467,509,399};
	public int[] seatsBooked=new int[]{196,502,219,97,645,445,234,312,509,157};
	public String[] departure=new String[] {"10:30","14:20","16:50","07:10","09:30","12:15","15:30","17:20","19:10","20:20"};
	public String[] arrival=new String[] {"13:30","16:50","19:10","09:20","13:15","14:45","16:30","20:15","21:30","22:00"};

	//IF THE CAPACITY IS EQUAL TO THE SEATS BOOKED THEN isAvailable WILL RETURN FALSE;
	public boolean isAvailable;

	//AN ARRAY LIST TO STORE THE PASSENGER DETAILS
	ArrayList<String> flightDetails=new ArrayList<String>();

	Scanner sc=new Scanner(System.in);

	//ENCAPSULATING THE ATTRIBUTES OF THE CLASS
	private String from;
	private String to;
	private String choice2;

	//GETTERS AND SETTERS FOR THE PRIVATE ATTRIBUTES
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getChoice2() {
		return choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}


	//THIS METHOD WILL DISPLAY ALL THE AVAILABLE FLIGHT OPTIONS
	public void getFlightDetails() {
		System.out.println("\nTHESE ARE THE LIST OF AIRLINES WITH THEIR CAPACITIES AND SEATS BOOKED AND AVAILIBILITY STATUS: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<10;i++) {
			if(capacity[i]==seatsBooked[i]) {
				isAvailable=false;
				System.out.println("Flight Number: "+flightno[i]+"\tName of the Airline: "+airline[i]+"\tCapacity: "+capacity[i]+"\tSeats Booked: "+seatsBooked[i]+"\tAvailabe for Booking: No");
				System.out.print("\n");
			}

			else {
				isAvailable=true;
				System.out.println("Flight Number: "+flightno[i]+"\tName of the Airline: "+airline[i]+"\tCapacity: "+capacity[i]+"\tSeats Booked: "+seatsBooked[i]+"\tAvailabe for Booking: Yes");
				System.out.print("\n");
			}
		}

	}

	//THIS METHOD WILL TAKE INPUT FROM THE USER, WHEN BOOKING A FLIGHT
	public void FlightSelection() {


			System.out.print("Enter the Departure location: ");
			from=sc.nextLine();
			flightDetails.add(from);
			System.out.println("");
			System.out.print("Enter the Destination location: ");
			to=sc.nextLine();
			flightDetails.add(to);
			System.out.println("");
			System.out.println("These are the available flights from "+from+" to "+to+"-->");
			System.out.println("Please select one flight number: ");
			for(int j=0;j<10;j++) {
				System.out.print("\t"+flightno[j]);
			}
			System.out.println("");
			choice2=sc.nextLine();
			flightDetails.add(choice2);

			//COMPARING THE USER INPUT WITH THE AVAILABLE CHOICES, IF THE PASSENGER SELECTS A FLIGHT 
			//THEN THE SEATS BOOKED WILL INCREASE BY 1
			if(choice2.equals("1101")){
				System.out.println("Flight name: "+airline[0]+", Departure from "+from+" at "+departure[0]+" and arrival at "+to+" at "+arrival[0]);
				
			}
			else if(choice2.equals("9865")){
				System.out.println("Flight name: "+airline[1]+", Departure from "+from+" at "+departure[1]+" and arrival at "+to+" at "+arrival[1]);
				
			}
			else if(choice2.equals("4432")){
				System.out.println("Flight name: "+airline[2]+", Departure from "+from+" at "+departure[2]+" and arrival at "+to+" at "+arrival[2]);
				
			}
			else if(choice2.equals("7698")){
				System.out.println("Flight name: "+airline[3]+", Departure from "+from+" at "+departure[3]+" and arrival at "+to+" at "+arrival[3]);
				
			}
			else if(choice2.equals("11987")){
				System.out.println("Flight name: "+airline[4]+", Departure from "+from+" at "+departure[4]+" and arrival at "+to+" at "+arrival[4]);
				
			}
			else if(choice2.equals("55023")){
				System.out.println("Flight name: "+airline[5]+", Departure from "+from+" at "+departure[5]+" and arrival at "+to+" at "+arrival[5]);
				
			}
			else if(choice2.equals("1050")){
				System.out.println("Flight name: "+airline[6]+", Departure from "+from+" at "+departure[6]+" and arrival at "+to+" at "+arrival[6]);
				
			}
			else if(choice2.equals("6678")){
				System.out.println("Flight name: "+airline[7]+", Departure from "+from+" at "+departure[7]+" and arrival at "+to+" at "+arrival[7]);
				
			}
			else if(choice2.equals("22297")){
				System.out.println("Flight name: "+airline[8]+", Departure from "+from+" at "+departure[8]+" and arrival at "+to+" at "+arrival[8]);
				
			}
			else if(choice2.equals("33607")){
				System.out.println("Flight name: "+airline[9]+", Departure from "+from+" at "+departure[9]+" and arrival at "+to+" at "+arrival[9]);
				
			}
			else {
				System.out.println("Invalid Flight Number...");
				System.exit(0);
			}
		

		//DISPLAYING THE ARRAY LIST
			System.out.println("\nThe flight details you have entered are as follows-->");
			for(String str:flightDetails)
				System.out.println(str);
	}
	
	//THIS METHOD WILL INCREASE THE NUMBER OF SEATS BOOKED BY 1
	public void checkSeatBooking(String choice6) {
		if(choice6.equals("1101")) {
			seatsBooked[0]++;
		}
		else if(choice6.equals("9865")) {
			seatsBooked[1]++;
		}
		else if(choice6.equals("4432")) {
			seatsBooked[2]++;
		}
		else if(choice6.equals("7698")) {
			seatsBooked[3]++;
		}
		else if(choice6.equals("11987")) {
			seatsBooked[4]++;
		}
		else if(choice6.equals("55023")) {
			seatsBooked[5]++;
		}
		else if(choice6.equals("1050")) {
			seatsBooked[6]++;
		}
		else if(choice6.equals("6678")) {
			seatsBooked[7]++;
		}
		else if(choice6.equals("22297")) {
			seatsBooked[8]++;
		}
		else if(choice6.equals("33607")) {
			seatsBooked[9]++;
		}
		
	}

}