package Movie;

public class Movie {
    private String title;
    private int rating;

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public int getRating() {
        return rating;
    }
public String toString(){
        return " " + rating;
}

}
