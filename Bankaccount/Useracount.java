package Bankaccount;

import java.util.Map;

public class Useracount {
    

    public void signup(String userid, String password,Map<String,User>database){
        try{ 
            Account account=new Account("Saving", 0);
            User user=new User(null, null, account);
            user.setId(userid);
            user.setPassword(password);
            database.put(userid, user);
             System.out.println("Signup successfull");
        }catch(Exception e){
            System.out.println(e);
         }
       
    }

    
    
    public void login(String userid ,String password, Map<String,User> database){
        try{
            if(database.containsKey(userid)){
             User user=database.get(userid);
            if(user.getPassword().equals(password)){
                System.out.println("Login Successful!");
                }
            }else{
                System.out.println("user id or password does not exit!");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void checkBalance(String userid, String password,Map<String,User> database){
       try{
            if(database.containsKey(userid)){
             User user=database.get(userid);
            if(user.getPassword().equals(password)){
                System.out.println("Account Type:"+user.getAccount().getType());
                System.out.println("Account Balance:Rs "+user.getAccount().getAmount());
            }else{
                System.out.println("Wrong Userid or Password Try again");
            }

        }else{
            System.err.println("Try again");
        }
       }catch(Exception e){
        System.out.println(e);
       } 

    }

    public void addBalance(String userid, String password,Map<String,User> database,double amount){
        try{
                if(database.containsKey(userid)){
              User user=database.get(userid);
            if(user.getPassword().equals(password)){
               double curramount=user.getAccount().getAmount()+amount;
               user.getAccount().setAmount(curramount); 
               System.out.println("Balance is added");
               
            }else{
                System.out.println("Invalid id or password");
            }
        }else{
                System.out.println("Something went wrong try again");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void withdrawAmount(String userid, String password,Map<String,User> database,double amount){
       try{
            if(database.containsKey(userid)){
            User user=database.get(userid);
            if(user.getPassword().equals(password)){
                 if(amount<user.getAccount().getAmount()){
                    double curramount=user.getAccount().getAmount()+amount;
                    user.getAccount().setAmount(curramount); 
                    System.out.println(amount+" is withdraw form your account");
                }else{
                    System.out.println("Insuficent amount");
                }
            }
            else{
            System.out.println("Invalid id or password");
            }
        
        }else{
                System.out.println("Something went wrong try again");
            }
       }catch(Exception e){
        System.out.println(e);
       }
        

    }
}
