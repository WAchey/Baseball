package mainPkg;


public class BaseballPlayer {
	
	private String Name;
	private int AtBats, Hits, Singles, Doubles, Triples, Homeruns, Runs, Walks;
	
	
	public BaseballPlayer(String name, int atBats, int hits, int doubles, int triples, int homeruns, int runs,
			int walks) {
		super();
		Name = name;
		AtBats = atBats;
		Hits = hits;
		Doubles = doubles;
		Triples = triples;
		Homeruns = homeruns;
		Runs = runs;
		Walks = walks;
		Singles = runs - (doubles + triples + homeruns);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAtBats() {
		return AtBats;
	}

	public void setAtBats(int atBats) {
		AtBats = atBats;
	}

	public int getHits() {
		return Hits;
	}

	public void setHits(int hits) {
		Hits = hits;
	}

	public int getSingles() {
		return Singles;
	}

	public void setSingles(int singles) {
		Singles = singles;
	}

	public int getDoubles() {
		return Doubles;
	}

	public void setDoubles(int doubles) {
		Doubles = doubles;
	}

	public int getTriples() {
		return Triples;
	}

	public void setTriples(int triples) {
		Triples = triples;
	}

	public int getHomeruns() {
		return Homeruns;
	}

	public void setHomeruns(int homeruns) {
		Homeruns = homeruns;
	}

	public int getRuns() {
		return Runs;
	}

	public void setRuns(int runs) {
		Runs = runs;
	}

	public int getWalks() {
		return Walks;
	}

	public void setWalks(int walks) {
		Walks = walks;
	}

	public double getBattingAvg() {
		return (double) Hits/AtBats;
		}
	
	public double getOnBasePercent() {
		return (double) (Hits + Walks)/(AtBats + Walks);
	}
	
	public double getSluggingPercent() {
		return (double) this.getTotalBases() / AtBats;
	}
	
	public double getOnBasePlusSlugging() {
		return (double) this.getOnBasePercent() + this.getSluggingPercent();
	}
	
	public int getTotalBases() {
		return Singles + 2 * Doubles + 3 * Triples + 4 * Homeruns;
	}
	
}
