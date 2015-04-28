package registry;

public class Cat {

	private int id;
	private String name;
	private String owner_name;
	
	public Cat(int id, String name, String owner_name) {
		this.id = id;
		this.name = name;
		this.owner_name = owner_name;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getOwner() {
		return this.owner_name;
	}
}
