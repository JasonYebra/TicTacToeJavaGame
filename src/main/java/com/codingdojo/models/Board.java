package com.codingdojo.models;

public class Board
{
	public int player1_wins=0;
	public int player2_wins=0;
	public int board[][];

	public Board()
	{
		board=new int[3][3];
		reset();
	}

	public void reset()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]=0;
			}
		}
	}
};