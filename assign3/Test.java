import java.util.Scanner;
import java.util.ArrayList;

	/**
	A text menu that allows the user to choose which actions they would like to perform. This program is not coded to take into account of errors in entering a value that is out of range. Doing so will result in the program crashing. Created objects will be stored in an ArrayList which results in more than 10 objects being allowed to be created.

	@author Chi Nguyen
	*/

public class Test {
	public static void main(String[] args){
		//initializing Scanner, ArrayList and variables 
		Scanner input = new Scanner(System.in);
		ArrayList<Shape> objectArray = new ArrayList<Shape>();
		int action, choice, position;
		boolean quit = false;

		do{
			//The text menu
			System.out.println("\n--- Actions ---");
			System.out.println("Select an option: \n" +
				"1) Create circle\n" +
				"2) Create rectangle\n" +
				"3) Change origin\n" +
				"4) Set dimensions\n" +
				"5) Display current state of object\n" +
				"6) Move object\n" +
				"7) Calculate distance between two objects\n" +
				"8) Delete object\n" +
				"9) Display current object array \n" +
				"0) Quit\n");

			action = input.nextInt();
			//input.nextLine();

			switch(action){
				//Creates a circle, giving the user the choice to make a circle with default values of all zeros or to enter their own values.
				case 1: 
					System.out.println("Create default (1) or manual input? (2)");
					choice = input.nextInt();
					if(choice == 1){
						Shape circle = new Circle();
						objectArray.add(circle);
					}
					else{
						int r,x,y;
						System.out.println("Enter a value for the radius: ");
						r = input.nextInt();
						System.out.println("Enter the x coordinate of the origin: ");
						x = input.nextInt();
						System.out.println("Enter the y coordinate of the origin: ");
						y = input.nextInt();
						Shape circle = new Circle(r,x,y);
						objectArray.add(circle);
					}
					break;
				//Creates a Rectangle, giving the user the choice to make a circle with default values of all zeros or to enter their own values
				case 2:
					System.out.println("Create default (1) or manual input? (2)");
					choice = input.nextInt();
					if(choice == 1){
						Rectangle rectangle = new Rectangle();
						objectArray.add(rectangle);
					}
					else{
						int l,w,x,y;
						System.out.println("Enter a value for the length: ");
						l = input.nextInt();
						System.out.println("Enter a value for the width: ");
						w = input.nextInt();
						System.out.println("Enter the x coordinate of the origin: ");
						x = input.nextInt();
						System.out.println("Enter the y coordinate of the origin: ");
						y = input.nextInt();
						Rectangle rectangle = new Rectangle(l,w,x,y);
						objectArray.add(rectangle);
					}
					break;
				//Lets the user choose an object from the ArrayList and change the values of its' origin
				case 3:
					System.out.println("Which shape do you want to change? (Enter index value): ");
					position = input.nextInt();
					System.out.println("Enter the x value of the origin: ");
					int x = input.nextInt();
					System.out.println("Enter the y value of the origin: ");
					int y = input.nextInt();
					objectArray.get(position).setOrigin(x,y);
					break;
				//Lets the user choose an object from the ArrayList and change its' dimentsions. For a circle they can change the radius. For a rectangle they can change the length, width or both. 
				case 4:
					System.out.println("Which shape do you want to change? (Enter index value):");
					position = input.nextInt();
					if(objectArray.get(position) instanceof Circle){
						System.out.println("Enter new value for the radius: ");
						int r = input.nextInt();
						Circle circle = (Circle)objectArray.get(position);
						circle.setRadius(r);
					}
					else if (objectArray.get(position) instanceof Rectangle){
						System.out.println("Do you want to set the length (1), width (2) or both (3)? ");
						choice = input.nextInt();
						if(choice == 1){
							System.out.println("Enter the new length:");
							int l = input.nextInt();
							Rectangle rectangle = (Rectangle) objectArray.get(position);
							rectangle.setLength(l);						
						}
						else if(choice == 2){
							System.out.println("Enter the new width: ");
							int w = input.nextInt();
							Rectangle rectangle = (Rectangle) objectArray.get(position);
							rectangle.setWidth(w);
						}
						else{
							System.out.println("Enter the new length:");
							int l = input.nextInt();
							System.out.println("Enter the new width: ");
							int w = input.nextInt();
							Rectangle rectangle = (Rectangle) objectArray.get(position);
							rectangle.setLengthAndWidth(l,w);
						}
					}
						break;
				//Lets the user choose an object from the ArrayList and display its' information. For a circle the origin, radius, area and circumference will be displayed. For a rectangle the origin, length, width, area and circumference will be displayed.
				case 5:
					int radius, length, width;
					double area, circumference;
					System.out.println("Which object do you want to check? (Enter index value):");
					position = input.nextInt();
					if(objectArray.get(position) instanceof Circle){
						Circle circle = (Circle) objectArray.get(position);
						area = circle.area();
						circumference = circle.circumference();
						radius = circle.getRadius();
						System.out.println("\nCircle[" + position +"]\n---------\nOrigin: " + objectArray.get(position).getOrigin() + "\nRadius: " + radius +"\nArea: " + area + "\nCircumference: " + circumference);
					}
					else if(objectArray.get(position) instanceof Rectangle){
						Rectangle rectangle = (Rectangle) objectArray.get(position);
						area = rectangle.area();
						circumference = rectangle.circumference();
						length = rectangle.getLength();
						width = rectangle.getWidth();
						System.out.println("\nRectangle[" + position + "]\n------------\nOrigin: " + objectArray.get(position).getOrigin() + "\nLength: " + length + "\nWidth: " + width + "\nArea: " + area + "\nCircumference: " + circumference);
					}
					
					break;
				//Lets the user change the position of a shapes origin by the values entered in for deltaX and deltaY
				case 6:
					int deltaX, deltaY;
					System.out.println("Which object do you want to move? (Enter index value): ");
					position = input.nextInt();
					System.out.println("Enter the delta x coordinate: ");
					deltaX = input.nextInt();
					System.out.println("Enter the delta y coordinate: ");
					deltaY = input.nextInt();
					objectArray.get(position).move(deltaX,deltaY);
					break;
				//Lets the user choose two objects from the ArrayList and calculate the distance between their origins
				case 7:
					System.out.println("Calculate the distance between object (Enter index value): ");
					position = input.nextInt();
					System.out.println("and object (Enter index value): ");
					int position2 = input.nextInt();
					Shape s1 = objectArray.get(position);
					Shape s2 = objectArray.get(position2);
					double d = s1.getOrigin().distance(s2.getOrigin());
					System.out.println(d);
					break;
				//Lets the user delete an obejct from the ArrayList
				case 8: 
					System.out.println("Which object do you want to delete? (Enter index value):");
					position = input.nextInt();
					objectArray.remove(position);
					break;
				//Display all objects in the ArrayList
				case 9:
					
					int i = 0;
					for(Shape element:objectArray){
						System.out.println("[" + i + "] " + element );
						i++;
					}
					System.out.println();
					break;
				//Quits the program
				case 0:
					quit = true;
					break;
			}
		}
		while (!quit);

		//Goodbye message upon quitting the program
		System.out.println("Bye!");
	}
}