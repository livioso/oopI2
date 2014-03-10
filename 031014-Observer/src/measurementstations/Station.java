package measurementstations;

import java.util.Observable;
import java.util.Random;

public class Station extends Observable {
	
	final static int CRITICALSEALEVELINMETER = 11;
	
	String mGeoLocation = "undefined";
	int mSealevelInMeter = 10;
	
	public Station(String GeoLocation) {
		this.mGeoLocation = GeoLocation;
	}
	
	public String getGeoLocation() {
		return mGeoLocation;
	}
	
	public int getSeaLevelInMeter() {
		return mSealevelInMeter;
	}
	
	public void nextMeasurement() {
		// the equipment to really measure the
		// sea level is not yet available... :P
		Random rng  = new Random();
		mSealevelInMeter = rng.nextInt(5) + 7;
		
		// we reached a critical sea level
		// notify observers about that!
		if(mSealevelInMeter >= CRITICALSEALEVELINMETER) {
			setChanged();
			notifyObservers(mSealevelInMeter);
		}
	}
}
