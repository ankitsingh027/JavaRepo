package MyCodes;

import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        System.out.println("Enter the weight :");
        int weight = sc.nextInt();
        if (age >18){
            if (weight>=50){
                System.out.println("You are eligible to donate organ");
            }
        }
        else {
            System.out.println("You can't donate organ");
        }
    }
}
