package com.hs.dao;

import java.util.ArrayList;

import com.hs.dto.BoardDto;

public interface BoardDao {
	ArrayList<BoardDto> getAllListBoard();
	BoardDto getBoardOne(int bno);
	void insert(BoardDto dto);
	void delete(int bno);
	void update(BoardDto dto);
}
