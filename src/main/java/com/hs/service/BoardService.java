package com.hs.service;

import java.util.ArrayList;

import com.hs.dto.BoardDto;

public interface BoardService {
	ArrayList<BoardDto> getBoardList();
	BoardDto getBoard(int bno);
	void insertBoard(BoardDto dto);
	void deleteBoard(int bno);
	void updateBoard(BoardDto dto);
}
