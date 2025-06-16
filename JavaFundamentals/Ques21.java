
import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates is %d\n", chocolatesPerChild, remaining);
    }
}
