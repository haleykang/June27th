package com.test.test;

import com.test.test.dao.MemberDao2;
import com.test.test.domain.Member;
import com.test.test.factory.DaoFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	// ���� db�� �����ϴ�..
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
		// �Ȱž� ����
		
		// MemberDao2 dao = DaoFactory.create();

		/*
		 * Member member = new Member(); member.setCode(7);
		 * member.setId("test02"); member.setPw("1216");
		 * member.setUsername("�׽�Ʈ2");
		 * 
		 * dao.insertMember(member);
		 */
		Member dto = dao.get(5);

		System.out.println(dto);
		context.close();

		// ������ ��ǥ, �̰� �ȵ���̵�� �����ؼ� ���̵� ��й�ȣ �� �Է¹޾Ƽ� �����ϱ�?
	}

}
