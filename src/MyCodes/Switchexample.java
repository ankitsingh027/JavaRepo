package MyCodes;

import java.util.Scanner;

public class Switchexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        switch (a){
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            //Default case statement
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
}

