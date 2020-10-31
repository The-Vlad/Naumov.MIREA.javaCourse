package ru.mirea.Naumov.lab9;

import java.util.Scanner;

public class Lab9Tester {
    public static void main(String[] args) throws WrongIDNumberException, BadCustomerNameException {
        CustomerList list = new CustomerList(10);

        list.generateUniqueID();
        list.setNames();
        list.sortNamesByInserts();

        System.out.println("Enter \"name\" \"idNumber\", or \"END\":");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int idNumber;

        while(!name.equals("END")){
            idNumber = input.nextInt();
            if(list.checkForAvailability(name, idNumber)){
                System.out.println("FOUND!");
            }
            name = input.next();
        }
    }
}

