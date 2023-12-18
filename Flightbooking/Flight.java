package flightbooking;
import java.util.*;
public class Flight {
    static int id =0;
    int flightId,tickets,price;
    ArrayList<Integer>passengerId;
    ArrayList<String>passengerDetails;
    ArrayList<Integer>bookedTicketsPerPassenger;
    ArrayList<Integer>passengerCost;
    public Flight(){
        tickets=50;
        price =5000;
        id+=1;
        flightId=id;
        passengerId = new ArrayList<Integer>();
        passengerDetails = new ArrayList<String>();
        bookedTicketsPerPassenger = new ArrayList<Integer>();    
        passengerCost = new ArrayList<Integer>();
    }
    public void addPassengerDetails(String passengerDetail,int numberOfTickets,int passengerID){
        passengerDetails.add(passengerDetail);
        passengerId.add(passengerID);
        passengerCost.add(price*numberOfTickets);
        price+=200*numberOfTickets;
        tickets-=numberOfTickets;
        bookedTicketsPerPassenger.add(numberOfTickets);
        System.out.println("____BOOKED_SUCCESSFULLY____");
    }
    public void CancelTickets(int passengerID){
        int remove = passengerId.indexOf(passengerID);
        if(remove<0){
            System.err.println("PASSENGER ID NOT FOUND");
            return;
        }
        int cancel = bookedTicketsPerPassenger.get(remove);
        tickets+=cancel;
        price-=200*cancel;
        System.out.println("REFUND AMOUNT AFTER CANCEL  :   "+passengerCost.get(remove));
        bookedTicketsPerPassenger.remove(remove);
        passengerId.remove(Integer.valueOf(passengerID));
        passengerDetails.remove(remove);
        passengerCost.remove(remove);
        System.out.println("CANCELLED BOOKED TICKETS SUCCESSFULLY...");
    }
    public void flightDetails(){
        System.out.println("FlightID    "+flightId);
        System.out.println("Remaining Tickets    "+ tickets);
        System.out.println("Current Ticket Price   "+price);
    }
    public void printDetails(){
        System.out.println("Flight ID   "+flightId+"-->");
        for (String i : passengerDetails) {
            System.out.println(i);
        }
    }
}
