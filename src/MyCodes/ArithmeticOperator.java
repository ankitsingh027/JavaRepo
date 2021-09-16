package MyCodes;

import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        int sum,sub,mul,div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        sum = (a+b);
        sub = (a-b);
        mul=(a*b);
        div=(a/b);


    }
}
