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
		this.keeper = new Keeper();
		this.aanvaller = new Aanvaller();
		this.verdediger = new Verdediger();
	}
	void introduceren() {
		System.out.println(this.naam + " en mijn \nkeeper heet: "+keeper.naam);
		System.out.println(" en mijn \naanvaller heet: "+aanvaller.naam);
		System.out.println(" en mijn \nverdediger heet: "+verdediger.naam);
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
abstract class Speler{
	String naam;
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

















