package MyCodes;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        int a = sc.nextInt();
        int r,temp , sum =0;
        temp = a;
        while (a>0){
            r = a%10;
            sum = (sum*10)+r;
            a=a/10;
        }
if(temp==sum) {
    System.out.println("the number is a palindrome number.");
}
else{
    System.out.println("the number is not palindrome");
}
    }
}
