package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int month = 1;
        int fertile = 0;
        int baby = 0;
   

        while (month <=12){


            baby = fertile;

            if (month == 1)
                baby +=1;
            System.out.println("Month: " + month + " Fertile Rabbits:" + fertile + " baby Rabbits:"+ baby);

            fertile = fertile + baby;
            month ++;

        }
        fertile = fertile + baby;
        System.out.println(fertile+ " Pairs of rabbits");

    }
}
