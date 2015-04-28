package registry;

import java.util.ArrayList;

import regsitry.Cat;

public class CatFinder {

	/**
	 * Our mock object database
	 */
	private ArrayList<Cat> cats = new ArrayList<Cat>();
	public CatFinder() {
		cats.add(new Cat(0, "Mittens", "Joe"));
		cats.add(new Cat(1, "Bob", "Jerry"));
	}
	public Cat get(int id) {
		return cats.get(id);
	}
	public Cat getByName(String name) {
		for (Cat c : cats) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}
}
