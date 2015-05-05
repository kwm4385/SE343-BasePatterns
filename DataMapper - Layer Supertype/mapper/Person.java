package mapper;

import layersupertype.DomainObject;

/**
 * Person.java
 * <p>
 * <p>
 * <p>
 * Created by geoffberl on 4/28/15.
 */
public class Person extends DomainObject {

	private String lastName;
	private String firstName;
	private int numberOfDependents;

	public Person(String lastName, String firstName, int numberOfDependents) {
		this(0, lastName, firstName, numberOfDependents);
	}

	public Person() {
		this(0, null, null, 0);
	}

	public Person(Integer id, String lastNameArg, String firstNameArg, int numDependentsArg) {
		super(id);
		this.lastName = lastNameArg;
		this.firstName = firstNameArg;
		this.numberOfDependents = numDependentsArg;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(int numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person{" +
				"lastName='" + lastName + '\'' +
				", firstName='" + firstName + '\'' +
				", numberOfDependents=" + numberOfDependents +
				'}';
	}
}
