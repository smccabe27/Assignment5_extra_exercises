import java.util.Scanner;

public class PrintName{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name");
		String input = scan.nextLine();
                String last = "";
                
		for(int i = input.length()-1;input.charAt(i) != ' ';i--){
			last = input.substring(i);
		}
		System.out.println("Hello Mr/Mrs " + last);
	}
}
