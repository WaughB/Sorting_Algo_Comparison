
/*
 * Brett Waugh
 * 3 December 2019
 * getTime.java
 * This program returns the time of the
 * system clock. This is used for determining
 * how long each algorithm took to run. 
 */

import java.time.*;

public class getTime {

	public static int time() {

		Clock time = Clock.systemDefaultZone();

		int start = (int) time.millis();

		// Returns the time in milliseconds. May need to convert later on.
		return start;
	}

}
