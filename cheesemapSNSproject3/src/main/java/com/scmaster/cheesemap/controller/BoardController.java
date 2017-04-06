package com.scmaster.cheesemap.controller;

import com.scmaster.cheesemap.dao.BoardDAO;
import com.scmaster.cheesemap.vo.Board;
import com.scmaster.cheesemap.vo.BoardTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class BoardController {

    @Autowired
    private BoardDAO dao;

    @ResponseBody
    @RequestMapping(value = "insertBasket", method = RequestMethod.POST)
    public int insertBasket(String mem_id, String boa_latitude, String boa_longitude){
        System.out.println(mem_id);
        System.out.println(boa_latitude);
        System.out.println(boa_longitude);
        int result = 0;
        return result;
    }


    @ResponseBody
    @RequestMapping(value = "boardSave", method = RequestMethod.POST)
    public int boardSave(Board board, HttpSession session, String tag_name) {
        String mem_id = (String) session.getAttribute("mem_id");
        board.setMem_id(mem_id);
        int result = dao.boardSave(board);

        System.out.println("게시물 저장하고 왔따");
        System.out.println(board.getBoa_id());

        String test = tag_name.substring(1);
        String tag_name_list[] = test.split("#");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(tag_name_list));

        int result2 = 0;

        for (String tags : list) {
            BoardTag tag = new BoardTag(tags, board.getBoa_id());
            result2 += dao.tagSave(tag);
        }

        System.out.println(result2);

        int result3 = result + result2;

        return result3;
    }

    @RequestMapping(value = "boardWrite", method = RequestMethod.GET)
    public String boardWrite(String lat, String lng, Model model) {
        model.addAttribute("lat", lat);
        model.addAttribute("lng", lng);
        return "boardWrite";
    }

}
