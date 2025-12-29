package MovieDatabase;

import Movie.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    private ArrayList<Movie> movies = new ArrayList<>();
    public MovieDatabase() {
        movies = databasetxt.loadMovies();
    }
    public void addMovie (Movie movie) {
        movies.add(movie);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
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
