package e.a442u.androidquiz.Model;

public class user {
    private String Name;
    private String Password;
    private String Phone;

    public user() {
    }

    public user(String name) {
        Name = name;
    }

    public user(String name, String password) {
        Name = name;
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
