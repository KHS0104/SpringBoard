package com.hs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.dao.BoardDao;
import com.hs.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardDao dao;
	
	@Override
	public ArrayList<BoardDto> getBoardList() {
		return dao.getAllListBoard();
	}

	@Override
	public BoardDto getBoard(int bno) {
		BoardDto dto = dao.getBoardOne(bno);
		return dto;
	}

	@Override
	public void insertBoard(BoardDto dto) {
		dao.insert(dto);
	}

	@Override
	public void deleteBoard(int bno) {
		dao.delete(bno);
	}

	@Override
	public void updateBoard(BoardDto dto) {
		dao.update(dto);
	}
}
