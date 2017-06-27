package com.test.test;

import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	// ������ �ڵ� ����
	// ������ �ڷ������� ������� bean�� ������ ������ �ڵ����� ����
	// Autowired ��ſ� @Resources�� �̿��ص� �˴ϴ�.

	@Autowired
	DataSource ds;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
		} catch (Exception e) {
			// ������ ���� �ʴ� ������ ȭ�鿡 ���
			System.out.println(e.getMessage());
		}

		return "home";
	}

}
