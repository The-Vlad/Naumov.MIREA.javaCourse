package ru.mirea.Naumov.lab9;

import java.util.Scanner;

public class CustomerList {
    public int arraySize;
    public Customer[] customers;
    
    public CustomerList(int arraySize){
        this.arraySize = arraySize;
        customers = new Customer[arraySize];
    }
    
    public void generateUniqueID(){
        for (int i = 0; i < arraySize; ++i) {
            customers[i] = new Customer(i);

            System.out.println(i+") Customer "+customers[i].toString());
        }
        
        System.out.println();
    }

    public void setNames(){
        System.out.println("Enter "+arraySize+" names:");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arraySize; i++){
            customers[i].setName(input.next());
        }
    }

    public void sortNamesByInserts(){
        Customer temp;

        for (int i = 1; i < arraySize; i++){
            temp = customers[i];
            int q = i - 1;

            while (q >= 0 && customers[q].compare(customers[q], temp) > 0){
                customers[q + 1] = customers[q];
                q--;
            }

            customers[q + 1] = temp;
        }

        for (int i = 0; i < arraySize; i++){
            System.out.println(customers[i]);
        }

        System.out.println();
    }

    public boolean checkForAvailability(String name, int idNumber) throws BadCustomerNameException, WrongIDNumberException {
        Customer temp = new Customer(idNumber, name);

        try{
            for (int i = 0; i < arraySize; i++){
                if(customers[i].compare(customers[i], temp) == 0){
                    if(customers[i].compareTo(temp) == 0){
                        return true;
                    }
                    else {
                        throw new WrongIDNumberException("Wrong ID number: "+idNumber);
                    }
                }
            }

            throw new CustomerNotFoundException("Customer is not found");
        }
        catch (CustomerNotFoundException err){
            // if (name_format) then...
            throw new BadCustomerNameException("Wrong name: "+name, err);
            // else throw BadCustomerNameFormatException // required Name SecondName ThirdName
        }
    }
}