package Meny;

import MovieDatabase.MovieDatabase;

import java.util.Scanner;

public class Meny {
    private MovieDatabase db;
    private Scanner scan = new Scanner(System.in);

    public Meny(MovieDatabase db) {
        this.db = db;
    }

    public void  start()
    {
        System.out.println("");
    }


}
