package AddressBook.UserRepository;

import java.io.Serializable;

public class AddressBook implements Serializable  {

   private static final long serialVersionUID = 1L;
   private String name;
   private String phone_number;
   private String address;


   public AddressBook(String name, String phone_number, String address) {
    this.name = name;
    this.phone_number = phone_number;
    this.address = address;
   }


   public String getName() {
    return name;
   }


   public void setName(String name) {
    this.name = name;
   }


   public String getPhone_number() {
    return phone_number;
   }


   public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
   }


   public String getAddress() {
    return address;
   }


   public void setAddress(String address) {
    this.address = address;
   }
   

   
    
    
   

}
