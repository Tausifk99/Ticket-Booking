package com.Book_Ticket;
import java.util.Scanner;

public class BoxOffice {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre theatre=new Theatre("INOX");

		boolean flag = true;
		while (flag) {
			System.out.println("Press 1-bookticket,"
					+ " 2. checkAvailability" + 
					" 3 show ticket details ,"
					+ " 4 .cancel  5-Exit");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.println("Enter the movie name");
               String mname=sc.next();
               
				System.out.println("Enter the number of seats");
				int seat=sc.nextInt();
				theatre.setTicket(new Ticket(mname,seat));
				theatre.bookTicket();
				}
				break;

			case 2: {
				if(Theatre.no_of_seats>0) {
					System.out.println(Theatre.no_of_seats+" Seats Are Available");
				}else
				{
					System.out.println("Show Is HouseFull");
				}
			}
				break;
			case 3: {
				if(theatre.getTicket()!=null)
				{
				theatre.getTicket().ticketDetails();
				}else {
					System.out.println("Ticket Is Not Booked");
				}
			}
				break;
			case 4: {
				System.out.println("Cancel");
				System.out.println("Your booking has "+theatre.getTicket().getNo_of_seats()+" bookings");
				System.out.println("Enter number of tickets to cancel");
				int cancel=sc.nextInt();
                 if(cancel<=theatre.getTicket().getNo_of_seats()) {
                     theatre.cancelTicket(cancel);
                 }else {
                	 System.out.println("Could not cancel your bookings");
                 }
			}
				break;
			case 5: {
				System.out.println("Exit session");
				flag = false;
			}break;
			default: {
				System.out.println("Wrong input");
			}

			}
		}
	}
}



