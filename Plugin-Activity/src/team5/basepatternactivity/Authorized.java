package team5.basepatternactivity;

import team5.basepatternactivity.Plugin;

public class Authorized implements Plugin {

	public void run() {
		System.out.println(getClass().getName() + ": user.home: " + System.getProperty("user.home"));
	}

}
