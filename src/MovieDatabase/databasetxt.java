package MovieDatabase;

import Movie.Movie;
import java.io.*;
import java.util.ArrayList;

/**
 * Klassen databasetxt ansvarar för att spara och läsa filmer till och från en textfil.
 * Filen används som lagring av filmerna och betygen.
 */
public class databasetxt {


    /**
     * Sparar en lista med filmer till textfilen "movies.txt".
     * Varje film sparas på en egen rad i formatet: titel;betyg.
     *
     * @param movies lista med filmer som ska sparas till filen
     */
    public static void saveMovies(ArrayList<Movie> movies) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("movies.txt"))) {

            for (Movie movie : movies) {
                writer.write(movie.getTitle() + ";" + movie.getRating());
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Kunde inte spara filmer till fil.");
        }
    }

    /**
     * Läser in filmer från textfilen "movies.txt".
     * De filmerna som följer kravet hämtas ut och används i de andra metoderna i programmet.
     *
     * @return en lista med Movie-objekt som lästs in från filen.
     * Returnerar en tom lista om filen inte finns eller inte kan läsas.
     */
    public static ArrayList<Movie> loadMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        File file = new File("movies.txt");
        if (!file.exists()) {
            return movies;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                String title = parts[0];
                int rating = Integer.parseInt(parts[1]);
                movies.add(new Movie(title, rating));
            }

        } catch (IOException e) {
            System.out.println("Kunde inte läsa filmer från fil.");
        }

        return movies;
    }

}
