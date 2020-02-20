package voetbal2;
import java.util.Scanner;
class Demo{
   public static void main(String[] args) {
	   Team a = new Team();
	   a.introduceren();
   }
}
class Team{
	String naam;
	Speler keeper;
	Speler verdediger;
	Speler aanvaller;
	Team( ){
		this.vraagTeamNaam();
		this.keeper = new Speler();
	}
	void introduceren() {
		System.out.println(this.naam + " en mijn \nkeeper heet: "+keeper.naam);
	}
	void keeperNaamGeven(String naam) {
		this.keeper.naam = naam;
	}
	void vraagTeamNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Team?");
		naam = sc.nextLine();
	}
}
class Speler{
	String naam;
	Speler(){
		this.vraagSpelerNaam();
	}
	void vraagSpelerNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Keeper?");
		naam = sc.nextLine();
	}
}
