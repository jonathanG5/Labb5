import Meny.Meny;
import Movie.Movie;
import MovieDatabase.MovieDatabase;

public class Main {
    public static void main(String[] args) {
        MovieDatabase Movies = new MovieDatabase();
        Meny meny = new Meny(Movies);
        Meny.start();
        }
    }
