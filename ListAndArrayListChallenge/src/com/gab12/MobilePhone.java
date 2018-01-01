package com.gab12;

import java.util.ArrayList;
//import java.util.Scanner;

/**
 * Created by SONY on 11/26/2017.
 */
public class MobilePhone {
    //private static Scanner scanner= new Scanner(System.in);
    private String myNumber;
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts =new ArrayList<Contact>();
    }



    public boolean addContact(Contact contact){
        if( findContact(contact.getName()) >=0 ){
            System.out.println("Contact already exists.");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){

        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println("This contact was not found in contacts list.");
            return false;
        }
        this.contacts.set(foundPosition,newContact);
        System.out.println("The contact " +oldContact.getName()+" was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){

        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println("This contact was not found in contacts list.");
            return false;
        }
        this.contacts.remove(contact);
        System.out.println("Contact"+ contact.getName()+" was removed.");
        return true;
    }

    private int findContact(Contact contact){
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i=0; i<this.contacts.size(); i++){
            Contact contact=this.contacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){

        int position= findContact(name);
        if(position > -1){
            return contacts.get(position);
        }else{
            System.out.println("Contact was not found");
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List: ");
        for(int i=0; i < this.contacts.size();i++){
            System.out.println( i+1 + ". "
                            + this.contacts.get(i).getName() + "-->"
                            + this.contacts.get(i).getPhoneNumber());
        }
    }
}
