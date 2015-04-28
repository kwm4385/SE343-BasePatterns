import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class PersonProvider implements IPersonProvider {

	@Override
	public RecordSet getAllPeople() {
		// Returns a mock record set with some people. Normally this would
		// come from a database.
		List<String> fnames = Arrays.asList(new String[] {"Joe", "Geoff", "Kevin", "Austin", "Jeremy", "Dan"});
		List<String> lnames = Arrays.asList(new String[] {"White", "Krutz", "Eichel", "Lundquist", "Ford", "Vader"});
		Random r = new Random();
		
		RecordSet rs = new RecordSet();
		for(int i = 0; i < 10; i++) {
			HashMap<String, Object> values = new HashMap<String, Object>();
			values.put("FirstName", fnames.get(r.nextInt(fnames.size())));
			values.put("LastName", lnames.get(r.nextInt(lnames.size())));
			int num1, num2, num3;
		    num1 = r.nextInt (900) + 100;
		    num2 = r.nextInt (643) + 100;
		    num3 = r.nextInt (9000) + 1000;
			values.put("Phone", num1+"-"+num2+"-"+num3);
			rs.addRow(values);
		}
		
		return rs;
	}

}
