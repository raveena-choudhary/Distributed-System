package FrontEnd.MovieTicketBooking;


/**
* MovieTicketBooking/MovieTicketBookingInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./MovieTicketBooking.idl
* Sunday, April 9, 2023 5:21:16 o'clock PM EDT
*/

public interface MovieTicketBookingInterfaceOperations 
{
  String addMovieSlots (String customerID, String movieID, String movieName, int bookingCapacity);
  String removeMovieSlots (String customerID, String movieID, String movieName);
  String listMovieShowsAvailability (String customerID, String movieName);

  //customer & admin
  String bookMovieTickets (String customerID, String movieID, String movieName, int numberOfTickets);
  String getBookingSchedule (String customerID);
  String cancelMovieTickets (String customerID, String movieID, String movieName, int numberOfTickets);
  boolean validateUser (String username, String password);
  void setPortAndHost (String hostname, String port);

  //                movieIdsList getAllMovieIds(in string movieName);
  String getAllMovieNames (String customerID);
  String getAllMovieIds (String customerID, String movieName);
  String exchangeTickets (String customerID, String old_movieName, String old_movieID, String new_movieID, String new_movieName, int numberOfTickets);
} // interface MovieTicketBookingInterfaceOperations
