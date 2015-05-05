package valobj;

public class ValueObject {
	
	// The fields that determine the Value Object's uniqueness
	public int day;
	public int month;
	public int year;
	
	public ValueObject(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	
	@Override
	public boolean equals(Object o) {
		ValueObject vo = (ValueObject) o;
		// A Value Object is equal to another if its
		// fields are the same. 
		return (vo.day == this.day) &&
				(vo.month == this.month) &&
				(vo.year == this.year);
		
	}

	public static void main(String[] args) {
		int d = 12;
		int m = 11;
		int y = 1994;
		ValueObject vo1 = new ValueObject(12,11,1994);
		ValueObject vo2 = new ValueObject(12,11,1994);
		ReferenceObject ro1 = new ReferenceObject(12,11,1994);
		ReferenceObject ro2 = new ReferenceObject(12,11,1994);
		System.out.println("ValueObjects with same fields:");
		System.out.println("vo1 and vo2 equal? " + 
				(vo1.equals(vo2) ? "Yep!" : "Nope!"));
		System.out.println("ReferenceObjects with same fields:");
		System.out.println("ro1 and ro2 equal? " + 
				(ro1.equals(ro2) ? "Yep!" : "Nope!"));
	}

}
