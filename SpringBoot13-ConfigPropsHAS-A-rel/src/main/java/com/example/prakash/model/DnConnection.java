package com.example.prakash.model;

public class DnConnection {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	public final String getDriver() {
		return driver;
	}
	public final void setDriver(String driver) {
		this.driver = driver;
	}
	public final String getUrl() {
		return url;
	}
	public final void setUrl(String url) {
		this.url = url;
	}
	public final String getUsername() {
		return username;
	}
	public final void setUsername(String username) {
		this.username = username;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DnConnection [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}
	

}
