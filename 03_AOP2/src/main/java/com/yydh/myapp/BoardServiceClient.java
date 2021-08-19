package com.yydh.myapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context
		= new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService service = (BoardService)context.getBean("boardService");
		List<BoardVO> boardList = service.getBoardList();
		for(BoardVO board : boardList) {
			System.out.println(board.toString());
		}
		// insert into board values(1,'test','csm','test',sysdate,1);
		BoardVO vo = new BoardVO();
		vo.setWriter("csm");
		vo.setContent("test");
		vo.setTitle("test3");
		service.insertBoard(vo);
		
	}
}
