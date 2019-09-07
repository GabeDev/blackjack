package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Player user = new Player();
        Player dealer = new Player();
        Scanner sc = new Scanner(System.in);

        user.defaultHandPlayerwithsum();
        dealer.defaultHandDealerwithsum();


        while (user.sumP<=21)
        {
            System.out.println("What would you like to do?");
            System.out.println("h for hit and s for stand ");
            String userInput= sc.nextLine();
            if(userInput=="h")
                user.hit();
            if(userInput=="s")
                user.stand();
        }


    }



}
