package packageTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
	
		
		String sql="create table employee(eno int ,ename varchar(10),esal varchar(10),eadd varchar(10))";
		
		
		
		
		Statement st=con.createStatement();
		st.execute(sql);
		System.out.println("Table Created");
		con.close();
		
	}

}
