package voetbal2;

class Demo{
   public static void main(String[] args) {
	   Team team1 = new Team("Ajax");
	   Team team2 = new Team("Feyenoord");
	   System.out.println("hoi");
	   team1.keeperNaamGeven("Menzo");
	   
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
