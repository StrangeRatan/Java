package AddressBook.RespositoryofData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import AddressBook.UserRepository.AddressBook;

public class database {
    Map<String,AddressBook> addressbook=new HashMap<>(); 
    Scanner scan=new Scanner(System.in);

    //add Entry in database;

    public void addDetail(String key, AddressBook value){
        
        addressbook.put(key, value);
        System.out.println("All detail Enter successfully");
        

    }



    //Show Entry 
    public void showAdrress(String key){
      if(addressbook.containsKey(key)){
        AddressBook user=addressbook.get(key);
        System.out.println("Full Name: "+user.getName());
        System.out.println("Phone Number: "+user.getPhone_number());
        System.out.println("Full Adrress: "+user.getAddress());
      }
    }
   // Edit Address
    public void editAddress(String key){
        if(addressbook.containsKey(key)){
            AddressBook user=addressbook.get(key);
            System.out.println("Enter new Name:");
            String newname=scan.nextLine();
            if(newname != null){
                user.setName(newname);
            }
            System.out.println("Enter new Address:");
            String newaddress=scan.nextLine();
            if(newaddress != null){
                user.setAddress(newaddress);;
            }

            
        }
    }

    public void saveToFile(String filename){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(addressbook);
            System.out.println("Address book saved.");
        }catch(IOException e){
            e.printStackTrace();;
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename){
        File file= new File(filename);

        if (!file.exists()) {
            addressbook = new HashMap<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            addressbook = (Map<String, AddressBook>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }


    }


}
