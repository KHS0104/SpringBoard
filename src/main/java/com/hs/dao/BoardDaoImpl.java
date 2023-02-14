package com.hs.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hs.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	SqlSession sqlSession;
	
	BoardDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public ArrayList<BoardDto> getAllListBoard() {
		List<BoardDto> list = sqlSession.selectList("com.hs.mapper.boardMapper.showAllBoard");
		ArrayList<BoardDto> list2 = new ArrayList<BoardDto>();
		list2.addAll(list);
		return list2;
	}

	@Override
	public BoardDto getBoardOne(int bno) {
		BoardDto dto = sqlSession.selectOne("com.hs.mapper.boardMapper.showOneBoard", bno);
		return dto;
	}

	@Override
	public void insert(BoardDto dto) {
		sqlSession.insert("com.hs.mapper.boardMapper.insertBoard", dto);
	}

	@Override
	public void delete(int bno) {
		sqlSession.delete("com.hs.mapper.boardMapper.deleteBoard", bno);
	}

	@Override
	public void update(BoardDto dto) {
		sqlSession.update("com.hs.mapper.boardMapper.updateBoard", dto);
	}
	
}
