package MovieDatabase;

import Movie.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    private ArrayList<Movie> movies = new ArrayList<>();
    public MovieDatabase() {
        movies.add(new Movie("Training day", 5));
        movies.add(new Movie("White chicks", 2));
        movies.add(new Movie("Friday", 3));
    }
    public void addMovie(Movie movie ) {
        movies.add(movie);
    }
    public ArrayList<Movie> searchMovie(String keyword) {
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }
    public ArrayList<Movie> searchRating(int score) {
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating() >= score) {
                result.add(movie);
            }
        }
        return result;
    }
}
