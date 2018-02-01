import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to find its root");
	double input = scan.nextDouble();
	System.out.println("The square root is " + Math.sqrt(input));
    }
    
}
