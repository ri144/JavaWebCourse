import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Experience {

	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private int myexpid;
	
	public void setWork(String position, String company, String startmonth, String startyear, String endmonth,
			String endyear, String duty1, String duty2, int id) {
		// TODO Auto-generated method stub
		String myString = "insert into Exper (position, company, startmonth, startyear, endmonth, endyear, duty1, duty2, personid)"
				+ " Values ('" + position + "', '" + company + "', '" + startmonth + "', '" + startyear + "', '"
				+ endmonth + "', '" + endyear + "', '" + duty1 + "', '" +duty2 + "', '" + id + "');";
		getExpid();
		doSql(myString);
	}

	private void doSql(String sqlstatement){
		try {
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/myNewDB?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.createStatement();
			stmt.executeUpdate(sqlstatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getPosition(int id, int i) {
		// TODO Auto-generated method stub
		return select("position", id, i);
	}

	public String getCompany(int id, int i) {
		// TODO Auto-generated method stub
		return select("company", id, i);
	}

	public String getStartMonth(int id, int i) {
		// TODO Auto-generated method stub
		return select("startmonth", id, i);
	}

	public String getEndYear(int id, int i) {
		// TODO Auto-generated method stub
		return select("endyear", id, i);
	}

	public String getEndMonth(int id, int i) {
		// TODO Auto-generated method stub
		return select("endmonth", id, i);
	}

	public String getDuty2(int id, int i) {
		// TODO Auto-generated method stub
		return select("duty2", id, i);
	}

	public String getStartYear(int id, int i) {
		// TODO Auto-generated method stub
		return select("startyear", id, i);
	}

	public String getDuty1(int id, int i) {
		// TODO Auto-generated method stub
		return select("duty1", id, i);
	}
	
	private void getExpid() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/myNewDB?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String input = "select max(expid) from Exper;";
			rs = stmt.executeQuery(input);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rs!= null){
			try {
				//String complete = "";
				//while(rs.next()){
				rs.next();
				this.myexpid = rs.getInt(1);
				//}
				//return complete;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private String select(String item, int id, int eduid){
		try {
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/myNewDB?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.createStatement();
			String input = "select " + item + " from Exper p where p.expid = " + String.valueOf(eduid + myexpid) + " and p.personid = " + String.valueOf(id) + ";";
			//System.out.println(input);
			rs = stmt.executeQuery(input);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rs!= null){
			try {
				//String complete = "";
				//while(rs.next()){
				rs.next();
				return rs.getString(item);
				//}
				//return complete;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				return "";
			}
		}
		return "";
	}
	
}
