import java.util.Arrays;

public class Post {
    private static int uniqueID=1;
    private int id;
    private String image;
    private String description;
    private int created;
    private Comment []comments;


    public Post(String image, String description, int created, Comment[] comments) {
        this.id = uniqueID++;
        this.image = image;
        this.description = description;
        this.created = created;
        this.comments = comments;
    }

    public Post() {
    }

    public int getId() {
        return id;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public Comment[] findCommentByPostId(Long postId) {
        for (int i = 0; i < comments.length; i++) {
            if (comments[i].getId() == postId) {
                System.out.println(comments[i]);

            }
        }
        return comments;
    }

    public void updateComment(Long commentId, String newText) {
       for (Comment cc: comments){
           if (cc.getId()==commentId){
               cc.setText(newText);
               System.out.println(cc);
           }
       }
    }
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id + '\n' +
                ", image='" + image + '\'' + '\n' +
                ", description='" + description + '\'' + '\n' +
                ", created=" + created + '\n' +
                ", comments=" + (Arrays.toString(comments)) + '\n' +
                '}';
    }
}
