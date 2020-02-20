import java.util.Scanner;

class VoetbalDemo{
   public static void main(String[] args) {
	   	   
	   Team team1 = new Team();
	   Team team2 = new Team();
	   
	   team1.introduceren();
	   team2.introduceren();
	   
	   System.out.println(team1.keeper.naam);
   }
}
class Team{
	Scanner sc = new Scanner(System.in);
	String naam;
	Speler keeper = new Speler();
	Speler verdediger = new Speler();
	Speler aanvaller = new Speler();
	Team(){
		System.out.print("Wat is je teamnaam?: ");
		this.naam = sc.nextLine();
		System.out.println("Wat is de naam van je keeper?: ");
		this.keeper.naam = sc.nextLine();
	}
	void introduceren() {
		System.out.println("Je teamnaam is " + this.naam + " en " + this.keeper.naam + " is je keeper.");
	}
	void keeperNaamGeven(String naam) {
		this.keeper.naam = naam;
	}
}
class Speler{
	String naam;
	
}
