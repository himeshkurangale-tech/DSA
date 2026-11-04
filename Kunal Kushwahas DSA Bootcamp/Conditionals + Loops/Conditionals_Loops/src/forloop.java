import java.util.Scanner;


public class forloop {
    public static void main(String[] args) {

        /*
           Syntax of for Loop


           for (initialization; condition; increment/decrement) {
                 //body

           }
         */
        // Q: Print numbers from 1 to 5

        for (int num = 1; num <= 5 ; num+=2 ) {

            System.out.println(num);
        }

        // Q: Print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number till you want to print all the numbers :");
        int n = in.nextInt();

        for (int num= 1; num <= n ; num ++){
            System.out.print(num + " ");
            // Print hello World n number of times
            System.out.println("Hello World");


        }





    }
}