package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Player
{
    // a total
    int handTotal=0;
    Random rand = new Random();

    int [] hand=new int [2];


    //composed of minimum 2 cards
    //a card is a random
    public static int genRandom(){
        return new Random().nextInt(13);// or may be cache random instance
    }

    public  int defaultHandPlayer()
    {
        int sumP=0;

        for (int i = 0; i < hand.length; i++)
        {
            hand[i]=genRandom();
        }
        sumP=hand[0]+hand[1];
        System.out.println("your hand is "+ Arrays.toString(hand));
        return sumP;
    }
    public  int defaultHandDealer()
    {
        int sumD=0;
        for (int i = 0; i < hand.length; i++)
        {
            hand[0]=genRandom();
        }
        sumD=hand[0];
        System.out.println("The dealer shows "+ Arrays.toString(hand));
        return sumD;
    }
    public  int hit()
    {

        return 0;
    }
    public  int stand()
    {
        return 0;
    }

}
