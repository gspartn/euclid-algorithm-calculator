import java.util.Scanner;

public class euclid{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the greatest common divisor (m)");
        int n = sc.nextInt();
        System.out.println("Enter the second divisor (n)");
        int m = sc.nextInt();
        
        if (n > m){

        int q = n / m;
        int r = n - (m * q);

                for (int i = 1; r > 0; i++){
            
            System.out.println("\nSTEP " + i + "\n");
            System.out.println("n is " + n);
            System.out.println("m is " + m);
            q = n / m;
            System.out.println("q is " + q);
            r = n - (m * q);
            System.out.println("r is " + r);
            n = m;
            m = r;
                    
                }
         }

            else {
            System.out.println("The greatest common divisor (m) needs to be larger than the second divisor! (n)");
            }

        System.out.println("\nThe greatest common divisor GCD is " + n);

         }
    }

