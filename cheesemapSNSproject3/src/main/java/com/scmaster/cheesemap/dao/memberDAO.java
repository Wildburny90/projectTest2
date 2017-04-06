package com.scmaster.cheesemap.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scmaster.cheesemap.vo.Member;

@Repository
public class memberDAO implements MemberMapper {

	@Autowired
	private SqlSession sqlsession;

	@Override
	public Member searchMember(String id) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		Member member = mapper.searchMember(id);

		if (member != null) {
			return member;
		}

		return null;
	}

	public int idCheck(String mem_id) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		int result = mapper.idCheck(mem_id);
		return result;
	}

	public int nicknameCheck(String mem_nickname) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		int result = mapper.nicknameCheck(mem_nickname);
		return result;
	}

	public int join(Member mb) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		int result = mapper.join(mb);
		return result;
	}

	public int authenticate(String mem_id) {
		MemberMapper mapper = sqlsession.getMapper(MemberMapper.class);
		int result = mapper.authenticate(mem_id);
		return result;
	}
}