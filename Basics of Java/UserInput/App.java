package App;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a text: ");
		
		String value = input.nextLine();
		
		System.out.println("You type: " + value);
	}
}
