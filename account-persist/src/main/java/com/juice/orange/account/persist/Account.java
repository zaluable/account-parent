package com.juice.orange.account.persist;

public class Account {

	private String id;
	private String name;
	private String passWord;
	private String email;
	private boolean activited;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActivited() {
		return activited;
	}

	public void setActivited(boolean activited) {
		this.activited = activited;
	}
}
