
import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Your Name");
        String name = input.nextLine();
		
		System.out.println("You City Name");
        String fromCity = input.nextLine();
		
		System.out.println("You  are going Via which city N");
        String viaCity = input.nextLine();
		
		System.out.println("You  are going to which city ");
        String toCity = input.nextLine();
		
		System.out.println("Distance from your city to the city you are going to through to  finalDestination");
        double fromToVia = input.nextDouble();
		
		System.out.println("Distance from via city to the city you are going to finalDestination");
        double viaToFinalCity= input.nextDouble();
		
		System.out.println("Final destination distance");
		double finalDestination= input.nextDouble();
   }
}