import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}

public class Main {

    static void main_menu() {
        System.out.println("WELCOME TO THE SHOWROOM MANAGEMENT SYSTEM");
        System.out.println();
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. ADD SHOWROOM");
        System.out.println("2. ADD EMPLOYEES");
        System.out.println("3. ADD CARS");
        System.out.println("4. GET SHOWROOMS");
        System.out.println("5. GET EMPLOYEES");
        System.out.println("6. GET CARS");
        System.out.println();
        System.out.println("ENTER 0 TO EXIT");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employees[]= new Employees[5];
        Cars cars[]= new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employee_counter = 0;
        int choice = 100;
        while (choice != 0){

            main_menu();
            choice  = sc.nextInt();

            while (choice != 9 && choice != 0){
                switch (choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1. ADD NEW SHOWROOM");
                        System.out.println("9. GO BACK TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employees[employee_counter] = new Employees();
                        employees[employee_counter].set_details();
                        employee_counter++;
                        System.out.println();
                        System.out.println("2. ADD ANOTHER EMPLOYEE");
                        System.out.println("9. GO BACK TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        cars[car_counter] = new Cars();
                        cars[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3. ADD ANOTHER CAR");
                        System.out.println("9. GO BACK TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for(int i = 0; i < employee_counter; i++) {
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9. GO BACK TO THE MAIN MENU");
                        System.out.println("0 TO EXIT");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for(int i = 0; i < car_counter; i++) {
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9. GO BACK TO THE MAIN MENU");
                        System.out.println("0 TO EXIT");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("ENTER A VALID CHOICE");
                        break;
                }
            }
        }
    }
}