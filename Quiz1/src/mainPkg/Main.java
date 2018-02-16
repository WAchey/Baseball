package mainPkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter player name:");
		String Name = input.nextLine();
		System.out.println("Enter their At Bats:");
		int AtBats = input.nextInt();
		System.out.println("Enter their Hits:");
		int Hits = input.nextInt();
		System.out.println("Enter their Doubles:");
		int Doubles = input.nextInt();
		System.out.println("Enter their Triples:");
		int Triples = input.nextInt();
		System.out.println("Enter their Homeruns:");
		int Homeruns = input.nextInt();
		System.out.println("Enter their Runs:");
		int Runs = input.nextInt();
		System.out.println("Enter their Walks:");
		int Walks = input.nextInt();

		input.close();
		
		BaseballPlayer p1 = new BaseballPlayer(Name, AtBats, Hits, Doubles, Triples,
				Homeruns, Runs, Walks);
		
		System.out.println("BA = " + p1.getBattingAvg() +
				"\nOBP = " + p1.getOnBasePercent() + 
				"\nSLG = " + p1.getSluggingPercent() +
				"\nOBS = " + p1.getOnBasePlusSlugging() +
				"\nTB = " + p1.getTotalBases());

	}

}
