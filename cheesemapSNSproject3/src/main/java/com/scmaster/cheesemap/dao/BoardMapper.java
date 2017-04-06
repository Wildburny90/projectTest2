package com.scmaster.cheesemap.dao;

import com.scmaster.cheesemap.vo.Board;
import com.scmaster.cheesemap.vo.BoardTag;

public interface BoardMapper {

    public int boardSave(Board Board);

    public int tagSave(BoardTag boardTag);

}
