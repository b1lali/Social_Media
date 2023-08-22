import java.time.LocalDate;
import java.util.Arrays;

public class Profile {

    private static int nextId = 1;
    private int id;
    private String full_name;
    private LocalDate date_of_birth;
    private String gender;
    private String bio;
    private Post [] posts;
    private Profile [] profiles;

    public Profile(String full_name, LocalDate date_of_birth, String gender, String bio, Post[] posts) {
        this.id = nextId++;
        this.full_name = full_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.bio = bio;
        this.posts = posts;
    }

    public Profile(int id, String full_name, LocalDate date_of_birth, String gender, String bio) {
        this.id = id;
        this.full_name = full_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.bio = bio;
    }

    public Profile() {
    }


    public int getId() {
        return id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }








    @Override
    public String toString() {
        return "Profile{" + '\n' +
                ", id=" + id + '\n' +
                ", full_name='" + full_name + '\'' + '\n' +
                ", date_of_birth=" + date_of_birth + '\n' +
                ", gender='" + gender + '\'' + '\n' +
                ", bio='" + bio + '\'' + '\n' +
                ", posts=" +(Arrays.toString(posts)) + '\n' +
                '}';
    }
}
