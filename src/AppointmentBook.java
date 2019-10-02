import edu.sjsu.macaldo.aaronjay.Appointment;
import edu.sjsu.macaldo.aaronjay.Daily;
import edu.sjsu.macaldo.aaronjay.Monthly;
import edu.sjsu.macaldo.aaronjay.Onetime;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentBook {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char userInputChar = ' ';
        ArrayList<Appointment> appointmentBook = new ArrayList<Appointment>();

        appointmentBook.add(new Daily("First Daily Appointment", 2019, 9, 30));
        appointmentBook.add(new Monthly("First Monthly Appointment", 2019, 12, 19));
        appointmentBook.add(new Onetime("First OneTime Appointment", 2020, 1, 17));
        appointmentBook.add(new Daily("Second Daily Appointment", 2022, 2, 30));
        appointmentBook.add(new Monthly("Second Monthly Appointment", 2025, 8, 1));
        appointmentBook.add(new Onetime("Second OneTime Appointment", 2015, 4, 20));
        appointmentBook.add(new Daily("Third Daily Appointment", 2025, 2, 30));
        appointmentBook.add(new Monthly("Third Monthly Appointment", 2028, 8, 1));
        appointmentBook.add(new Onetime("Third OneTime Appointment", 2015, 4, 20));

        System.out.println("Welcome to my program that works like an Appointment book!");
        System.out.println("The Appointment Book already has content but you can add more!");

        while(userInputChar != 'x') {
            System.out.println("Directions: Type 'a' to add an appointment, Type 'c' to check what appointments occurs on a specific date, Type 'x' to exit");
            userInputChar = userInput.nextLine().charAt(0);

            if(userInputChar == 'a') {
                System.out.println("You are now adding another appointment.");
                while(!(userInputChar == 'o') && !(userInputChar == 'd') && !(userInputChar == 'm') ) {
                    String newDescription;

                    System.out.println("Please enter the type of appointment ('o' for one time, 'd' daily, and 'm' for monthly): ");
                    userInputChar = userInput.nextLine().charAt(0);

                    if(userInputChar == 'o') {
                        String[] inDate;
                        System.out.println("You are adding a one time appointment");
                        System.out.println("Please enter a description: ");
                        newDescription = userInput.nextLine();
                        System.out.println("Please enter the date using this format(yyyy mm dd): ");
                        inDate = userInput.nextLine().split(" ");

                        appointmentBook.add(new Onetime(newDescription, Integer.valueOf(inDate[0]), Integer.valueOf(inDate[1]), Integer.valueOf(inDate[2])));
                    }
                    else if(userInputChar == 'd') {
                        String[] inDate;
                        System.out.println("You are adding a daily appointment");
                        System.out.println("Please enter a description: ");
                        newDescription = userInput.nextLine();
                        System.out.println("Please enter the date using this format(yyyy mm dd): ");
                        inDate = userInput.nextLine().split(" ");

                        appointmentBook.add(new Daily(newDescription, Integer.valueOf(inDate[0]), Integer.valueOf(inDate[1]), Integer.valueOf(inDate[2])));
                    }
                    else if(userInputChar == 'm') {
                        String[] inDate;
                        System.out.println("You are adding a monthly appointment");
                        System.out.println("Please enter a description: ");
                        newDescription = userInput.nextLine();
                        System.out.println("Please enter the date using this format(yyyy mm dd): ");
                        inDate = userInput.nextLine().split(" ");

                        appointmentBook.add(new Monthly(newDescription, Integer.valueOf(inDate[0]), Integer.valueOf(inDate[1]), Integer.valueOf(inDate[2])));
                    }
                    else
                        System.out.println("You have entered an invalid character. Please try again");
                }
            }
            else if(userInputChar == 'c') {
                String[] outDate;
                int numAppointments = 0;

                System.out.println("You are now checking for appointments. Please enter the date using this format(yyyy mm dd): ");
                outDate = userInput.nextLine().split(" ");

                for(int i = 0; i < appointmentBook.size(); i++) {
                    if(appointmentBook.get(i).occursOn(Integer.valueOf(outDate[0]), Integer.valueOf(outDate[1]), Integer.valueOf(outDate[2]))) {
                        numAppointments++;
                        System.out.println("Appointment " + numAppointments + ": " + appointmentBook.get(i).getDescription());
                    }
                }
            }
            else if(userInputChar == 'x')
                System.out.println("You are now exiting the program! Have a nice day!");
            else
                System.out.println("You have entered an invalid character. Please try again");
        }
    }
}
