package mapper;

import layersupertype.DomainObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * AbstractMapper.java
 * <p>
 * <p>
 * <p>
 * Created by geoffberl on 4/28/15.
 */
abstract class AbstractMapper {

	protected Map<Integer, DomainObject> loadedMap = new HashMap<>();

	abstract protected String findStatement();

	protected DomainObject abstractFind(Integer id) {
		DomainObject result = loadedMap.get(id);
		if (result != null) {
			return result;
		}
		return null;

//		// Get the junk from the DB
//		return new Person("mapper.Person", "Database", 92);

	}

	protected DomainObject load(ResultSet rs) throws SQLException {
		Integer id = rs.getInt(1);
		if (loadedMap.containsKey(id)) {
			return loadedMap.get(id);
		}
		DomainObject result = doLoad(id, rs);
		loadedMap.put(id, result);
		return result;
	}

	abstract protected DomainObject doLoad(Integer id, ResultSet rs) throws SQLException;

	abstract protected void insert(DomainObject obj);

	abstract protected void update(DomainObject obj);

	abstract protected void delete(DomainObject obj);

}
