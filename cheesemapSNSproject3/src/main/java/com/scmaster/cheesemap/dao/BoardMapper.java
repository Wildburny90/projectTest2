package com.scmaster.cheesemap.dao;

import com.scmaster.cheesemap.vo.Board;
import com.scmaster.cheesemap.vo.BoardTag;
import com.scmaster.cheesemap.vo.MyBasket;

import java.util.ArrayList;

public interface BoardMapper {

    public int boardSave(Board Board);

    public int tagSave(BoardTag boardTag);

    public int saveToBasket(String mem_id, String latitude, String longitude, String place_name);

    public ArrayList<MyBasket> getMyBasket(String mem_id);

    public int deleteBasketItem(String mem_id, String place_name);

}
