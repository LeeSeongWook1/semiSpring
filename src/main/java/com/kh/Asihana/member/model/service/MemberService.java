package com.kh.Asihana.member.model.service;

import com.kh.Asihana.member.model.vo.Member;

public interface MemberService {

	Member login(Member member);
	
	int insert(Member member);
	
	int update(Member member);
	
	int delete(Member member);
	
	
}
