package com.scmaster.cheesemap.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scmaster.cheesemap.dao.MyMenuDAO;
import com.scmaster.cheesemap.util.MailTest;
import com.scmaster.cheesemap.vo.MyMenu;

@Controller
public class MyMenuController {
	
	@Autowired
	private MyMenuDAO myMenuDao;
	
	@ResponseBody
	@RequestMapping(value = "mymenu", method = RequestMethod.POST)
	public MyMenu getMyMenu(String mem_id) {
		MyMenu result = myMenuDao.getMyMenu(mem_id);
		System.out.println(result);
		return result;
	}
	
	@RequestMapping(value = "download", method = RequestMethod.GET)
	public String download(String mem_id, HttpServletResponse response) {
		MyMenu myMenu = myMenuDao.getMyMenu(mem_id);
		try {
			response.setHeader("Content-Disposition",
					"attachment;filename=" + URLEncoder.encode(myMenu.getMem_originalfile(), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		String fullPath = "C:/memberfile" + "/" + myMenu.getMem_savefile();
		FileInputStream filein = null;
		ServletOutputStream fileout = null;

		try {
			filein = new FileInputStream(fullPath);
			fileout = response.getOutputStream();
			FileCopyUtils.copy(filein, fileout);
			filein.close();
			fileout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="contactme", method=RequestMethod.POST)
	public void contactme(String subject, String email, String message){
			MailTest mailtest = new MailTest();
			String cheese_id = "cocohello010@gmail.net";// cheese team address
			//보내는 사람, 서버메일주소, subject
			mailtest.testMailSend(email, cheese_id, subject, message);
	}
}
