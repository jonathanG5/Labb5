package MovieDatabase;

import Movie.Movie;
import java.io.*;
import java.util.ArrayList;

public class databasetxt {

    // SKRIVER till movies.txt
    public static void saveMovies(ArrayList<Movie> movies) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("movies.txt"))) {

            for (Movie movie : movies) {
                writer.write(movie.getTitle() + ";" + movie.getRating());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace(); // fångar felet, pogrammet kraschar inte
        }
    }

    public static ArrayList<Movie> loadMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        File file = new File("movies.txt");
        if (!file.exists()) {
            return movies; // om filen inte finns än, kommer tillbaka med tom lista
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
            e.printStackTrace(); //fångar felet, pogrammet kraschar inte
        }

        return movies;
    }

}
