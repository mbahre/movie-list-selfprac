package com.michaelbahreini.movielist;

import java.util.ArrayList;

public class MovieList {

    private ArrayList<String> movieList = new ArrayList<String>();

    public void addMovie(String movie){
        movieList.add(movie);
        System.out.println(movie + " added successfully to your list");
    }

    public void showMovies(){
        System.out.println("You have " + movieList.size() + " movies on your list.");
        for(int i = 0; i < movieList.size(); i++){
            System.out.println((i + 1) + ". " + movieList.get(i));
        }
    }

    public void changeMovie(String currentMovie, String newMovie){
        int index = findMovie(currentMovie);
        if(index >= 0){
            changeMovie(index, newMovie);
        }
    }

    private void changeMovie(int index, String name){
        movieList.set(index, name);
        System.out.println("Movie " + (index + 1) + " has been changed successfully.");
    }

    public void removeMovie(String movie){
        int index = findMovie(movie);
        if(index >= 0){
            movieList.remove(movie);
        }
        System.out.println(movie + " has been removed successfully");
    }

    private void removeMovie(int movie){
        movieList.remove(movie);
    }

    public int findMovie(String searchMovie){
        return movieList.indexOf(searchMovie);
    }

    public boolean movieStorage(String searchMovie){
        int index = findMovie(searchMovie);
        if(index >= 0){
            return true;
        } else {
            return false;
        }
    }

}