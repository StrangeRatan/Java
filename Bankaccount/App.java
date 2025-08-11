package Bankaccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<String,User> database=new HashMap<>();
        Useracount useracount=new Useracount();
        while(true){
            System.out.println("1:- Create User id and Password");
            System.out.println("2:- Login");   
            System.out.println("3:- Exit"); 
            System.out.println("4:- Check balance");
            System.out.println("5:- Add Balance");
            System.out.println("6:- Withdraw Amount");
           
            System.out.println("Chose the Above option 1 or 2 or 3 or 4 or 5 or 6");
            String i=scan.nextLine();
            
            

            switch (Integer.parseInt(i)) {
                case 1:{
                        System.out.println("Create User id");
                        String userid=scan.nextLine();
                        System.out.println("Enter Password");
                        String password=scan.nextLine();
                        useracount.signup(userid, password, database);
                    break;
                }
                case 2:{
                        System.out.println("Enter the userid");
                        String userid=scan.nextLine(); 
                        System.out.println("Enter the password");
                        String password=scan.nextLine();
                        useracount.login(userid,password,database);
                     break; 
                }   
                case 3:{
                        System.exit(0);
                        break;
                }
                case 4:{
                        System.out.println("Enter the userid");
                        String userid=scan.nextLine(); 
                        System.out.println("Enter the password");
                        String password=scan.nextLine();
                        useracount.checkBalance(userid, password, database);
                         break;

                }
                case 5:{
                        try{
                            System.out.println("Enter the userid");
                        String userid=scan.nextLine(); 
                        System.out.println("Enter the password");
                        String password=scan.nextLine();
                        System.out.println("Enter Amount that you want to add");
                         String input=scan.nextLine();
                          int  amount=Integer.parseInt(input);
                       
                        useracount.addBalance(userid, password, database,amount);
                    
                    }catch(Exception e){
                        System.out.println(e);
                        
                    }
                  break;      
                        
                }
                case 6:{
                        try{
                            System.out.println("Enter the userid");
                        String userid=scan.nextLine(); 
                        System.out.println("Enter the password");
                        String password=scan.nextLine();
                        System.out.println("Enter Amount that you want withdraw");
                         String input=scan.nextLine();
                         int amount=Integer.parseInt(input);
                    
                        useracount.withdrawAmount(userid, password, database, amount);
                        }catch(Exception e){
                            System.out.println(e);
                        }
                        
                }

                default:{
                    System.out.println("Plese chose correct option");
                    break;
                }
                    
            }

        }   
    }
}   

