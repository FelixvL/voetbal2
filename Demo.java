package voetbal2;
import java.util.Scanner;
class Demo{
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Hoi van de voorste rij");
	   
	   Team team1 = new Team(sc.nextLine());
	   team1.keeperNaamGeven(sc.nextLine());
	   
	   team1.introduceren();
   }
}
class Team{
	String naam = "ajax";
	Speler keeper = new Speler();
	Speler verdediger = new Speler();
	Speler aanvaller = new Speler();
	Team( String a ){
		this.naam = a;
	}
	void introduceren() {
		System.out.println(this.naam + " en mijn \nkeeper heet: "+keeper.naam);
	}
	void keeperNaamGeven(String naam) {
		this.keeper.naam = naam;
	}
}
class Speler{
	String naam = "onana";
	
}
