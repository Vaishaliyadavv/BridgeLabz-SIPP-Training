import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
        float rate = sc.nextFloat();

        System.out.print("Enter time in years: ");
        int time = sc.nextInt();

        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}
