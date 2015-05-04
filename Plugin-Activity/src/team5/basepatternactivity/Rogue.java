package team5.basepatternactivity;

import team5.basepatternactivity.Plugin;

/**
 * Rogue plugin which is not granted any permissions and will thus throw a
 * {@link SecurityException} when its {@link #run()} method is called.
 */
public class Rogue implements Plugin {

	public void run() {
		System.out.println(getClass().getName() + ": user.home: " + System.getProperty("user.home"));
	}

}
