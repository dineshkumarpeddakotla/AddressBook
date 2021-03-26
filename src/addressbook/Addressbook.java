package addressbook;

import java.util.Scanner;

public class Addressbook {
    Scanner user = new Scanner(System.in);
    String First_Name,Last_Name,Address,City,State,Email_Id;
    int  Zipcode;
    long PhoneNumber;
    public void set_contact_details(){
        System.out.println("Enter the First Name");
        this.First_Name=user.nextLine();
        System.out.println("Enter the Last Name");
        this.Last_Name = user.nextLine();
        System.out.println("Enter the Address");
        this.Address=user.nextLine();
        System.out.println("Enter the City ");
        this.City=user.nextLine();
        System.out.println("Enter the State");
        this.State= user.nextLine();
        System.out.println("Enter the Zipcode");
        this.Zipcode=user.nextInt();
        System.out.println("Enter the Phone number");
        this.PhoneNumber=user.nextLong();
        System.out.println("Enter the Email Id");
        this.Email_Id=user.nextLine();

    }
    public String toString() {

        return ("FIRST NAME : " +First_Name+ "\nLAST NAME : " +Last_Name+ "\nAddress"+Address+"\nCity"+City+"\nState"+State+
                "\nZipcode"+Zipcode+"\nPhone number"+PhoneNumber+"Email Id"+Email_Id);
    }
    public static void main(String[] args ){
        System.out.println("Welome to Address book");
    }
}
