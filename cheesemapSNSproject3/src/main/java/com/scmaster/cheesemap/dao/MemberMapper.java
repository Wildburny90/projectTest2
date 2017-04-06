
package com.scmaster.cheesemap.dao;

import com.scmaster.cheesemap.vo.Member;

public interface MemberMapper {
	public int idCheck(String mem_id);

	public int nicknameCheck(String mem_nickname);

	public int join(Member mb);

	public int authenticate(String mem_id);

	public Member searchMember(String id);
}