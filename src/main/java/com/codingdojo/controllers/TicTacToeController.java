package com.codingdojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.models.Board;
import com.codingdojo.models.PlayerMove;

@RestController
public class TicTacToeController
{
	private Board board;

	public TicTacToeController()
	{
		board=new Board();
	}
	
	@GetMapping("/reset")
	public void reset()
	{
		board.reset();
	}
	
	@PostMapping("/move")
	public PlayerMove move
	(
		@RequestBody PlayerMove mov
	)
	{	
		board.board[mov.getXdir()][mov.getYdir()]=mov.getShape();	
		return mov;
	}
}
