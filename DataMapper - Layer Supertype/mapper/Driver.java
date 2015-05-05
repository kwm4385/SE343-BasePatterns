package mapper;

import mapper.PersonMapper;

/**
 * Created by geoffberl on 5/4/15.
 */
public class Driver {

	public static final int NUM_PEEPS = 10;

	public static void main(String[] args) {

		PersonMapper mapper = new PersonMapper();

		System.out.println("***************** Initial  *********************");
		print(mapper);

		// ************* INSERT ***********************
		System.out.println("\n***************** INSERT *********************");
		// Insert a bunch of people with the same name and stuff
		for (int i = 0; i < NUM_PEEPS; i++) {
			mapper.insert(new Person(0, "Berl", "Geoff", 2));
		}

		// Print the data for show
		print(mapper);

		// ************* UPDATE ***********************
		System.out.println("\n***************** UPDATE *********************");
		// Get one of those people
		Person p = mapper.find(4);
		// Edit their name
		p.setFirstName("John");
		p.setLastName(("Smith"));

		// Update them in the database
		mapper.update(p);

		// Print now with the new updated data
		print(mapper);

		// ************* DELETE ***********************
		System.out.println("\n***************** DELETE *********************");
		// Now Delete someone
		mapper.delete(mapper.find(8));

		// Print one last time for show
		print(mapper);

	}

	private static void print(PersonMapper mapper) {
		for (int i = 1; i <= NUM_PEEPS; i++) {
			System.out.println("Person " + i + ": " + mapper.find(i));
		}
	}

}
