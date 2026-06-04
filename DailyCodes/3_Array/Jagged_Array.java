package DailyCodes.3_Array;


import java.util.*;

class Jagged_Array {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int [3] [];

        arr[0] = new int[2];
        arr[1] = new int [3];
        arr[2] = new int [4];

        System.out.println("Enter Array Elemnts :");
        
        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){

                arr[i][j] = sc.nextInt();

            }

        }

        System.out.println("Enter Array Elemnts :");

        for(int i=0 ;i<arr.length; i ++){
            
            for(int j=0; j<arr[i].length; j++){

                System.out.println(arr[i][j] + " ");

            }

            System.out.println();
        }

    }
}
