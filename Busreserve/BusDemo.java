package Busreserve;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking>bookings = new ArrayList<Booking>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 50));
        buses.add(new Bus(3, true, 30));

        Scanner scan = new Scanner(System.in);
        
        for (Bus bus : buses) {
            bus.displayInfo();

        }
        int useropt = 1;
        while (useropt == 1) {
            System.out.println("Enter 1 to book and 2 to exit");
            useropt = scan.nextInt();
            if (useropt == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings,buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed.....");
                }
                else
                System.out.println("Sorry , the bus is not available for entered date.....");
            }
        }
        
    }
}
