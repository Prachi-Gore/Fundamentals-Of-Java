import java.util.Scanner;

public class Loop12A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive integer : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {     // no. of rows
            for (int j = 1; j <= n-i; j++)  // no. of spaces
                System.out.print(" ");
            for (int k=1;k<=2*i-1;k++)      // no. of stars
                System.out.print("*");
            System.out.println();
        }


    }
}
// inner loops (j and k) are related with outer loop(i)

