package com.scmaster.cheesemap.dao;

import com.scmaster.cheesemap.vo.Board;
import com.scmaster.cheesemap.vo.BoardTag;
import com.scmaster.cheesemap.vo.MyBasket;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BoardDAO {

    public BoardMapper mapper;

    @Autowired
    SqlSession session;

    public int boardSave(Board board){
        mapper = session.getMapper(BoardMapper.class);
        int result = mapper.boardSave(board);
        return result;
    }

    public int tagSave(BoardTag boardTag){
        mapper = session.getMapper(BoardMapper.class);
        int result = mapper.tagSave(boardTag);
        return result;
    }

    public int saveToBasket(String mem_id, String latitude, String longitude, String place_name){
        mapper = session.getMapper(BoardMapper.class);
        int result = mapper.saveToBasket(mem_id, latitude, longitude, place_name);
        return result;
    }

    public ArrayList<MyBasket> getMyBasket(String mem_id){
        mapper = session.getMapper(BoardMapper.class);
        ArrayList<MyBasket> result = mapper.getMyBasket(mem_id);
        return result;
    }

    public int deleteBasketItem(String mem_id, String place_name){
        mapper = session.getMapper(BoardMapper.class);
        int result = mapper.deleteBasketItem(mem_id, place_name);
        return result;
    }
}
