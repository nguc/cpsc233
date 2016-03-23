
public class stats {
	
	//Declared variables
	public String charName;
	public int strength=1 ,endurance=1, intelligence=1, luck=1;
	
	//Constructor method
	public stats(String name){
		charName = name;
	}
	
	//Methods to add points to each stat
	public void enterStr(int skillPoints){
		strength += skillPoints;
	}
	public int strLvl(){
		return strength;
	}
		
	public void enterEnd(int skillPoints){
		endurance += skillPoints;
	}
	public int endLvl(){
		return endurance;
	}
	
	public void enterInt(int skillPoints){
		intelligence += skillPoints;
	}
	public int intLvl(){
		return intelligence;
	}
	
	public void enterLck(int skillPoints){
		luck += skillPoints;	
	}
	public int lckLvl(){
		return luck;
	}

	public void displayStats(){
		System.out.println(charName);
		System.out.println("Character stats:");
		System.out.println("Strength\t" + strLvl());
		System.out.println("Endurance\t" + endLvl());
		System.out.println("Intelligence\t" + intLvl());
		System.out.println("Luck\t\t" + lckLvl());
	}

}
