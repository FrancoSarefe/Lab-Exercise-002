
import java.util.Scanner;

public class Estimator {
	
	static int size;
	static int speed;
	static int total_second;
	static int total_minutes;
	static int minutes;
	static int hours;
	static int seconds;

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Welcome to the Download Time Estimator");
			
			char again = 0;
			
			do {
			
				System.out.print("\nEnter file size (MB): ");
				size = scanner.nextInt();

				System.out.print("Enter download speed (MB/sec): ");
				speed = scanner.nextInt();
				
				total_second = size / speed;
	            total_minutes = total_second / 60;
	            
	            minutes = total_minutes % 60;
	            hours = total_minutes / 60;
	            seconds = total_second % 60;
				
				System.out.println("\nThis download will take approximately " + hours + " hours " + minutes +" minutes " + seconds + " seconds");
				
				System.out.print("\nContinue? (y/n): ");
				again = scanner.next().charAt(0);
	
			}while((again == 'y') || (again == 'Y'));
			
		}

	}

}
