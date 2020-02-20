package voetbal2;
import java.util.Scanner;
class Demo{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Wat is de naam van het team?");
		Team team1 = new Team(sc.nextLine());

		team1.introduceren();
	}


}
class Team{
	Scanner sc = new Scanner(System.in);
	String naam = "ajax";
	Speler keeper = new Speler();
	Speler verdediger = new Speler();
	Speler aanvaller = new Speler();
	Team( String a ){
		this.naam = a;
		System.out.println("Wat is de naam van de keeper?");
		String keeperNaam = sc.nextLine();
		this.keeper.naam = keeperNaam;
	}
	void introduceren() {
		System.out.println(this.naam + " en mijn keeper heet: "+keeper.naam);
	}
	void keeperNaamGeven(String naam) {
		this.keeper.naam = naam;
	}
}
class Speler{
	String naam = "onana";

}
