package com.michaelbahreini.movielist;


import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static MovieList movieList = new MovieList();

    public static void main(String[] args) {

        boolean exit = false;
        int select = 0;
        selectStep();
        while(!exit){
            System.out.print("Select an option: ");
            select = scan.nextInt();
            scan.nextLine();

            switch (select){
                case 0:
                    selectStep();
                    break;
                case 1:
                    movieList.showMovies();
                    break;
                case 2:
                    addMovie();
                    break;
                case 3:
                    changeMovie();
                    break;
                case 4:
                    removeMovie();
                    break;
                case 5:
                    searchMovie();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }

    public static void selectStep(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - Show options");
        System.out.println("\t 1 - Show list of all movies");
        System.out.println("\t 2 - To add a movie to the list.");
        System.out.println("\t 3 - To change a movie in the list.");
        System.out.println("\t 4 - To remove a movie from the list.");
        System.out.println("\t 5 - To look for a movie in the list.");
        System.out.println("\t 6 - Exit");
    }

    public static void addMovie(){
        System.out.print("Enter movie name: ");
        movieList.addMovie(scan.nextLine());
    }

    public static void changeMovie(){
        System.out.print("Name of movie to replace: ");
        String current = scan.nextLine();
        System.out.print("Replace movie with: ");
        String replace = scan.nextLine();
        movieList.changeMovie(current, replace);
    }

    public static void removeMovie(){
        System.out.print("Enter movie name: ");
        String removeMovie = scan.nextLine();
        movieList.removeMovie(removeMovie);
    }

    public static void searchMovie(){
        System.out.print("Search for Movie: ");
        String movieName = scan.nextLine();
        if(movieList.movieStorage(movieName)){
            System.out.println("The movie " + movieName + " is found on your movie list.");
        } else
            System.out.println(movieName + " cannot be found on this movie list");
    }

}