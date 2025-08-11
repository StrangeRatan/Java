package BankingSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import BankingSystem.User.UserLogin;
import BankingSystem.User.UserSignup;
import BankingSystem.UserService.Services;

public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<String,UserLogin> map=new HashMap<>();
        
    

        System.out.println("...............Welcome to Banking System..................................");
        while (true) {
            System.out.println("Press 1 number for  Login ");
            System.out.println("Press 2 number for Sigup ");
            
            try {
                int input=scan.nextInt();
                switch (input) {
                    case 1:{
                            System.out.println("Enter UserId:");
                            String userid=scan.nextLine();
                            System.out.println("Enter Password: ");
                            String password=scan.nextLine();
                            Services lservice=new Services();
                            lservice.login(userid, password, map);


                            
                        break;
                    }
                    case 2:{
                            System.out.println("Enter UserId:");
                            String userid=scan.nextLine();
                            System.out.println("Enter Password: ");
                            String password=scan.nextLine();
                            System.out.println("Enter Name: ");
                            String username=scan.nextLine();
                            System.out.println("Enter Father Name:");
                            String fathername=scan.nextLine();
                            System.out.println("Enter MotherName: ");
                            String mothername=scan.nextLine();
                            System.out.println("Enter Gender: ");
                            String gender=scan.nextLine();
                            System.out.println("Enter Phone Number:");
                            String phonenumber=scan.nextLine();
                            System.out.println("Enter Address: ");
                            String address=scan.nextLine();
                            System.out.println("Enter School Name: ");
                            String schoolname=scan.nextLine();
                            UserSignup newuser=new UserSignup(username, fathername, mothername, gender, phonenumber, address, schoolname,0.0);
                            UserLogin newlogin=new UserLogin(userid, password, newuser);
                            map.put(userid,newlogin);
                            
                        break;
                    }
                    default:
                        break;
                }
                
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }

    }
}
