package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player
{
    // a total
    int handTotal=0;
    //ublic Random rand = new Random();
    int sumP=0;
    int sumD=0;
    ArrayList<Integer> handP = new ArrayList<Integer>(2);
    ArrayList<Integer> handD = new ArrayList<Integer>(2);
    //composed of minimum 2 cards
    //a card is a random
    public static int genRandom()
    {
        int card = (int)(Math.random() * 13 + 1);
        return card;
    }

    public  void defaultHandPlayerwithsum() {

        handP.add(genRandom());
        handP.add(genRandom());
        for (int i=0;i<handP.size();i++)
        {
            sumP+=handP.get(i);
        }
        System.out.println("Your hand is "+handP);
        System.out.println("Your total is "+sumP);


    }

    public  void defaultHandDealerwithsum()
    {


        handD.add(genRandom());
        for (int i=0;i<handD.size();i++)
        {
            sumD+=handD.get(i);
        }
        System.out.println("The dealer is showing"+handD);
        System.out.println("Your total is "+sumD);

    }
    public  void  hit()
    {
        handP.add(genRandom());
        sumP+=handP.get(handP.size()-1);
        System.out.println("your new hand is "+handP);


    }
    public void stand()
    {
        System.out.println("Your sum is"+sumP);
        System.out.println("Dealers sum is"+sumD);

        if(sumP>sumD&&sumP<21)
        {
            System.out.println("You win");
        }
        else
        {
            System.out.println("you lose");
        }

    }

}
