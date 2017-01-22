import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int i = s.nextInt(); /*  Take Integar input */
		
		String string = Integer.toString(i); /* Convert to String */
		
		System.out.println(string);
	}
	
}
