package com.company;

public class Main {

    public static void main(String[] args) {
        int A = 100;
        int B = 50;
        if (A >= 100) {
            if (B <= 50)
                System.out.println(1);
        } else
            System.out.println(0);

        if(A>=100)
        {
            if(B<=50)
                System.out.println(1);
        }
        else if (B>=100)
        {
        if(A<=100)
            System.out.println(1);
        }
        else
            System.out.println(0);


    }
}
