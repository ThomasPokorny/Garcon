package garcon.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class DataSource {
	
	private ConnectionSettings connectionSettings = new ConnectionSettings();
	private Connection con;
	
	public DataSource(){
		connectionSettings = new ConnectionSettings();
	}
	
	public void connect() throws SQLException {
		System.out.println(connectionSettings.getUrl()+connectionSettings.getUsr()+connectionSettings.getPw());
		con = DriverManager.getConnection(connectionSettings.getUrl(), connectionSettings.getUsr(), connectionSettings.getPw());
	}
	
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getCon() {
		return con;
	}
	
	public static DSLContext getCreate(DataSource dataSource) {
		return DSL.using(dataSource.getCon(), SQLDialect.POSTGRES);
	}
	
}
