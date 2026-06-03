package Asgnpract.Array;

// A8. Store employee ages
import java.util.Scanner;

class A8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");

        int n = sc.nextInt();
        int[] age = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter age of employee " + (i+1) + ": ");
            age[i] = sc.nextInt();
        }

        System.out.println("Employee ages:");

        for(int i = 0; i < n; i++){

            System.out.println("Employee " + (i+1) + ": " + age[i]);

        }    
    }
}
