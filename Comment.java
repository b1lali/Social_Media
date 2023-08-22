import java.time.LocalDate;
import java.util.Locale;

public class Comment {
    private static int uniqueID=1;
    private int id;
    private String text;
    private LocalDate comment_date;

    public Comment( String text, LocalDate comment_date) {
        this.id = uniqueID++;
        this.text = text;
        this.comment_date = comment_date;
    }


    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getComment_date() {
        return comment_date;
    }

    public void setComment_date(LocalDate comment_date) {
        this.comment_date = comment_date;
    }

    @Override
    public String toString() {
        return "Comment{" + '\n' +
                "id=" + id + '\n' +
                ", text='" + text + '\n' +
                ", comment_date=" + comment_date + '\n' +
                '}';
    }
}
