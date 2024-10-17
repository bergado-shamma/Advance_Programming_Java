package App;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a command: ");
		String command = input.nextLine();
		
		switch(command) {
			
			case "Start":
				System.out.println("System is started");
			break;
			
			case "Stop":
				System.out.println("System is stopped");
			break;
			
			default:
				System.out.println("Unknown Command");
		}
		
		input.close();
	}
}
