package com.test.test.dao;

import java.util.List;

import com.test.test.domain.Member;

// DAO(Data Access Object) : �����ͺ��̽� ������ ���� ��ü
public interface MemberDao {
	
	/*
	 * CRUD(Create, Read, Update, Delete) ����
	 */
	
	// 1. ��ü �����͸� �������� �޼ҵ� : �Խ��� ��ü����
	public List<Member> selectAll();
	
	// 2. CREATE - �����͸� �����ϴ� �޼ҵ�, ���� �� ���̺� �÷��� ��� ������ �־�� �ϱ� ������ �Ű� ������ Member Ŭ������
	public int insert(Member member);
	
	// 3. READ - �⺻Ű(code)�� ������ �ϳ��� �����͸� ã�ƿ��� �޼ҵ� : �Խ��� �󼼺���
	public Member detail(int code);
	
	// 4. UPDATE - �����͸� �����ϴ� �޼ҵ�, ������ ���� ���̺� �÷��� ��� ������ �־�� �ϴϱ� �Ű� ������ Member Ŭ������
	public int update(Member member);
	
	// 5. DELETE - �����͸� �����ϴ� �޼ҵ�, ������ ���� ��� �÷��� �� ���� �ʿ� ����, �⺻Ű(code)�� �ֵ��� ����
	public int delete(int code);
	
}
