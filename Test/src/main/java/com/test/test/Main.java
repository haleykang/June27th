package com.test.test;

import com.test.test.dao.MemberDao2;
import com.test.test.domain.Member;
import com.test.test.factory.DaoFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	// 실제 db에 접속하는..
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		MemberDao2 dao = context.getBean("MemberDao2", MemberDao2.class);

		/*
		 * AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext(DaoFactory.class); MemberDao2 dao
		 * = context.getBean("create", MemberDao2.class);
		 */
		// MemberDao2 dao = new MemberDao2();
		// 된거야 뭐야
		
		// MemberDao2 dao = DaoFactory.create();

		/*
		 * Member member = new Member(); member.setCode(7);
		 * member.setId("test02"); member.setPw("1216");
		 * member.setUsername("테스트2");
		 * 
		 * dao.insertMember(member);
		 */
		Member dto = dao.get(5);

		System.out.println(dto);
		context.close();

		// 오늘의 목표, 이걸 안드로이드로 연결해서 아이디 비밀번호 다 입력받아서 구현하기?
	}

}
