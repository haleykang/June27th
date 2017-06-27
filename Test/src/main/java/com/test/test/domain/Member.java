package com.test.test.domain;

// DTO 클래스 - 데이터 표현을 위한 클래스
public class Member {

	// 1. 컬럼이름과 동일한 인스턴스 변수 선언
	private int code;
	private String id;
	private String pw;
	private String username;

	// 2. 접근자 메소드 생성(getter, setter 함수)

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

	// 3. toString() 함수 재정의 : 빠르게 디버깅하기 위해서
	@Override
	public String toString() {
		return "Member [code=" + code + ", id=" + id + ", pw=" + pw + ", username=" + username + "]";
	}

	// 4. 생성자

	public Member() {
		super();
		System.out.println("Member() 기본생성자");
		// TODO Auto-generated constructor stub
	}

	public Member(int code, String id, String pw, String username) {
		super();
		this.code = code;
		this.id = id;
		this.pw = pw;
		this.username = username;
		System.out.println("Member() 생성자");
	}

}
