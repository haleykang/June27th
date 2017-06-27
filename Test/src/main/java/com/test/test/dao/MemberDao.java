package com.test.test.dao;

import java.util.List;

import com.test.test.domain.Member;

// DAO(Data Access Object) : 데이터베이스 연동을 위한 객체
public interface MemberDao {
	
	/*
	 * CRUD(Create, Read, Update, Delete) 구성
	 */
	
	// 1. 전체 데이터를 가져오는 메소드 : 게시판 전체보기
	public List<Member> selectAll();
	
	// 2. CREATE - 데이터를 삽입하는 메소드, 삽입 시 테이블 컬럼의 모든 정보를 넣어야 하기 때문에 매개 변수를 Member 클래스로
	public int insert(Member member);
	
	// 3. READ - 기본키(code)를 가지고 하나의 데이터를 찾아오는 메소드 : 게시판 상세보기
	public Member detail(int code);
	
	// 4. UPDATE - 데이터를 수정하는 메소드, 수정할 때는 테이블 컬럼의 모든 정보를 넣어야 하니까 매개 변수를 Member 클래스로
	public int update(Member member);
	
	// 5. DELETE - 데이터를 삭제하는 메소드, 삭제할 때는 모든 컬럼을 다 넣을 필요 없음, 기본키(code)만 넣도록 구성
	public int delete(int code);
	
}
