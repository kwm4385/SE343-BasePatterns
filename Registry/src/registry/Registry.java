/**
 * 
 */
package registry;

import regsitry.Cat;

/**
 * @author jak3122
 *
 */
public class Registry {
	
	/**
	 * Use a singleton and make the instance methods private;
	 * invoke them from public static methods
	 */
	private static Registry regInstance = new Registry();
	
	/**
	 * The first finder in the registry.
	 * The CatFinder contains methods to finds cats
	 * in a database, e.g. catFinder.get(id)
	 */
	private CatFinder catFinder = new CatFinder();
	
	/**
	 * The key idea of a registry: use a public static method
	 * to find the object you need, in this case a CatFinder object.
	 * @return the registry's CatFinder
	 */
	public static CatFinder catFinder() {
		return regInstance.catFinder;
	}
	
	/**
	 * To make a new registry, invoke init() which
	 * just creates a new instance of Registry in regInstance
	 */
	public static void init() {
		regInstance = new Registry();
	}
	
	public static void main(String[] args) {
		// Initialize the registry
		Registry.init();
		// Get the CatFinder
		CatFinder myCatFinder = Registry.catFinder();
		// Use the CatFinder
		Cat c0 = myCatFinder.get(0);
		System.out.println("Obtained cat " + c0.getId() + " named " + c0.getName() +
				" owned by " + c0.getOwner() + ".");
	}

}
