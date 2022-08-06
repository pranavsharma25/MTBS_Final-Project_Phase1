package pranav;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class MovieTicketBookingSimulator {

	Scanner scr = new Scanner(System.in);

	private String user = "pranav";
	private String password = "pranav123";
	public int count = 0;
	int ticket = 200;

	LinkedList<String> A = new LinkedList<String>();
	LinkedList<String> B = new LinkedList<String>();
	LinkedList<String> C = new LinkedList<String>();
	LinkedList<String> D = new LinkedList<String>();
	LinkedList<String> E = new LinkedList<String>();

	String movie = "Top-Gun";


	public void login() {
		
		System.out.print("Enter Username :");
		
		String usr = scr.next();
		
		System.out.println("");
		
		System.out.print("Enter Password :");
		
		String pwd = scr.next();
		
		System.out.println("\n");
		
		if (user.equals(usr) & password.equals(pwd)) {

			System.out.println("Login Successfull :) \n");
			
			admin();
			

		} else  {
			System.err.println("Invalid Credentials! :( \n"
					+ "Try Again");
			relogin();
		}

	}
	
	
	public void relogin() {
		
		login();
	}

	public void admin() {

		

		System.out.println("\n" + "Select the operation you want to perform \n"
				+ "* 1. Change Password \n"
				+ "* 2. Book Ticket \n");

		String pswd = scr.next();

		if (pswd.equalsIgnoreCase("1")) {

			System.out.println("Enter the New password : ");

			String change = scr.next();

			password = change;

			System.out.println("The password is now changed to : " + change + "\n");
			System.out.println("To continue, please login again...");
			
			login();
			
			
			
			
	} else if(pswd.equalsIgnoreCase("2")) {

		System.out.println("");
		userdb();
		
	}

	}
	
	public void seatview() {
		
		System.out.println("Seating Arrangement: \n");
		
		System.out.println("Row 1 : " +A);
		System.out.println("Row 2 : " +B);
		System.out.println("Row 3 : " +C);
		System.out.println("Row 4 : " +D);
		System.out.println("Row 5 : " +E);
		System.out.println("\n");
	}

	public void userdb() {

		System.out.println("\n*************************************\n" + "\n"
				+ "\t Ticket Booking Counter \n" + "\n"
				+ "************************************* \n");

		System.out.println("Now Showing - " + movie);

		System.out.println("\n");

		System.out.println("Please enter your name : \n");

		String name = scr.next();

		System.out.println("Hi " + name + "\n");
		
		seatview();
		
		
		System.out.println("The Price of the ticket is : Rs."+ticket + "\n");

		System.out.println("\n"
				+ "\n "
				+ "Select the Showtime: \n" + "1. 10:00 AM \n" + "2. 2:00 PM \n"
				+ "3. 6:00 PM \n" + "4. 10:00 PM  \n");
		
		

		int showtime = scr.nextInt();
		
		
		

		switch (showtime) {

		case 1:
			System.out.println("You have selected is 10:00 AM \n");
			seatselect();
			break;
		case 2:
			System.out.println("You have selected is 2:00 PM \n");
			seatselect();
			break;
		case 3:
			System.out.println("You have selected is 6:00 PM \n");
			seatselect();
			break;
		case 4:
			System.out.println("You have selected is 10:00 PM \n");
			seatselect();
			break;
		}

	}

	public void seatselect() {
		
		
		
		
		
	
	int pos;
	do {

		System.out.println(
				"Select the Row from the given options \n" + "1. A \n" + "2. B \n" + "3. C \n" + "4. D \n" + "5. E \n");

		int row = scr.nextInt();

		// Switch statement for selection of Row
		
		

		switch (row) {

		// Row A

		case 1:
			System.out.println("You have selected Row A \n" );


			System.out.println("You have selected Row A,Select Seat from 1-10");

			int seatsA = scr.nextInt();
			// Switch statement for selection of seats in Row 1

			switch (seatsA) {

			case 1:

				A.set(0, "X");

				System.out.println("You have booked the seat : A-1");
				break;
			case 2:
				A.set(1, "X");
				System.out.println("You have booked the seat : A-2");
				break;
			case 3:
				A.set(2, "X");
				System.out.println("You have booked the seat : A-3");
				break;
			case 4:
				A.set(3, "X");
				System.out.println("You have booked the seat : A-4");
				break;

			case 5:
				A.set(4, "X");
				System.out.println("You have booked the seat : A-5");
				break;

			case 6:
				A.set(5, "X");
				System.out.println("You have booked the seat : A-6");

			case 7:
				A.set(6, "X");
				System.out.println("You have booked the seat : A-7");
				break;

			case 8:
				A.set(7, "X");
				System.out.println("You have booked the seat : A-8");
				break;

			case 9:
				A.set(8, "X");
				System.out.println("You have booked the seat : A-9");
				break;
			case 10:
				A.set(9, "X");
				System.out.println("You have booked the seat : A-10");
				break;

			}
			break;

		// Row B
		case 2:


			System.out.println("You have selected Row B,Select Seat from 1-10");

			int seatsB = scr.nextInt();
			System.out.println("");
			// Switch statement for selection of seats in Row 1

			switch (seatsB) {

			case 1:
				B.set(0, "X");

				System.out.println("You have booked the seat : B-1");
				break;
			case 2:
				B.set(1, "X");
				System.out.println("You have booked the seat : B-2");
				break;
			case 3:
				B.set(2, "X");
				System.out.println("You have booked the seat : B-3");
				break;
			case 4:
				B.set(3, "X");
				System.out.println("You have booked the seat : B-4");
				break;

			case 5:
				B.set(4, "X");
				System.out.println("You have booked the seat : B-5");
				break;

			case 6:
				B.set(5, "X");
				System.out.println("You have booked the seat : B-6");
				break;
			case 7:
				B.set(6, "X");
				System.out.println("You have booked the seat : B-7");
				break;

			case 8:
				B.set(7, "X");
				System.out.println("You have booked the seat : B-8");
				break;

			case 9:
				B.set(8, "X");
				System.out.println("You have booked the seat : B-9");
				break;
			case 10:
				B.set(9, "X");
				System.out.println("You have booked the seat : B-10");
				break;

			}
			break;

			// Row C
		case 3:

			System.out.println("You have selected Row C,Select Seat from 1-10");

			int seatsC = scr.nextInt();
			System.out.println("");
			// Switch statement for selection of seats in Row 1

			switch (seatsC) {

			case 1:
				C.set(0, "X");

				System.out.println("You have booked the seat : C-1");
				break;
			case 2:
				C.set(1, "X");
				System.out.println("You have booked the seat : C-2");
				break;
			case 3:
				C.set(2, "X");
				System.out.println("You have booked the seat : C-3");
				break;
			case 4:
				C.set(3, "X");
				System.out.println("You have booked the seat : C-4");
				break;

			case 5:
				C.set(4, "X");
				System.out.println("You have booked the seat : C-5");
				break;

			case 6:
				C.set(5, "X");
				System.out.println("You have booked the seat : C-6");
				break;
			case 7:
				C.set(6, "X");
				System.out.println("You have booked the seat : C-7");
				break;

			case 8:
				C.set(7, "X");
				System.out.println("You have booked the seat : C-8");
				break;

			case 9:
				C.set(8, "X");
				System.out.println("You have booked the seat : C-9");
				break;
			case 10:
				C.set(9, "X");
				System.out.println("You have booked the seat : C-10");
				break;

			}
			break;
			
			//Row D
		case 4:


			System.out.println("You have selected Row D,Select Seat from 1-10");

			int seatsD = scr.nextInt();
			System.out.println("");
			// Switch statement for selection of seats in Row 4

			switch (seatsD) {

			case 1:
				D.set(0, "X");

				System.out.println("You have booked the seat : D-1");
				break;
			case 2:
				D.set(1, "X");
				System.out.println("You have booked the seat : D-2");
				break;
			case 3:
				D.set(2, "X");
				System.out.println("You have booked the seat : D-3");
				break;
			case 4:
				D.set(3, "X");
				System.out.println("You have booked the seat : D-4");
				break;

			case 5:
				D.set(4, "X");
				System.out.println("You have booked the seat : D-5");
				break;

			case 6:
				D.set(5, "X");
				System.out.println("You have booked the seat : D-6");
				break;
			case 7:
				D.set(6, "X");
				System.out.println("You have booked the seat : D-7");
				break;

			case 8:
				D.set(7, "X");
				System.out.println("You have booked the seat : D-8");
				break;

			case 9:
				D.set(8, "X");
				System.out.println("You have booked the seat : D-9");
				break;
			case 10:
				D.set(9, "X");
				System.out.println("You have booked the seat : D-10");
				break;

			}
			break;
		//Row E	
		case 5:
			


			System.out.println("You have selected Row E,Select Seat from 1-10");

			int seatsE = scr.nextInt();
			System.out.println("");
			// Switch statement for selection of seats in Row 1

			switch (seatsE) {

			case 1:
				E.set(0, "X");

				System.out.println("You have booked the seat : E-1");
				break;
			case 2:
				E.set(1, "X");
				System.out.println("You have booked the seat : E-2");
				break;
			case 3:
				E.set(2, "X");
				System.out.println("You have booked the seat : E-3");
				break;
			case 4:
				E.set(3, "X");
				System.out.println("You have booked the seat : E-4");
				break;

			case 5:
				E.set(4, "X");
				System.out.println( "You have booked the seat : E-5");
				break;

			case 6:
				E.set(5, "X");
				System.out.println("You have booked the seat : E-6");
				break;

			case 7:
				E.set(6, "X");
				System.out.println(" You have booked the seat : E-7");
				break;

			case 8:
				E.set(7, "X");
				System.out.println("You have booked the seat : E-8");
				break;

			case 9:
				E.set(8, "X");
				System.out.println("You have booked the seat : E-9");
				break;
			case 10:
				E.set(9, "X");
				System.out.println("You have booked the seat : E-10");
				break;

			}
			break;

			
			
			
		}
		System.out.println("\n "
				+ "\n"
				+ "Do you want to book another Ticket \n"
				+ "Type 1 for Yes \n"
				+ "Type 2 for No");
		pos = scr.nextInt();
		System.out.println("");
		
		count++;
		
	}while(pos == 1);
		
		amount();
		
		seatview();
		
		
		System.out.println("\n Your Tickets have been Booked, Enjoy the movie!"+"\n");
		System.out.println("Thankyou :)");
	
	
	
	
	
	}
	
	public void amount() {
		
		int money = count*ticket;
		
		System.out.println("\n Your total is :" +money + ", for " +count+ " ticket \n");
	}

	public static void main(String[] args) {
		
		MovieTicketBookingSimulator mvr = new MovieTicketBookingSimulator();
		
		Collection<String> rowA = new ArrayList<String>();
		rowA.add("A-1");
		rowA.add("A-2");
		rowA.add("A-3");
		rowA.add("A-4");
		rowA.add("A-5");
		rowA.add("A-6");
		rowA.add("A-7");
		rowA.add("A-8");
		rowA.add("A-9");
		rowA.add("A-10");

		Collection<String> rowB = new ArrayList<String>();
		rowB.add("B-1");
		rowB.add("B-2");
		rowB.add("B-3");
		rowB.add("B-4");
		rowB.add("B-5");
		rowB.add("B-6");
		rowB.add("B-7");
		rowB.add("B-8");
		rowB.add("B-9");
		rowB.add("B-10");

		Collection<String> rowC = new ArrayList<String>();
		rowC.add("C-1");
		rowC.add("C-2");
		rowC.add("C-3");
		rowC.add("C-4");
		rowC.add("C-5");
		rowC.add("C-6");
		rowC.add("C-7");
		rowC.add("C-8");
		rowC.add("C-9");
		rowC.add("C-10");

		Collection<String> rowD = new ArrayList<String>();
		rowD.add("D-1");
		rowD.add("D-2");
		rowD.add("D-3");
		rowD.add("D-4");
		rowD.add("D-5");
		rowD.add("D-6");
		rowD.add("D-7");
		rowD.add("D-8");
		rowD.add("D-9");
		rowD.add("D-10");

		Collection<String> rowE = new ArrayList<String>();
		rowE.add("E-1");
		rowE.add("E-2");
		rowE.add("E-3");
		rowE.add("E-4");
		rowE.add("E-5");
		rowE.add("E-6");
		rowE.add("E-7");
		rowE.add("E-8");
		rowE.add("E-9");
		rowE.add("E-10");

		mvr.A.addAll(rowA);
		mvr.B.addAll(rowB);
		mvr.C.addAll(rowC);
		mvr.D.addAll(rowD);
		mvr.E.addAll(rowE);

		System.out.println("\n******************************************************\n");
		System.out.println("\t Movie Ticket Booking Simulator \n");
		System.out.println("****************************************************** \n");
		
		
		mvr.login();

}
}