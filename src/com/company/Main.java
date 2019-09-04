package com.company;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        Player user = new Player();
        Player dealer = new Player();



        System.out.println("Your total is "+user.defaultHandPlayer());
        System.out.println("The dealers total is "+dealer.defaultHandDealer());
        System.out.println("What would you like to do hit or stand ? ");


    }



}
