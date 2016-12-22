package bestellung;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConnectionSettings {
	private String driver;
	private String url;
	private String username;
	private String password;

	public ConnectionSettings() {
		this.driver = "com.mysql.jdbc.Driver";
		this.url = "jdbc:mysql://localhost:3306/essensbesellung";
		this.username = " JPA_User";
		this.password = "maA@:3TWA+*C}Nu.";
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}