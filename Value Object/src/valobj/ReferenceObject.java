package valobj;

public class ReferenceObject {

	// This class has the same fields as ValueObject, but uses the default
	// equals() method from the Object class, which only returns
	// true if the two objects have the same reference, so
	// any two separate physical objects are not equal. 
	public int day;
	public int month;
	public int year;
	
	public ReferenceObject(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	

}
