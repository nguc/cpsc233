import java.util.Scanner;
public class Euclidean {
	public static void main(String[] args){
		int start;
		int divisor;

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the starting value: ");
		start = input.nextInt();
		System.out.println("Enter the divisor: ");
		divisor = input.nextInt();
		System.out.println("number" + "\t " + "divisor" + "\t" + "remainder");
		System.out.println(start + "\t" + divisor);
		
		for(int i=0;divisor>0;i++){
			int remainder;
			remainder = start%divisor;
			start = start/divisor;
			divisor = remainder;
			System.out.println(start + "\t" + divisor + "\t" + remainder);
		}
		
	}
}
