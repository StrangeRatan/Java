package Bankaccount;

public class User {
    private String id;

    private String password;

    private Account account;

    public User(String id,String password,Account account){
        this.id=id;
        this.password=password;
        this.account=account;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public Account getAccount(){
        return account;
    }

    public void setAmount(Account account){
        this.account=account;
    }
    
}
