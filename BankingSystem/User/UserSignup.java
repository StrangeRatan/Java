package BankingSystem.User;

public class UserSignup  {
    private String name;;
    private String fathename;
    private String mothername;
    private String gender;
    private String phonenumber;
    private String address;
    private String schoolname;
    private double balance;

    public UserSignup(String name, String fathename, String mothername, String gender, String phonenumber,
            String address, String schoolname,double balance) {
        this.name = name;
        this.fathename = fathename;
        this.mothername = mothername;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.address = address;
        this.schoolname = schoolname;
        this.balance=balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathename() {
        return fathename;
    }

    public void setFathename(String fathename) {
        this.fathename = fathename;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    
    
}
