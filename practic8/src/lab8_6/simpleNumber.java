package lab8_6;

import java.util.Scanner;

public class simpleNumber {
    public static void main(String[] args)
    {
        int n;
        int i = 2;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println(recursion(n, i));
    }

    public static String recursion(int n, int i){
        if (i == n){
            return "YES";
        }

        else if (n % i == 0 && i < n)
        {
            return "NO";
        }

        return recursion(n, i+1);
    }
}
