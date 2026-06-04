package Asgnpract.Array;

//  Vowel check in char array with index

import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        char[] arr = new char[size];

        for(int i = 0; i < size; i++)
            arr[i] = sc.next().charAt(0);

        for(int i = 0; i < size; i++) {
            char c = Character.toLowerCase(arr[i]);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                System.out.println("vowel " + arr[i] + " found at index " + i);
        }
    }
}
