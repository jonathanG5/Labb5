package Meny;

import Movie.Movie;
import MovieDatabase.MovieDatabase;


import java.util.ArrayList;
import java.util.Scanner;

import MovieDatabase.databasetxt;



public class Meny {
    private MovieDatabase database;
    private Scanner scan = new Scanner(System.in);

    public Meny(MovieDatabase database) {
        this.database = database;
    }

    public void start()
    {
        int function = 0;
        while(function != 4) {
            System.out.println("--Movie Database--");
            System.out.println("1.Search Title");
            System.out.println("2.Search Rating");
            System.out.println("3.Add Movie");
            System.out.println("4.Close Program");
            function = scan.nextInt();
            scan.nextLine();

            switch(function) { // fixa deafult case
                case 1 -> searchtitle();
                case 2 -> searchrating();
                case 3 -> addMovie();
                case 4 -> System.out.println()break;
                default -> System.out.println("Ogiltigt val, försök igen.");

            }
        }
    }

    private void searchtitle()// alla filmer kommer upp
    {
        System.out.print("Enter keyword: ");
        String keyword = scan.nextLine();
        ArrayList<Movie> movies = database.searchMovie(keyword);

        for (Movie movie : movies)
        {
            System.out.println(movie.toString());
        }
    }

    private void searchrating()
    {
        System.out.println("Enter minumum rating of movie (1-5)");
        int score = scan.nextInt();
        ArrayList<Movie> result = database.searchRating(score);
        for (Movie movie : result)
        {
            System.out.println(movie.toString());
        }

    }

    private void addMovie()
    {
        String title = "";

        while (title.isEmpty()) {
            System.out.print("Title: ");
            title = scan.nextLine();
        }
        System.out.println("Review score (1-5): ");
        int rating = scan.nextInt();
        database.addMovie(new Movie(title,rating));
        databasetxt.saveMovies(database.getMovies());

    }


}
