package com.test.test.factory;

import com.test.test.dao.MemberDao2;
import org.springframework.context.annotation.*;
// ���丮 �޼ҵ� ����

@Configuration
public class DaoFactory {

	@Bean
	static public MemberDao2 create() {
		return new MemberDao2();

	}

}
