import java.util.*;
public class baseball {
	public static double battingAverage(double hits, double abs) {
		return (hits/abs);
	}
	public static double onBasePercentage(double hits, double walks, double abs) {	
		return((hits+walks)/(abs+walks));
	}
	public static double totalBases(double hits, double doubles, double triples, double homeRuns) {
		return hits + doubles + 2*triples + 3*homeRuns;
	}
	public static double sluggingPercentage(double hits, double doubles, double triples, double homeRuns, double abs) {
		double totals = totalBases(hits, doubles, triples, homeRuns);
		return totals/abs;
	}
	public static double ops(double hits, double doubles, double triples, double homeRuns,double abs, double walks) {
		return(sluggingPercentage(hits,doubles,triples,homeRuns,abs)+onBasePercentage(hits,walks,abs));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		double hits;
		double abs;
		double doubles;
		double triples;
		double homeRuns;
		double runs;
		double walks;
		System.out.println("Player Name: ");
		name = sc.nextLine();
		System.out.println("Hits: ");
		hits = sc.nextInt();
		System.out.println("At-Bats: ");
		abs = sc.nextInt();
		System.out.println("Doubles: ");
		doubles = sc.nextInt();
		System.out.println("Triples: ");
		triples = sc.nextInt();
		System.out.println("Home Runs: ");
		homeRuns = sc.nextInt();
		System.out.println("Runs: ");
		runs = sc.nextInt();
		System.out.println("Walks: ");
		walks = sc.nextInt();
		System.out.println(name);
		System.out.println("Batting Average: " + battingAverage(hits, abs));
		System.out.println("On Base Percentage: "+ onBasePercentage(hits, walks, abs));
		System.out.println("Total Bases: "+ totalBases(hits, doubles, triples, homeRuns));
		System.out.println("Slugging Percentage: " + sluggingPercentage(hits, doubles, triples, homeRuns, abs));
		System.out.println("OPS: " + ops(hits, doubles, triples, homeRuns, abs,walks));
	}


}