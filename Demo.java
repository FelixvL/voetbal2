package voetbal2;
import java.util.Random;
import java.util.Scanner;
class Demo{
   public static void main(String[] args) {
	   CompetitieGenerator cg = new CompetitieGenerator();
	   String[] speNamen= {"Jan", "Kees"};
	   Team temp = cg.genereerTeam("Heracles", speNamen);
	   temp.introduceren();
	   System.out.println("einde");
	   
   }
}

class CompetitieGenerator{
	Random r = new Random();
	Team genereerTeam(String teamNaam, String[] spelernamen){
		Team team = new Team(teamNaam);
		Speler[] spelers = new Speler[spelernamen.length];
		for(int a = 0; a < spelernamen.length; a++) {
			Speler speler = new Speler();
			speler.naam = spelernamen[a];
			speler.stat = r.nextInt(10)+6;
			spelers[a]= speler;
			System.out.println("check"+speler.naam + ""+speler.stat);
		}
		team.spelers = spelers;
		return team;
	}
	void initieer() {
		
	}
}



class Team{
	String naam;
	Speler[] spelers ;
	Team(String teamNaam){
		naam = teamNaam;
	}
	void introduceren() {
		System.out.println("Wij zijn" + naam);
		for(int x = 0 ;x < spelers.length; x++ ) {
			System.out.println("go");
		}
	}
	void keeperNaamGeven(String naam) {
//		this.keeper.naam = naam;
	}
	void vraagTeamNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Team?");
		naam = sc.nextLine();
	}
}
class Speler{
	String naam;
	int stat;
	Speler(){
		
	}
	

}
class Keeper extends Speler{
	Keeper(){
		this.vraagSpelerNaam();
	}
	void vraagSpelerNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Keeper?");
		naam = sc.nextLine();
	}
}
class Aanvaller extends Speler{
	Aanvaller(){
		this.vraagSpelerNaam();
	}
	void vraagSpelerNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Aanvaller?");
		naam = sc.nextLine();
	}	
}
class Verdediger extends Speler{
	Verdediger(){
		this.vraagSpelerNaam();
	}
	void vraagSpelerNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Verdediger?");
		naam = sc.nextLine();
	}
}

















