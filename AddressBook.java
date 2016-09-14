/*
 */
package addressbook;

import java.util.LinkedList; //Needed for linked list
import javax.swing.JOptionPane; //Needed for JOptionPane
import java.io.*; //Needed for file IO

/**
 *
 * @author Taylor Jenkins
 */
public class AddressBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        //Variables
        String counterStr; 
        String filename;
        
        JOptionPane.showMessageDialog(null, "This program will create a new file "
                + "or rewrite an existing file to store contacts.");
    
        counterStr = JOptionPane.showInputDialog("How many contacts would you like to enter? ");
        int counter = Integer.parseInt(counterStr);
        
        //Get filename and create a new file 
        filename =  JOptionPane.showInputDialog("Enter a filename: (ex: contacts.txt) ");
        PrintWriter outputFile = new PrintWriter(filename);
                
        System.out.println("Contacts: ");//heading for console
        outputFile.println("Contacts: ");//heading for file
        
        //populates linked list
        for(int i=1; i <= counter; i++){
            LinkedList<Contact> contactList = new LinkedList<Contact>();
            contactList.add(createContact());
            
            //Prints contacts and their information to the console.
            System.out.println(contactList.getFirst().getFname() 
                + " " + contactList.getFirst().getLname()+ "| " 
                + contactList.getFirst().getAddress()+ "| " 
                + contactList.getFirst().getPhoneNumber()+ "| " 
                + contactList.getFirst().getEmail());
            
            //Prints contacts and information the file.
            outputFile.println(contactList.getFirst().getFname() 
                + " " + contactList.getFirst().getLname());
            outputFile.println(" " + contactList.getFirst().getAddress()
                + " | " + contactList.getFirst().getPhoneNumber()+ " | " 
                + contactList.getFirst().getEmail());
        } 
        
        //Close the file.
        outputFile.close();
        System.out.println("Your file has been created.");

   }
    
    public static Contact createContact(){
        /* This functions gathers the information from the user about the contact
        and stores it in a linked list.
        */
        //Temp Variables
        String phoneNumber;
        String fName;
        String lName;
        String address;
        String emailAddress;
        
        //Get input from user
        fName = JOptionPane.showInputDialog("First Name: ");
        lName = JOptionPane.showInputDialog("Last Name: ");
        phoneNumber = JOptionPane.showInputDialog("Phone Number: ");
        address = JOptionPane.showInputDialog("Address: ");
        emailAddress = JOptionPane.showInputDialog("Email Address: ");
        
        Contact createFriend = new Contact(phoneNumber,fName,lName,address,emailAddress);
        return createFriend;
    }

    }
