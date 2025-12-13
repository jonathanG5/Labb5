package MovieDatabase;

import Movie.Movie;

import java.util.ArrayList;

public class MovieDatabase {
    private ArrayList<Movie> movies = new ArrayList<>();
    public ArrayList<Movie> getMovies() {
        movies.add(new Movie("Training day", 5));
        movies.add(new Movie("White chicks", 5));
        movies.add(new Movie("Friday", 5));
        return movies;
    }
    public void addMovie(Movie movie) {
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
