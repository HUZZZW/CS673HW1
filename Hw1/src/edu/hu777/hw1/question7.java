package edu.hu777.hw1;

public class question7 {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void printRes(int year)
    {
        if(isLeapYear(year))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static void main(String[] args) {
        printRes(1000);
        printRes(1100);
        printRes(2020);
        printRes(2021);

    }
}
