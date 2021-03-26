package addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addressbook {
    public static final int Add_details = 1;
    public static final int Edit_Details = 2;
    public static final int Delete_Details=3;
    //Scanner is used to get the data from user
    Scanner user = new Scanner(System.in);
    //Declaring Variables
    String First_Name, Last_Name, Address, City, State, Email_Id;
    int Zipcode;
    long PhoneNumber;

    //using method assigning a variables from user
    public void set_contact_details() {
        System.out.println("Enter the First Name");
        this.First_Name = user.nextLine();
        System.out.println("Enter the Last Name");
        this.Last_Name = user.nextLine();
        System.out.println("Enter the Address");
        this.Address = user.nextLine();
        System.out.println("Enter the City ");
        this.City = user.nextLine();
        System.out.println("Enter the State");
        this.State = user.nextLine();
        System.out.println("Enter the Zipcode");
        this.Zipcode = user.nextInt();
        System.out.println("Enter the Phone number");
        this.PhoneNumber = user.nextLong();
        System.out.println("Enter the Email Id");
        this.Email_Id = user.next();

    }

    //Displaying the output in String Format
    public String toString() {

        return ("FIRST NAME : " + First_Name + "\nLAST NAME : " + Last_Name + "\nAddress : " + Address + "\nCity : " + City + "\nState : " + State +
                "\nZipcode : " + Zipcode + "\nPhone number : " + PhoneNumber + "Email Id : " + Email_Id);
    }

    public String getName() {

        return First_Name;
    }

    public static void main(String[] args) {
        System.out.println("Welome to Address book");
        Scanner input = new Scanner(System.in);
        //creating a user data list
        List<Addressbook> user_data = new ArrayList<>();

//asking a user to add details or not
        int choice = input.nextInt();
        if (choice == Add_details) {
            System.out.println("HOW MANY USERS DO YOU WANT TO ADD");
            int user_choice = input.nextInt();
            for (int i = 0; i < user_choice; i++) {
                //creating an object and adding given details into user data list
                Addressbook Person = new Addressbook();
                Person.set_contact_details();
                user_data.add(Person);
                System.out.println(Person.toString());
            }

            System.out.println("What Next Do You Want To Choose \n2.Edit Person Details\n" +
                    "3.Delete Details\n4.Exit");

            int choice2 = input.nextInt();
            switch (choice2) {
                case Edit_Details:
                    System.out.println(user_data);//if user want to edit the added details
                    System.out.println("Which Person Details You Want To Edit");
                    String store = input.next();
                    for (Addressbook i : user_data) {

                        if (i.getName().equals(store)) {

                            //int temporary = users.indexOf(i);
                            System.out.println("Change The City :");
                            i.City = input.next();

                        }

                    }
                    System.out.println(user_data);
                    break;
                case Delete_Details:
                    System.out.println(user_data);//if user want to delete the added details
                    System.out.println("Which Person Details You Want To Delete");
                    String delete_data = input.next();
                    user_data.removeIf(i -> i.getName().equals(delete_data));
                    System.out.println(user_data);
                    break;
                default:
            }
        }
    }
}