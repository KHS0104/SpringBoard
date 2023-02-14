package com.hs.service;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hs.dao.BoardDao;
import com.hs.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class BoardDaoTest {
	@Autowired
	BoardDao dao;
	
	@Test	// 단위테스트
	public void shoAllBoard() throws Exception {
		ArrayList<BoardDto> list = dao.getAllListBoard();
		for(BoardDto dto : list) {
			System.out.println(dto.getBno() + " / " + dto.getTitle() + " / " + dto.getContent());
		}
	}
	
	@Test
	public void showOneBoard() throws Exception {
		BoardDto dto = dao.getBoardOne(50);
		System.out.println(dto.getBno() + " / " + dto.getTitle() + " / " + dto.getContent());
	}
	
	@Test
	public void insertBoard() throws Exception {
		BoardDto dto = new BoardDto();
		
		dto.setTitle("새로운 제목");
		dto.setContent("새로운 내용");
		dto.setWriter("새로운 작성자");
		dao.insert(dto);
		System.out.println(dto.getTitle() + " / " + dto.getContent() + " / " + dto.getWriter());
	}
}
