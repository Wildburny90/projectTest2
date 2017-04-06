package com.scmaster.cheesemap.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scmaster.cheesemap.vo.MyMenu;

@Repository
public class MyMenuDAO implements MyMenuMapper {

	@Autowired
	private SqlSession sqlsession;

	@Override
	public MyMenu getMyMenu(String mem_id) {
		MyMenuMapper mapper = sqlsession.getMapper(MyMenuMapper.class);
		MyMenu result = mapper.getMyMenu(mem_id);
		
		return result;
	}
}