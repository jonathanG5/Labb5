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

}
