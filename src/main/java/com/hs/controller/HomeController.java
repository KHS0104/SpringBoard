package com.hs.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hs.dto.BoardDto;
import com.hs.service.BoardService;

@Controller
public class HomeController {
	@Autowired
	BoardService boardSvc;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/board_list")
	public String boardList(HttpServletRequest request) {
		ArrayList<BoardDto> listAllBoard = boardSvc.getBoardList();
		request.setAttribute("list", listAllBoard);
		return "board_list";
	}
	
	@RequestMapping("/board_detail")
	public String boardDetail(HttpServletRequest request, int bno) {
		BoardDto dto = boardSvc.getBoard(bno);
		request.setAttribute("dto", dto);
		return "board_detail";
	}
	
	@RequestMapping("/write_board")
	public String writeBoard() {
		return "write_board";
	}
	
	@RequestMapping("/board_write_action")
	public String write(HttpServletRequest request, BoardDto dto) {
		boardSvc.insertBoard(dto);
		ArrayList<BoardDto> listAllBoard = boardSvc.getBoardList();
		request.setAttribute("list", listAllBoard);
		return "board_list";
	}
	
	@RequestMapping("/update_board")
	public String update() {
		return "update_board";
	}
	
	@RequestMapping("/board_update_action")
	public String updateBoard(HttpServletRequest request, BoardDto dto) {
		System.out.println(dto.getBno());
		//System.out.println("들어왔니 업데이트?");
		boardSvc.updateBoard(dto);
		ArrayList<BoardDto> listAllBoard = boardSvc.getBoardList();
		request.setAttribute("list", listAllBoard);
		return "redirect:board_list";
	}
	
	@RequestMapping("/board_delete_action")
	public String deleteBoard(HttpServletRequest request, int bno) {
		//System.out.println("들어왔니 삭제?");
		boardSvc.deleteBoard(bno);
		ArrayList<BoardDto> listAllBoard = boardSvc.getBoardList();
		request.setAttribute("list", listAllBoard);
		return "redirect:board_list";
	}
	
}
