import java.util.Scanner;

public class Index {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //menu
        System.out.println("Welcome to Hotel Seri Malaysia's Room Booking System");
        System.out.println("1. Book a room");
        System.out.println("2. Cancel a booking");
        System.out.println("0. Exit");
        System.out.println(" ");
        System.out.println("Please enter option number, example 1");

        //user input
        int num = Integer.parseInt(sc.next());

        //check if input is integer
        if (num == 9) {
            if (num == 1) {
                // book a room
            } else if (num == 2) {
                //cancel a booking
            } else {
                //exit program
            }
        } else {
            //return error for input 
        }
    }
	
}
