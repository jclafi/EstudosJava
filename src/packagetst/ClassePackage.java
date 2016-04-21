package packagetst;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ClassePackage {
	private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date date = new Date();
	
	public String getDateTime() {
		return dateFormat.format(date);
	}
	
	protected String getDate() {
		return SimpleDateFormat.getInstance().format(date.getTime());
	}	
}
