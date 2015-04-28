
public class Main {

	public static void main(String[] args) {
		IPersonProvider pp = new PersonProvider();
		
		RecordSet results = pp.getAllPeople();
		
		System.out.println("| FirstName | LastName | Phone |\n");
		for(RecordSet.Row r : results.getRows()) {
			System.out.println("| " + r.getValue("FirstName") + " | " + r.getValue("LastName") + " | " + r.getValue("Phone") + " |");
		}
	}
}
