package layersupertype;

import sun.jvm.hotspot.utilities.Assert;

/**
 * Person.java
 * <p>
 * <p>
 * <p>
 * Created by geoffberl on 4/28/15.
 */
public class DomainObject {

	private Integer ID;

	public DomainObject(Integer ID) {
		this.ID = ID;
	}

	public DomainObject() {
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		Assert.that(ID != null, "ID cannot be null");
		this.ID = ID;
	}
}
