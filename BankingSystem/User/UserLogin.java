package BankingSystem.User;

public class UserLogin {
    private String userid;
    private String password;
    private UserSignup userSignup;

    public UserLogin(String userid, String password, UserSignup userSignup) {
        this.userid = userid;
        this.password = password;
        this.userSignup=userSignup;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void setUserSignup(UserSignup userSignup) {
        this.userSignup = userSignup;
    }

    public UserSignup getUserSignup() {
        return userSignup;
    }
    

}
