package baseball_code;

import java.util.Scanner;

public class BaseballCalc {
	public static void main(String[] args) {
		
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Player Name: ");
		name = input.nextLine();
		
		System.out.print("How many hits? ");
		int hits = input.nextInt();
		
		System.out.print("How many at bats? ");
		int bats = input.nextInt();
		
		System.out.print("How many walks? ");
		int walks = input.nextInt();
		
		System.out.print("How many hit by pitchs? ");
		int hbps = input.nextInt();
		
		System.out.print("How many sac flys? ");
		int sf = input.nextInt();
		
		System.out.print("How many doubles? ");
		int doub = input.nextInt();
		
		System.out.print("How many triples? ");
		int trip = input.nextInt();
		
		System.out.print("How many homeruns? ");
		int hr = input.nextInt();
		
		BaseballStats BS = new BaseballStats(hits, bats, walks, hbps, sf, doub, trip, hr);
		
		System.out.println(name);
		
		System.out.println("Batting Average: "+BS.BattingAverage());
		
		System.out.println("Slugging Percentage: "+BS.SLG());
		
		System.out.println("On Base Percentage: "+BS.OBP());
		
		System.out.println("On Base Slugging: "+BS.OBS());
		
		System.out.println("Total Bases: "+BS.TB());
		
		input.close();
	}
}
