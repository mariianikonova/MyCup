import java.io.Serializable;

public class User implements Serializable {

    private String userPassword;
    private String userName;


    public User(String userPassword, String userName) {
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

}
