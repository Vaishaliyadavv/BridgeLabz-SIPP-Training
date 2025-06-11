import java.util.*;

public class Problem5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		float height = sc.nextFloat();
		
		float volume = 3.14f * radius * radius * height;
		System.out.println(volume);
	}
}