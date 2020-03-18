package com.company;

import java.util.Scanner;

public class PhoneContact {

    public void contactData() {
        String name;
        String surname;
        String phoneNumber;

        Scanner data = new Scanner(System.in);

        System.out.println("Please Enter the name:");
        name = data.nextLine();
        System.out.println("Please Enter the surname:");
        surname = data.nextLine();
        System.out.println("Please Enter the phone number:");
        phoneNumber = data.nextLine();

        System.out.println("A record created!");

        System.out.println("A Phone Book with a single record created!");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
