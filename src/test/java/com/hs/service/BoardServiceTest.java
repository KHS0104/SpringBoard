package com.hs.service;

import java.util.ArrayList;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hs.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardServiceTest {
	@Autowired
	BoardService svc;
	
	@Test
	public void testshowAllBoard() throws Exception {
		ArrayList<BoardDto> list = svc.getBoardList();
		for(int i=0; i<=list.size()-1; i++) {
			System.out.println(list.get(i).getBno() + " / " + list.get(i).getTitle() + " / " + list.get(i).getContent() + " / " + list.get(i).getWriter() + " / " + list.get(i).getWriteDate());
		}
//		for(BoardDto dto : list) {		// for-each문
//			System.out.println(dto.getBno() + " / " + dto.getTitle() + " / " + dto.getContent());
//		}
	}
	
	@Test
	public void testShowOneBoard() throws Exception {
		BoardDto dto = svc.getBoard(49);
		System.out.println(dto.getBno() + " / " + dto.getTitle() + " / " + dto.getContent());
	}
	
	@Test
	public void testInsertBoard() throws Exception {
		BoardDto dto = new BoardDto();
		
		dto.setTitle("새로운 제목");
		dto.setContent("새로운 내용");
		dto.setWriter("새로운 작성자");
		
		System.out.println(dto.getTitle() + " / " + dto.getContent() + " / " + dto.getWriter());
	}
}
