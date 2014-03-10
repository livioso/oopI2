package measurementstations;

public class Network {
	private static Station SouthEastAsiaStation = new Station("SEA <<>> 13°56'N 121°37'E");
	private static Station NorthEastAsiaStation = new Station("NEA <<>> 35°7'N 136°34'E");
	
	public static void main(String [] args) throws InterruptedException {
		ControlCenter AsianPacificCC = new ControlCenter();
		
		SouthEastAsiaStation.addObserver(AsianPacificCC);
		NorthEastAsiaStation.addObserver(AsianPacificCC);
		
		for(int i = 0; i < 100; i++) {
			SouthEastAsiaStation.nextMeasurement();
			NorthEastAsiaStation.nextMeasurement();
			Thread.sleep(1000);
		}
	}
}
