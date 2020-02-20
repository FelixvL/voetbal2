
import java.util.Scanner;
class VoetbalDemo{
   public static void main(String[] args) {
	   Team a = new Team();
	   Team b = new Team();
	   System.out.print("Team 1 ");
	   a.introduceren();
	   System.out.print("Team 2 ");
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
		System.out.println("Wat is de naam van je keeper? ");
		this.keeper = new Speler();
		System.out.println("Wat is de naam van je verdediger? ");
		this.verdediger = new Speler();
		System.out.println("Wat is de naam van je aanvaller? ");
		this.aanvaller = new Speler();
	}
	void introduceren() {
		System.out.println("Je teamnaam is " + this.naam + ", mijn keeper heet: "+keeper.naam + ", mijn verdediger heet: " +  verdediger.naam + " , mijn aanvaller heet: " + aanvaller.naam);
	}
	void keeperNaamGeven(String naam) {
		this.keeper.naam = naam;
	}
	void vraagTeamNaam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wat is je teamnaam?");
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
		this.naam = sc.nextLine();
	}
}
