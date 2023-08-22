import java.util.Arrays;

public class User {
    private  static  int nextId = 1;
    private int id;
    private String userName;
    private String email;
    private String password;
    private Profile profile;


    public User(String userName, String email, String password, Profile profile) {
        this.id = nextId++;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.profile = profile;
    }


    public int getId() {
        return id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfiles(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                ", id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profiles=" + profile +
                '}';
    }

}
