package readers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ifElseStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if((N/2) != 0){
            System.out.println("Weird");
        }
        if((N/2)==0){
            if((N<=5) && (N>=5)){
                System.out.println("Not Weird");
            }

            if((N<=20)&&(N>=20)){
                System.out.println("Weird");
            }
        }
    }
}
