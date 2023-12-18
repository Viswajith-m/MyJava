package Busreserve;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    String passengerName;
    int busNo;
    Date date;
    Booking(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of Passenger : ");
        passengerName = scan.next();
        System.out.println("Enter bus number : ");
        busNo = scan. nextInt();
        System.out.println("Enter date (Note: the format should be dd-mm-yyyy) : ");
        String dt = scan.next();
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = form.parse(dt);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses){
            int capacity =0;
            for (Bus bus : buses) {
                if(bus.getBusNo()==busNo){
                    capacity = bus.getCapacity();
                }
            }
            int booked=0;
            for (Booking booking : bookings) {
                if (booking.busNo == busNo && booking.date.equals(date)) {
                    booked++;
                }
            }
        return booked<capacity ?true:false; 
        }
}
