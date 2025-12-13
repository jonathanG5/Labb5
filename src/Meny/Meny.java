package Meny;

import Movie.Movie;
import MovieDatabase.MovieDatabase;

import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
import java.util.Scanner;

public class Meny {
    private MovieDatabase db;
    private Scanner scan = new Scanner(System.in);

    public Meny(MovieDatabase db) {
        this.db = db;
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

            switch(function) {
                case 1 -> searchtitle();
                case 2 -> searchrating();
                case 3 -> addMovie();
            }
        }
    }

    private void searchtitle()
    {
        System.out.print("Enter keyword: ");
        String keyword = scan.nextLine();

        ArrayList<Movie> movies = db.searchMovie(keyword);

        for (Movie movie : movies) {
            System.out.println(movies);
        }
    }

    private void searchrating()
    {
        System.out.println("Enter minumum rating of movie (1-5)");
        int minumum = scan.nextInt();
        scan.nextLine();




    }

    private void addMovie()
    {
        System.out.println("Title: ");
        String title = scan.nextLine();

        System.out.println("Review score (1-5): ");
        int rating = scan.nextInt();
        scan.nextLine();
        db.addMovie(new Movie(title,rating));
    }


}
