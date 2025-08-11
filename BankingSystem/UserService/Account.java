package BankingSystem.UserService;

import java.util.Map;
import java.util.Scanner;

import AddressBook.app;
import Bankaccount.User;
import BankingSystem.User.UserLogin;

public class Account {
    Scanner scan= new Scanner(System.in);
    public void serviceAccount(String userid,String password,Map<String,UserLogin> database){
        UserLogin user=database.get(userid);
        if(password.equals(user.getPassword())){
            while(true){
            System.out.println("Press 1 for check Balance");
            System.out.println("Press 2 for Deposite Balance");
            System.out.println("Press 3 for withraw Balance");
            System.out.println("Press 4 logout");
            try {
                String input=scan.nextLine();

                switch (Integer.parseInt(input)) {
                    case 1:{
                         System.out.println("Current Balance :"+user.getUserSignup().getBalance());
                        break;
                    }
                    case 2:{
                        while(true){
                        System.out.println("Enter Amount that want you add");
                        String rs=scan.nextLine();
                        if(Double.parseDouble(rs)>0){
                        user.getUserSignup().setBalance(Double.parseDouble(rs)+user.getUserSignup().getBalance());
                        System.out.println("Amount is added");
                          break;
                        }else{
                            System.out.println("Please Enter positive amount");
                        }
                     }
                     break;
                    }
                    case 3:{
                        System.out.println("Enter Amount that want you Withdraw");
                        String rs=scan.nextLine();
                        if(Double.parseDouble(rs)>0 && user.getUserSignup().getBalance()>Double.parseDouble(rs)){
                            user.getUserSignup().setBalance(user.getUserSignup().getBalance()-Double.parseDouble(rs));
                            System.out.println("Amount withdraw succefully");
                        }else{
                            System.out.println("insufficent balance");
                        }
                        
                    }

                    case 4:
                        return;
                    
                        
                        
                
                    default:
                        break;
                }
                
            } catch (Exception e) {
                // TODO: handle exception
            }
            }
        }
      
    }
}
