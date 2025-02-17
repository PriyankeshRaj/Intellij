package com.priyankesh;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static MobilePhone mobilePhone= new MobilePhone("0030 330 4404");

    public static void main(String[] args) {
	// write your code here
        boolean quit=false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action=scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\nShutting down...");
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
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }
        }

    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name=scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone=scanner.nextLine();
        Contacts newContact= Contacts.createContacts(name,phone);
        if(mobilePhone.addNewContacts((newContact))){
            System.out.println("New contact added: name = "+name+", phone = "+phone);
        }else{
            System.out.println("Contact add, "+name+"already on file");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name=scanner.nextLine();
        Contacts existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new Contact name: ");
        String newName=scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber=scanner.nextLine();
        Contacts newContact=Contacts.createContacts(newName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record.");
        }
    }
    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name=scanner.nextLine();
        Contacts existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name=scanner.nextLine();
        Contacts existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName()+"phone Number is"+existingContactRecord.getPhone_number());
    }
    private static void printContacts(){
        mobilePhone.printContacts();
    }
    private static void startPhone(){
        System.out.println("Starting phone...");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown"+
                "1 - to print contacts\n"+
                "2 - to add a new contact\n"+
                "3 - to update an existing contact\n"+
                "4 - to remove an existing contact\n"+
                "5 - query if an existing contact exists\n"+
                "6 - to print a list of available actions.");
        System.out.println("Choose your actions: ");
    }
}
