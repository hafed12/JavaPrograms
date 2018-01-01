package com.gab12;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("091 358 1312");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int actionNo = scanner.nextInt();
            scanner.nextLine();

            switch (actionNo){
                case 0:
                    System.out.println("\nShutting down");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    existenceQury();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void startPhone(){
        System.out.println(" starting phone...");
    }

    private static void printActions(){
        System.out.println( "\nAvailable actions: \npress");
        System.out.println( "0  -  to shutdown\n"+
                            "1  -  to print contacts\n" +
                            "2  -  to add a new contact\n" +
                            "3  -  to update an existing contact\n" +
                            "4  -  to remove an existing contact\n" +
                            "5  -  query existance of a contact\n" +
                            "6  -  to print a list of available actions\n");
        System.out.println("Choose your actions");
    }



    private static void addNewContact(){
        System.out.println(" Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println(" Enter new contact phone number: ");
        String number = scanner.nextLine();
        Contact newContact= Contact.createContact(name,number);
        if(mobilePhone.addContact(newContact)){
            System.out.println("New contact added:" +
                    "\nname: " + name + "\nphone number: " + number);
        }else{
            System.out.println("Contact "+ name + ", already exists.");
        }
     }

     private static void updateContact(){

         System.out.println("Enter the old contact name:");
         String oldName = scanner.nextLine();
         Contact existingContact = mobilePhone.queryContact(oldName);
         System.out.println("Enter the new contact name: ");
         String newName = scanner.nextLine();
         System.out.println("Enter the new contact number: ");
         String newNumber = scanner.nextLine();
         Contact newContact = Contact.createContact(newName,newNumber);
         mobilePhone.updateContact(existingContact,newContact);
         System.out.println(" The contact "+ oldName + " was updated successfully, " +
                            " and the new contact info are "
                            + newName + " --> " + newNumber );

     }

     private static void removeContact(){

         System.out.println("Enter contact name to be removed: ");
         String name= scanner.nextLine();
         Contact contact= mobilePhone.queryContact(name);
         if (mobilePhone.removeContact(contact)){
             System.out.println("Contact " + contact.getName()
                     + " was removed successfully.");
         }
     }

    private static void existenceQury(){

        System.out.println("Enter contact name: ");
        String name= scanner.nextLine();
        if (mobilePhone.queryContact(name)!=null){
            Contact contact= mobilePhone.queryContact(name);
            System.out.println("Name: " + contact.getName()
                    + " \nNumber: " + contact.getPhoneNumber());
        }
    }
}
