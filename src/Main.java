import java.io.*;
import java.util.Scanner;

class main {
        public static void main (String[] args){
            Scanner sc  = new Scanner(System.in);
            int n;
        while (true) {
            n = (int) (Math.random() * 50);
            System.out.print("N  = " + n + ". n^2 = ");
            int square = sc.nextInt();
            while (n*n != square && square != 0) {
                System.out.print("Enter again: ");
                square = sc.nextInt();
            }
            System.out.print("+");
            if (square ==0) break;
        }
    }
}