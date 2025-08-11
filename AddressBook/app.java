package AddressBook;

import java.io.File;
import java.lang.foreign.AddressLayout;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import AddressBook.RespositoryofData.database;
import AddressBook.RespositoryofData.databasefile;
import AddressBook.UserRepository.AddressBook;


public class app {
    public static void main(String[] args) {
      
        database map=new database();
        Scanner sc=new Scanner(System.in);
        String filename = "addressbook.dat";
        map.loadFromFile(filename);
    
        while (true){
        System.out.println("Chose the follwoing Option");
        System.out.println("1: New Contact entry");
        System.out.println("2: View Contact entry");
        System.out.println("3: Edit the Contact entry");

        try{

                String input=sc.nextLine();


                switch (Integer.parseInt(input)) {
                    case 1: { 
                                System.out.println("Enter Full Name:");
                                String fullname=sc.nextLine();
                                System.out.println("Enter Phone Number:");
                                String phonenumber=sc.nextLine();
                                System.out.println("Enter Full Address:");
                                String fulladdress=sc.nextLine();
                                AddressBook addaddress=new AddressBook(fullname, phonenumber, fulladdress);
                                map.addDetail(phonenumber, addaddress);

                                 
                                map.saveToFile(filename);
                                
                         break;


                                
                    }
                        
                    case 2: {
                        System.out.println("Enter the phone number");
                        String number=sc.nextLine();
                        map.showAdrress(number);
                        
                        break;
                        
                    }  

                    case 3:
                            return;
                    case 4:{
                        System.out.println("Enter the phone number");
                        String number=sc.nextLine();
                        //  map.editAddress(number);
                         break;
                    }        
                
                    default:
                        System.out.println("Invalid option.");
                }
            }catch(Exception e){
                System.out.println(e);
        }
    }
 }

}
