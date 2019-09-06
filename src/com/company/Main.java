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
        System.out.println("What would you like to do hit or stand ? ");
        String userInput= sc.nextLine();


            user.hit();




    }



}
