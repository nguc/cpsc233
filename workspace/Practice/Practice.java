import java.util.Random;

public class Practice {
	public static void main(String[] args){
		int firstArray[][]={{8,9,10,11},{12,13,14,15}};
		int secondArray[][]={{30,31,32,33},{46},{3,4,5}};
		
		System.out.println("this is the first array");
		display(firstArray);
		System.out.println("This is the second array");
		display(secondArray);
	}
	public static void display(int x[][]){
		for(int row=0; row<x.length; row++){
			for(int col=0; col<x[row].length;col++){
				System.out.print(x[row][col] + "\t");
			}
			System.out.println();
			
			
		}
	}
}
