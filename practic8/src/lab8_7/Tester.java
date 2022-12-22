package lab8_7;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        int n;
        int j = 2;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println("1 " + recursion(n, j));
    }

    public static String simpleNumber(int n, int i){
        if (i == n){
            return "YES";
        }

        else if (n % i == 0 && i < n)
        {
            return "NO";
        }

        return simpleNumber(n, i+1);
    }

    public static String recursion(int n, int j){
        int i = 2;
        return (n != j && n % j == 0 && simpleNumber(j, i) == "YES") ?  j + " " + recursion(n, j+1) : (n != j) ? recursion(n, j+1): "";
    }
}
