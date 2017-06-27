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

	// 의존성 자동 주입
	// 동일한 자료형으로 만들어진 bean이 있으면 변수에 자동으로 대입
	// Autowired 대신에 @Resources를 이용해도 됩니다.

	@Autowired
	DataSource ds;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
		} catch (Exception e) {
			// 연결이 되지 않는 이유를 화면에 출력
			System.out.println(e.getMessage());
		}

		return "home";
	}

}
