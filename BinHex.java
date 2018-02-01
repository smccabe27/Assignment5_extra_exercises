import java.util.Scanner;

public class BinHex {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer or character to convert");
        String input = scan.next();
        int number = 0;
        if(input.matches(".*\\d+.*")){
           number = Integer.parseInt(input);
        }
        else{
            number = Integer.parseInt(input,16);
        }
        System.out.println("Hexidecimal: " + Integer.toHexString(number)
                + "\nBinary: " + Integer.toBinaryString(number));
    }
}