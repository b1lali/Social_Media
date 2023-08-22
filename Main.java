import java.time.LocalDate;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Comment comment = new Comment("Soonun",LocalDate.of(2023,1,17));
        Comment comment1 = new Comment("Like",LocalDate.of(2023,6,13));
        Comment[] comments ={comment,comment1};

        Comment comment2 = new Comment("Puuushkaa",LocalDate.of(2023,5,1));
        Comment comment3 = new Comment("Vai-vai",LocalDate.of(2023,2,19));
        Comment[] comments1 ={comment2,comment3};

        Comment comment4 = new Comment("Bazar jook",LocalDate.of(2023,5,1));
        Comment comment5 = new Comment("In sha Allah",LocalDate.of(2023,2,28));
        Comment [] comments2 = {comment4,comment5};

        Post posts = new Post("Ala-Archa","salam baby ",4,comments);
        Post post1 = new Post("Turkey","qara-deniz",2,comments);
        Post [] posts1 = {posts,post1};

        Post post2 = new Post("Kyrgyzstan","Jailoodon salam baaryna",3,comments1);
        Post post3 = new Post("Dubai","hello dubai",3,comments1);
        Post[] posts2 = {post2,post3};

        Post post4 = new Post("America","chicago",3,comments2);
        Post post5 = new Post("Bishkek ponarama","kechki bishkek",3,comments2);
        Post [] posts3 = {post4,post5};



        Profile profile = new Profile("Bili", LocalDate.of(2020,8,29),"M","bilal",posts1);
        Profile profile1 = new Profile("Хабиб", LocalDate.of(2002,4,13),"M","bilal",posts2);
        Profile profile2 = new Profile("Conor McGregor", LocalDate.of(2019,5,24),"M","bilal",posts3);
        Profile [] profiles = {profile,profile1,profile2};

        User user = new User("bilal","bilal@gmail.com","12345678",profile1);
        User user1 = new User("Jandar","janjan@gmail.com","jan1223",profile);
        User user2 = new User("Conorbek","конор@gmail.com","12345678",profile2);
        User [] users = {user,user1,user2};


        DateBase dateBase = new DateBase(users,profiles);
        System.out.println(Arrays.toString(dateBase.saveUser(user)));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(dateBase.findUserById(2L));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        dateBase.updateUserProfile(3L,profile1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(Arrays.toString(dateBase.deleteUser(3L)));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        dateBase.saveProfile(1L,profile1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        dateBase.findProfileByUserId(3L);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(dateBase.deleteProfileByUserId(1L));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(dateBase.savePost(1L, posts));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        dateBase.getPostByUserId(1L);
        System.out.println(dateBase.saveComment(1L, 2L, comment2));
        Profile profile3 = new Profile();
       dateBase.deleteComment(comment1);
        System.out.println("----------------------------");
       post1.updateComment(1L,"Java");
        System.out.println("----------------------------");
       System.out.println(Arrays.toString(posts.findCommentByPostId(1L)));


    }
}

