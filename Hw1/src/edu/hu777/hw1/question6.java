package edu.hu777.hw1;

import java.math.BigInteger;
import java.util.ArrayList;

public class question6 {
    public static void main(String[] args) {
        ArrayList <BigInteger> Fibb = new ArrayList<BigInteger>();
        Fibb.add(BigInteger.valueOf(1));
        Fibb.add(BigInteger.valueOf(1));
        for(int i = 2;i<100;i++ )
        {

            Fibb.add(Fibb.get(i-2).add(Fibb.get(i-1)));
        }
        System.out.println(Fibb);
        System.out.println("The 100th Fibonacci is "+Fibb.get(Fibb.size()-1));
    }

}
