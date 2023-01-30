package edu.hu777.hw1;

import java.util.ArrayList;

public class question4 {
    static String q4(String text) {
        int len = text.length();
        char [] stringArr = text.toCharArray();
        for (int i = 0 ; i<(len/2); i++)
        {
            if(stringArr[i]!=stringArr[(len-i-1)])
            {
                String res="It's not palindrome!";
                return res;
            }
        }
        return "It's palindrome!";
    }
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        test.add("aw3wa");
        test.add("asaa");
        test.add("wawaw");
        test.add("12345");
        test.add("ININI");

        for(int i =0; i <test.size();i++){
            System.out.println("The String is "+test.get(i));
            System.out.println(q4(test.get(i)));
        }

        }
}
