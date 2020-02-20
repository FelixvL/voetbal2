package voetbal2;
import java.util.Scanner;
class Demo{
   public static void main(String[] args) {
	   Team a = new Team();
	   Team b = new Team();

	   a.introduceren();
	   b.introduceren();
   }
}
class Team{
	String naam;
	Speler keeper;
	Speler verdediger;
	Speler aanvaller;

	Team( ){
		this.vraagTeamNaam();
		this.keeper = new Speler("keeper");
		this.verdediger = new Speler("verdediger");
		this.aanvaller = new Speler("aanvaller");
	}

	void introduceren() {
		System.out.println(this.naam + " en mijn \nkeeper heet: "+keeper.naam);
	}

	void vraagTeamNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Team?");
		naam = sc.nextLine();
	}
}
class Speler {
	String naam;
	String rol;

	Speler(String rol){
		this.rol = rol;
		this.vraagSpelerNaam();
	}

	void vraagSpelerNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Naam (" + this.rol + "): ");
		naam = sc.nextLine();
	}

}
