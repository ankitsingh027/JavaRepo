package MyCodes;
import java.util.Scanner;
public class ifelseTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        int number = sc.nextInt();
        String Output=(number%2==0)?"Even Number":"Odd number";
        System.out.println(Output);

    }
}
