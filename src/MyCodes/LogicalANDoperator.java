package MyCodes;

import java.util.Scanner;
public class LogicalANDoperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b =sc.nextInt();
        System.out.println("Enter third number :");
        int c =sc.nextInt();
        System.out.println(a<b&&a<c);
        System.out.println(a<b&&b<c);




    }
}
