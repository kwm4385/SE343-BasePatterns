import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RecordSet {
	
	private List<Row> rows;
	
	public RecordSet() {
		this.rows = new ArrayList<Row>();
	}
	
	public void addRow(HashMap<String, Object> values) {
		rows.add(new Row(values));
	}
	
	public List<Row> getRows() {
		return rows;
	}
	
	class Row {
		private HashMap<String, Object> values;
		
		public Row(HashMap<String, Object> values) {
			this.values = values;
		}
		
		public Object getValue(String column) {
			return values.get(column);
		}
	}
}
