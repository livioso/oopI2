package measurementstations;

import java.util.Observable;
import java.util.Random;

public class Station extends Observable {
	
	int mSealevelInMeter = 10;
	final static int CRITICALSEALEVELINMETER = 11;
	
	public void nextMeasurement() {
		// the equipment to really measure the
		// sea level is not yet available... :P
		Random rng  = new Random();
		mSealevelInMeter = rng.nextInt(5) + 7;
		
		// we reached a critical sea level
		if(mSealevelInMeter >= CRITICALSEALEVELINMETER) {
			setChanged();
			notifyObservers();
		}
	}
	
	public int getSeaLevelInMeter () {
		return mSealevelInMeter;
	}
}
