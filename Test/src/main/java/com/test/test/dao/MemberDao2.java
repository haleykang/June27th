package com.test.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.test.domain.Member;

public class MemberDao2 {

	public void insertMember(Member member) {

		try {
			System.out.println("insertMember() 실행");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@211.183.2.253:1521:orcl", "user02",
					"user02");
			PreparedStatement ps = con.prepareStatement("insert into member(code,id,pw,username) values(?,?,?,?)");
			ps.setInt(1, member.getCode());
			ps.setString(2, member.getId());
			ps.setString(3, member.getPw());
			ps.setString(4, member.getUsername());
			ps.executeUpdate();
			ps.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("1.예외 발생 : " + e.getMessage());
		}

	} // end of insert member

	public Member get(int code) {
		Member member = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@211.183.2.253:1521:orcl", "user02",
					"user02");
			PreparedStatement ps = con.prepareStatement("select * from member where code = " + code);
			ResultSet rs = ps.executeQuery();
			rs.next();
			member = new Member();
			member.setCode(rs.getInt("code"));
			member.setId(rs.getString("id"));
			member.setPw(rs.getString("pw"));
			member.setUsername(rs.getString("username"));

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			System.out.println("2.예외 발생 : " + e.getMessage());
		}
		return member;
	}

}
