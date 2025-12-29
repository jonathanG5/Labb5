package MovieDatabase;

import Movie.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *  MovieDatabase ansvarar för att hantera en samling filmer.
 *  Klassen erbjuder funktioner för att lägga till filmer och söka efter filmer baserat på titel eller betyg.
 */
public class MovieDatabase {

    /**
     * Lista som innehåller alla filmer i databasen
     */
    private ArrayList<Movie> movies = new ArrayList<>();

    /**
     * Läser in filmer från textfil, filmer, filmer som anges sparas i text filen.
     */
    public MovieDatabase() {
        movies = databasetxt.loadMovies();
    }

    /**
     * Lägger till en ny film i databasen
     * @param movie
     */
    public void addMovie (Movie movie) {
        movies.add(movie);
    }

    /**
     * Returnerar alla filmer i databasen.
      * @return en lista med alla Movie-objekt
     */
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    /**
     * Söker efter filmer där titeln innehåller ett visst nyckelord.
     *
     * @param keyword nyckelord som ska matchas mot filmens titel
     * @return lista med filmer som matchar sökningen
     */
    public ArrayList<Movie> searchMovie(String keyword) {
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    /**
     * Söker efter filmer som har ett betyg som är lika med eller högre än det angivna värdet.
     *
     * @param score lägsta betyg som filmerna ska ha
     * @return lista med filmer som uppfyller kravet
     */
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
