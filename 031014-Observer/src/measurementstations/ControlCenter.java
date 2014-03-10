package measurementstations;

import java.util.Observable;
import java.util.Observer;

public class ControlCenter implements Observer {

	@Override
	public void update(Observable o, Object arg){
		Station notifier = (Station) o;
		System.out.println("Notification: Critical Sealevel in " + notifier.getGeoLocation() + " level [m] " + notifier.getSeaLevelInMeter());
	}
}
