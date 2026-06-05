package Asgnpract.Conditional_Statments.Number_System_1;

import java.util.Scanner;

import java.util.ArrayList;


import java.util.Collections;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        long n = sc.nextLong();

        ArrayList<String> list = new ArrayList<>();

        while (n > 0) {

            int d = (int)(n % 10);

            if (d % 2 == 0) list.add(String.valueOf(d));

            else list.add(String.valueOf(d * d));
            n /= 10;
        }

        Collections.reverse(list);

        System.out.println(String.join(", ", list));
    }
}
