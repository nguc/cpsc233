import java.util.Scanner;

public class character_stats {
	public static void main(String[]args){
		//Initializing variables
		int skillPoints = 10;
		int pointsEnter;
		Scanner input = new Scanner(System.in);
		// make  objects of each stat from class stats
		stats char1;
		String chooseStat, name;
		
		//Create new character with inputted name
		System.out.println("Enter the name of your character: ");
		name = input.nextLine();
		char1 = new stats(name);
		
		//Checks which stat user chose and keeps it running until skill points are used up
		while (skillPoints > 0){
		//Prompt user for stat to enter points into
			//Look into why the loop skips the user input step when it loops again the first time
		System.out.println("Skill points remaining: " + skillPoints );
		System.out.println("Where would you like to add them? S, E, I, L?");
		chooseStat = input.nextLine();
			
		if (chooseStat.equals("S") || chooseStat.equals("s")){
			System.out.println("How many points do you want to add?");	
			pointsEnter = input.nextInt();
				//Checks if there enough points to allocate then adds if there is
				if (skillPoints - pointsEnter >= 0){
					char1.enterStr(pointsEnter);
					skillPoints -= pointsEnter; 
				}
				else{
					System.out.println("You dont have enough points");
					pointsEnter = input.nextInt();
				}	
		}
		else if (chooseStat.equals("E") || chooseStat.equals("e")){
			System.out.println("How many points do you want to add?");	
			pointsEnter = input.nextInt();
				if (skillPoints - pointsEnter >= 0){
					char1.enterEnd(pointsEnter);
					skillPoints -= pointsEnter; 
				}
				else{
					System.out.println("You dont have enough points");
					pointsEnter = input.nextInt();
				}	
		}
		else if (chooseStat.equals("I") || chooseStat.equals("i")){
			System.out.println("How many points do you want to add?");	
			pointsEnter = input.nextInt();
				if (skillPoints - pointsEnter >= 0){
					char1.enterInt(pointsEnter);
					skillPoints -= pointsEnter; 
				}
				else{
					System.out.println("You dont have enough points");
					pointsEnter = input.nextInt();
				}	
		}
		else if (chooseStat.equals("L") || chooseStat.equals("l")){
			System.out.println("How many points do you want to add?");	
			pointsEnter = input.nextInt();
				if (skillPoints - pointsEnter >= 0){
					char1.enterLck(pointsEnter);
					skillPoints -= pointsEnter; 
				}
				else{
					System.out.println("You dont have enough points");
					pointsEnter = input.nextInt();
				}	
		}
		/*else{
			System.out.println("Please choose a stat to enter skill points");
			chooseStat = input.nextLine();
		}*/
		}
		input.close();
		System.out.println("");
		char1.displayStats();
	}

}
