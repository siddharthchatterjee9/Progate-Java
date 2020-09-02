package multiplePeopleBMI;
import java.util.Scanner;
/* Author is 19BCE2249 Siddharth Chatterjee */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of people: ");
        int numberOfPeople = in.nextInt();

        for (int i =0; i<numberOfPeople; i++) {
            System.out.println("Person number " + (i+1));
            System.out.print("First name: ");
            String firstName = in.next();

            System.out.print("Last name: ");
            String lastName = in.next();

            System.out.print("Age: ");
            int age = in.nextInt();

            System.out.print("Height (m): ");
            double height = in.nextDouble();

            System.out.print("Weight (kg): ");
            double weight = in.nextDouble();

            Person.printData(firstName, lastName, age, height, weight);
        }
    }
}
