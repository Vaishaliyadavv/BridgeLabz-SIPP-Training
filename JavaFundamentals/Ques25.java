
import java.util.Scanner;

public class Ques25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int handshakes = numberOfStudents * (numberOfStudents - 1) / 2;
        System.out.println("The number of possible handshakes is " + handshakes);
    }
}