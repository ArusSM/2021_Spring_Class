package com.yydh.myapp.user;

public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;

	/*
	 * create table users( 
	 * id varchar2(30),
	 * password varchar2(30), name
	 * varchar2(30), 
	 * role varchar2(30) 
	 * );
	 */
	
	// insert into users values('admin','1234','admin','admin');
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
