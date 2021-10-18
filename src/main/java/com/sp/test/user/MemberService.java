package com.sp.test.user;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {
	
	@Autowired 
	private IMemberDAO dao;
	
	public void insert() {
		System.out.println("insert");
		MemberDTO memberDTO=new MemberDTO();
		memberDTO.setEmail("test@naver.com");
		memberDTO.setId("test");
		memberDTO.setName("testname");
		memberDTO.setPwd("1111");
		dao.memberProc(memberDTO);
	}

}
