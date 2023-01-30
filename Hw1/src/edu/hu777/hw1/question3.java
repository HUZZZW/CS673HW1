package edu.hu777.hw1;

public class question3 {
    static int size = 5;
    static void print_table() {
        int table[][] = new int[13][13];
        for(int i =0; i<13;i++)
        {
            table[i][0]=i;
            for(int j=0;j<13;j++)
            {
            table[0][j]=j;

            }
        }
        for(int i =1; i<13;i++)
        {
            for(int j=1;j<13;j++)
            {
                table[i][j]=i*j;
            }
        }
        for (int i = 0; i < 13; ++i) {
            for (int g=0;g<13;++g) {
                System.out.print("|");
                int len = String.valueOf(table[i][g]).length();
                int left_space = (size-len)%2==0 ?(size-len)/2 :(size-len)/2+1 ;;
                int right_space = (size-len)/2    ;
                for (int j = 0; j < left_space; ++j) {
                    System.out.print(" ");
                }
                System.out.print(table[i][g]);

                for (int j = 0; j < right_space; ++j) {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        System.out.print("|\n");

    }
    public static void main(String[] args) {
        print_table();
    }
}
