/**
 * Created with IntelliJ IDEA.
 * User: mnikonova
 * Date: 1/10/13
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private String USER_ATTR_PASSWORD;
    private String USER_ATTR_USERNAME;
    private RoleEnum USER_ATTR_ROLE;

    public String getUSER_ATTR_PASSWORD() {
        return USER_ATTR_PASSWORD;
    }

    public void setUSER_ATTR_PASSWORD(String USER_ATTR_PASSWORD) {
        this.USER_ATTR_PASSWORD = USER_ATTR_PASSWORD;
    }

    public String getUSER_ATTR_USERNAME() {
        return USER_ATTR_USERNAME;
    }


    public void setUSER_ATTR_USERNAME(String USER_ATTR_USERNAME) {
        this.USER_ATTR_USERNAME = USER_ATTR_USERNAME;
    }

}
