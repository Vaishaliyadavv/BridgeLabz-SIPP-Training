import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        float kilometers = sc.nextFloat();


        float miles = kilometers * 0.621371f;
        System.out.println("distance in miles: " + miles);

        sc.close();
    }
}
