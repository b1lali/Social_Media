import java.time.LocalDate;
import java.util.Arrays;

public class DateBase {
    private User[] users;
    private Profile [] profiles;

    public DateBase(User[] users, Profile[] profiles) {
        this.users = users;
        this.profiles = profiles;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Profile[] getProfiles() {
        return profiles;
    }

    public void setProfiles(Profile[] profiles) {
        this.profiles = profiles;
    }

    public User[] saveUser(User usersssss) {
        for (User use : users) {
            if (!use.equals(usersssss)) {
                User[] users1 = new User[users.length + 1];
                for (int i = 0; i < users.length; i++) {
                    users1[i] = users[i];
                }
                users1[users1.length - 1] = usersssss;
                users = Arrays.copyOf(users1, users1.length + 1);
                break;
            }
        }
        return this.users;

    }

    public User findUserById(Long id) {
        for (User user : users) {
            if (user.getId() == (id)) {
               return user;
            }
        }
        return null;
    }

    public void updateUserProfile(Long userId, Profile profile) {
        for (User user : users) {
            if (user!=null && user.getId()==userId) {
                Profile userProfile = user.getProfile();
                userProfile.setFull_name(profile.getFull_name());
                userProfile.setPosts(profile.getPosts());
                userProfile.setGender(profile.getGender());
                userProfile.setBio(profile.getBio());
                userProfile.setDate_of_birth(profile.getDate_of_birth());
            }
        }
        System.out.println("Successfully update ");
}

    public User[] deleteUser(Long userId) {
        int indexToRemove = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == userId) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            User[] arr = new User[users.length + 1];
            int j = 0;
            for (int i = 0; i < users.length; i++) {
                if (i != indexToRemove) {
                    arr[i] = users[i];
                    j++;
                    // System.out.println(user[i]);
                }
            }
            users = arr;
            users = Arrays.copyOf(arr, arr.length - 1);
        }
        return users;

    }
    public String saveProfile(Long userId, Profile profile) {
        for (User user : users) {
            if (user.getId() == userId) {
                user.setProfiles(profile);
                System.out.println(user);
                System.out.println(profile);
                break;
            }

            if(user.getId()!=userId){
                System.out.println("We can not find user by this ID");
            }
        }
        return "Added";

    }

    public Profile [] findProfileByUserId(Long userId) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].getId() == userId) {
                System.out.println(profiles[i]);
                return profiles;
            }
        }
        return null;
    }


    public String deleteProfileByUserId(Long userId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId()==userId){
                users[i].setProfiles(null);
                return "Deleted"+users[i];
            }
        }
        return null;
    }
    public void deleteComment(Comment comment) {
        for (int j = 0; j < profiles.length; j++) {
                for (Post p: profiles[j].getPosts()) {
                    for (Comment c : p.getComments()) {
                        if (c.equals(comment)) {
                            Comment[] comments = new Comment[p.getComments(  ).length - 1];
                            System.arraycopy(comments, j + 1, comments, j, comments.length - j - 1);
                            comments[comments.length - 1] = null;
                            System.out.println("Комментарий удален");
                            return;
                        }
                    }
                }
        }
        System.out.println("Указанный комментарий не найден");
    }


    public String savePost(Long userId, Post post) {
        for (Profile myProfiles : profiles) {
            if (myProfiles.getId() == userId) {
                Post[]  myOldPosts = myProfiles.getPosts();
                Post[] newPosts = new Post[myOldPosts.length + 1];
                for (int i = 0; i < myOldPosts.length; i++) {
                    newPosts[i] = myOldPosts[i];
                }
                newPosts[myOldPosts.length] = post;
                myProfiles.setPosts(newPosts);
                System.out.println(myProfiles);
                System.out.println(post);
            }
        }
        return "Added";
    }










    public void getPostByUserId(Long userId) {
        for(Profile profile: profiles){
            if(profile.getId()==userId){
                System.out.println(Arrays.toString(profile.getPosts()));
            }
        }

    }

    public Comment saveComment(Long postId, Long userId, Comment comment) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].getId() == userId) {
                for (Post p : profiles[i].getPosts()) {
                    if (p.getId() == postId) {
                        Comment[] oldComments = p.getComments();
                        Comment[] newComments = new Comment[oldComments.length + 1];
                        for (int j = 0; j < oldComments.length; j++) {
                            newComments[j] = oldComments[j];
                        }
                        newComments[oldComments.length] = comment;
                        p.setComments(newComments);
                        System.out.println(profiles[i]);
                        return comment;
                    }
                }
            }
        }
        return comment;
    }
}
