package com.company;

import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class MovieListIIArrays {

    public static void main(String[] args) {
	// write your code here don know why..positive environment; goback movie.
        Scanner keyboard = new Scanner(System.in);
        /*ArrayList<String> movie = new ArrayList<String>();
        String con = "";
        while(true){
            System.out.print("movie?: ");
            String addm = keyboard.next();//add
            movie.add(addm);
            System.out.print("continue? y-yes/q,Q-no: ");//y,Y-yes
            con = keyboard.next();
            if(con.equalsIgnoreCase("q"))//if(con.equals("q"))
                break;
            if(movie.contains(addm))//add
                System.out.print("same movie: ");//another movie?:
            else
                System.out.print("another movie??: ");
        }
        System.out.println("array list has following movies:"+movie);*/

        //
        String[] movies = new String[10];
        boolean quit = false;

        do {
            System.out.print("movie?: ");//some movie right
            String usermovie = keyboard.next();
            for (int i =0; i < movies.length; i++) {
//quit
                if (usermovie.equals(movies[i])){
                    System.out.println("movie already taken");
                    break;
                }
                else if (movies[i] == null) {
                    movies[i] = usermovie;
                    break;
                }
                else{
                    continue;
                }
            }
            System.out.print("quit?-q,Q: ");
            String quitinput = keyboard.next();
            if (quitinput.equalsIgnoreCase("q")){//equals
                quit = true;
            }

            //System.out.print(movies);
        }
        while (quit == false);

        System.out.println("movie list: ");
        for (int i =0; i < movies.length; i++){
            if(movies[i] != null)
            System.out.println(movies[i]);//print
        }
        keyboard.close();
    }
}
