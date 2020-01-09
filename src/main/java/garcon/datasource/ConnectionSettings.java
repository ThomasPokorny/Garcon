package garcon.datasource;

public class ConnectionSettings {
	
	private String url; 
	private String usr;
	private String pw;
	
	public ConnectionSettings()
	{
		//creates default connection Settings
		connectionsGuruFactory(LOCAL_HOST);
	}
	
	private void connectionsGuruFactory(ConnectionsGuru con) {
		this.url = con.url;
		this.usr = con.usr;
		this.pw = con.pw;
	}
	
	//TODO: 
	public String getUrl() {
		return url;
	}

	public String getUsr() {
		return usr;
	}

	public String getPw() {
		return pw;
	}
	
	
	public static final ConnectionsGuru LOCAL_HOST = new ConnectionsGuru("jdbc:postgresql://localhost:5432/garcon","tom"," ");
	public static final ConnectionsGuru DOCKER_CONNECTION = new ConnectionsGuru("jdbc:postgresql://192.168.1.103:5432/lernguru","postgres","docker");
	public static final ConnectionsGuru AWS_LERNGURU_DEV = new ConnectionsGuru("jdbc:postgresql://lerngurudev.cvc9xdv8glez.us-east-2.rds.amazonaws.com:5432/lernguru","guru","Hctidloemosar6");
	
	
 	private static class ConnectionsGuru{
 		
 		private String url; 
 		private String usr;
 		private String pw;
 		
 		public ConnectionsGuru(String url,String usr,String pw) {
 			this.url = url;
 			this.usr = usr;
 			this.pw = pw;
 		}
	
 	}
	
}
