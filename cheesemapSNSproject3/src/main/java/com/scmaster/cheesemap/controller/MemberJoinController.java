package com.scmaster.cheesemap.controller;

import java.io.IOException;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.scmaster.cheesemap.dao.memberDAO;
import com.scmaster.cheesemap.util.FileService;
import com.scmaster.cheesemap.util.MailTest;
import com.scmaster.cheesemap.vo.Member;

@Controller
public class MemberJoinController {
	private static final Logger logger = LoggerFactory.getLogger(MemberLoginController.class);

	final String uploadPath = "/memberfile";

	@Autowired
	private memberDAO dao;

	@ResponseBody
	@RequestMapping(value = "idCheck", method = RequestMethod.GET)
	public int idCheck(String mem_id) {
		int result = -1;
		try {
			result = dao.idCheck(mem_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "nicknameCheck", method = RequestMethod.GET)
	public int nicknameCheck(String mem_nickname) {
		int result = -1;
		try {
			result = dao.nicknameCheck(mem_nickname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "fileupload", method = RequestMethod.POST)
	public String fileupload(MultipartHttpServletRequest request) {
		Iterator<String> itr = request.getFileNames();
		String fullpath = "";
		if (itr.hasNext()) {
			MultipartFile mpf = request.getFile(itr.next());
			System.out.println(request.getServletContext().getRealPath("/resource/image/"));
			try {
				System.out.println("file length : " + mpf.getBytes().length);
				System.out.println("file name : " + mpf.getOriginalFilename());
				if (!mpf.isEmpty()) {
					String savedfile = FileService.saveFile(mpf,
							request.getServletContext().getRealPath("/resources/image/"));
					fullpath = "./resources/image/" + savedfile;
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			return fullpath;
		} else {
			return fullpath;
		}
	}

	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(Member mb, MultipartFile originalfile) {
		// 파일이 있는지 확인
		// 경로만 얻어냄
		if (!originalfile.isEmpty()) {
			String savedfile = FileService.saveFile(originalfile, uploadPath);
			mb.setMem_originalfile(originalfile.getOriginalFilename());
			mb.setMem_savefile(savedfile);
		}
		// 회원가입 성공 여부 flag
		int result = 0;
		try {
			result = dao.join(mb);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/";
		}
		// 회원가입 성공시(ip:203.233.196.106)
		if (result == 1) {
			MailTest mailtest = new MailTest();
			String cheese_id = "cocohello010@gmail.net";// 보내는 사람
			String subjectTxt = "[Cheese]본인인증확인 메일입니다";// 제목
			String msgTxt = "본인 인증을 위하여 아래의 버튼을 눌러주세요."
					+ "<br><a href='http://localhost:8888/cheesemap/authentication?" 
					+ "mem_id=" + mb.getMem_id()
					+ "'>본인인증 확인</a>"; // 내용
			mailtest.testMailSend(mb.getMem_id(), cheese_id, subjectTxt, msgTxt);
		}
		return "home";
	}

	@RequestMapping(value = "authentication", method = RequestMethod.GET)
	public String authentication(String mem_id) {
		if(mem_id!=null){
			dao.authenticate(mem_id);
		}
		return "redirect:/";
	}
}
