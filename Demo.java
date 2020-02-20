package voetbal2;
import java.util.Scanner;
class Demo{
   public static void main(String[] args) {
	   Team team1 = new Team();

	   team1.introduceren();
   }
}
class Team {
	String naam;
	Speler keeper;

	Team(){
		this.vraagTeamNaam();
		this.keeper = new Speler();
	}

	void introduceren() {
		System.out.println(this.naam + " en mijn \nkeeper heet: "+keeper.naam);
	}

	void vraagTeamNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.print("TeamNaam? ");
		this.naam = sc.nextLine();
	}
}
class Speler{
	String naam;

	Speler(){
		this.vraagSpelernaam();
	}

	void vraagSpelernaam() {
		Scanner sc = new Scanner(System.in);
		System.out.print("keeper: ");
		this.naam = sc.nextLine();
	}
	
}
