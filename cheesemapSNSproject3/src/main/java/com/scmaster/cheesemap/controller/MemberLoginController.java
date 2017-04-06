package com.scmaster.cheesemap.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scmaster.cheesemap.dao.memberDAO;
import com.scmaster.cheesemap.vo.Member;

@Controller
public class MemberLoginController {

	@Autowired
	private memberDAO memberdao;

	@ResponseBody
	@RequestMapping(value = "loginCheck", method = RequestMethod.POST)
	public String loginCheck(String mem_id, String mem_pw, HttpSession session) {
	String result = null;
		Member member = memberdao.searchMember(mem_id);
	if(member == null){
		result = "a";
	}else if(mem_id.equals(member.getMem_id())&&!mem_pw.equals(member.getMem_pw())){
		result = "a";
	}else if(mem_id.equals(member.getMem_id())&&mem_pw.equals(member.getMem_pw())){
		session.setAttribute("mem_id", member.getMem_id());
		session.setAttribute("mem_nickname", member.getMem_nickname());
		session.setAttribute("mem_savefile", member.getMem_savefile());
		result = "b";
	}
		return result;
	}
}