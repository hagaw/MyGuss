package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String gess = "";
        int counter = 6;

        String[] myGess = new String[10];

        myGess[0] = ("Tree");
        myGess[1] = ("Rain");
        myGess[2] = ("Bear");
        myGess[3] = ("Encourage");
        myGess[4] = ("Promise");
        myGess[5] = ("Souop");
        myGess[6] = ("Chess");
        myGess[7] = ("Insurance");
        myGess[8] = ("Pancakes");
        myGess[9] = ("Stream");


        ArrayList<String> myGess2 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 6; i++) {
                    System.out.println("please inter your guss here");

            gess = sc.nextLine();

                  myGess2.add(gess);

                  System.out.println(" you have wrong guuss " + counter + " of guses to try again");

                counter--;
                if (counter == 0) {
                    System.out.println("you have finished your guss");

         }

        }

        for (String myGame:myGess2){
            System.out.println(myGame);
            }

        Random rd= new Random();
        int gs[]=new int[10];
        int rndGs;
        for (int x=0;x<10;x++){
            rndGs=1+rd.nextInt(15);
            gs[x]=rndGs;


            System.out.println("me"+ rndGs);

             System.out.println("Enter the game word here");
              sc.nextLine();

        }

        }
}


            // write your code here




