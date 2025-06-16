
import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.printf("The swapped numbers are %d and %d\n", number1, number2);
    }
}
