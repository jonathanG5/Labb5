import Meny.Meny;
import MovieDatabase.MovieDatabase;

/**
 * Main-klassen är programmets startpunkt.
 * Här används databasen och menyn, och programmet startas.
 */
public class Main {
    /**
     * Skapar databasen och läser in filmer från fil
     * Skapar menyn och skickar med databasen
     * Startar menyloopen
     * @param args
     */
    public static void main(String[] args) {
        MovieDatabase Movies = new MovieDatabase();
        Meny meny = new Meny(Movies);
        meny.start();
        }
    }
