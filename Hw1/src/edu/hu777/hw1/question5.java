package edu.hu777.hw1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class question5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(Arrays.asList("a","b","c"));
        ArrayList<String> b = new ArrayList<String>();
        b.addAll(Arrays.asList("1","2","3"));

        int len = Math.min(a.size(),b.size());
        ArrayList<String> res = new ArrayList<String>();
        for(int i =0;i<len;i++)
        {
            res.add(a.get(i));
            res.add(b.get(i));
        }
        System.out.println("List 1 is "+a);
        System.out.println("List 2 is "+b);
        System.out.println("Final list is "+res);

    }

    }

