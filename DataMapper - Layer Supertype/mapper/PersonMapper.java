package mapper;

import layersupertype.DomainObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * PersonMapper.java
 * <p>
 * <p>
 * <p>
 * Created by geoffberl on 4/28/15.
 */
public class PersonMapper extends AbstractMapper {

	public static final String COLUMNS = " id, lastname, firstname, number_of_dependents ";
	private int lastID = 0;

	public Person find(Integer id) {
		return (Person) abstractFind(id);
	}

	public Person find(int id) {
		return find(new Integer(id));
	}

	protected DomainObject createDomainObject() {
		return new Person();
	}

	/**
	 * Insert data into the database.
	 * @param obj The data to enter in the database
	 */
	public void insert(DomainObject obj) {
		if (loadedMap == null) {
			loadedMap = new HashMap<>();
		}
		// Check if this obj already has an ID (if so, skip insertion)
		if (obj.getID() == 0) {
			loadedMap.put(++lastID, obj);
			obj.setID(lastID);
		}
	}

	public void update(DomainObject obj) {
		if (loadedMap == null) {
			return;
		}
		// If the object is in the DB, update it
		if (loadedMap.containsKey(obj.getID()) ) {
			loadedMap.remove(obj.getID());
			loadedMap.put(obj.getID(), obj);
		}
	}

	public void delete(DomainObject obj) {
		if (loadedMap == null) {
			return;
		}
		loadedMap.remove(obj.getID());
	}

	@Override
	protected String findStatement() {
		return "SELECT " + COLUMNS + " FROM people WHERE id=?";
	}

	protected DomainObject doLoad(Integer id, ResultSet rs) throws SQLException {
		String lastNameArg = rs.getString(2);
		String firstNameArg = rs.getString(2);
		int numDependentsArg = rs.getInt(2);
		return new Person(id, lastNameArg, firstNameArg, numDependentsArg);
	}
}
