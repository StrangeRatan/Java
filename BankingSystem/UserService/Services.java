package BankingSystem.UserService;

import java.util.Map;

import BankingSystem.User.UserLogin;

public class Services {
    Account account=new Account();

    public void login(String userid ,String password,Map<String,UserLogin> data){
        boolean isValid = data.entrySet().stream()
        .anyMatch(entry -> entry.getKey().equals(userid) &&
                           entry.getValue().getPassword().equals(password));
        UserLogin user=data.get(userid);
        if( data.containsKey(userid) && password.equals(user.getPassword())){
                System.out.println("SuccessFull Login");
                account.serviceAccount(userid, password, data);

            }else{
                System.out.println("Please Enter Righ Infomation");
            }
    }
}
