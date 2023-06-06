package com.Book_Ticket;

public class Ticket {
            
private String movie_name;
private int no_of_seats;
//No arg constructor
Ticket(){
}
Ticket(String movie_name,int no_of_seats){
	this.movie_name=movie_name;
	this.no_of_seats=no_of_seats;
}
//public getters and setters
public String getMovie_name() {
	return movie_name;
}
public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}
public int getNo_of_seats() {
	return no_of_seats;
}
public void setNo_of_seats(int no_of_seats) {
	this.no_of_seats = no_of_seats;
}
//to print ticket details
public void ticketDetails() {
	System.out.println("==Ticket details==");
	System.out.println(movie_name+" Is Movie Name");
	System.out.println(no_of_seats+ " Ticekts are booked");
}
}


