package com.test.test.domain;

// DTO Ŭ���� - ������ ǥ���� ���� Ŭ����
public class Member {

	// 1. �÷��̸��� ������ �ν��Ͻ� ���� ����
	private int code;
	private String id;
	private String pw;
	private String username;

	// 2. ������ �޼ҵ� ����(getter, setter �Լ�)

	// code
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	// id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// pw
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	// username
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// 3. toString() �Լ� ������ : ������ ������ϱ� ���ؼ�
	@Override
	public String toString() {
		return "Member [code=" + code + ", id=" + id + ", pw=" + pw + ", username=" + username + "]";
	}

	// 4. ������

	public Member() {
		super();
		System.out.println("Member() �⺻������");
		// TODO Auto-generated constructor stub
	}

	public Member(int code, String id, String pw, String username) {
		super();
		this.code = code;
		this.id = id;
		this.pw = pw;
		this.username = username;
		System.out.println("Member() ������");
	}

}
