package lab8_5;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        int N;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        System.out.println(recursion(N, sum));
    }
    public static int recursion(int N, int sum){


        if(N < 1){
            return sum;
        }

        else {
            sum += N % 10;
            return recursion(N / 10, sum);
        }
    }
}
