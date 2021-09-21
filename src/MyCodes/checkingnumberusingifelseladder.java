package MyCodes;

import java.util.Scanner;
import java.util.Scanner;
public class checkingnumberusingifelseladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : \n");
        int number = sc.nextInt();
        if (number>0)
        {
            System.out.println("the number is positive\n");
        }
        else if(number<0)
        {
            System.out.println("the number is negative\n");
        }
        else {
            System.out.println("zero\n");
        }
    }
}
