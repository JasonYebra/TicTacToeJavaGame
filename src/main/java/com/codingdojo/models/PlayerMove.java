package com.codingdojo.models;

public class PlayerMove
{
	/*
		board=
		[
			[
				0,0,0
			],
			[
				0,0,0
			],
			[
				0,0,0
			]
		]
	*/
	
	private int shape; // false = 0, true = x
	private int xdir;
	private int ydir;
	
	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		this.shape = shape;
	}
	public int getXdir() {
		return xdir;
	}
	public void setXdir(int xdir) {
		this.xdir = xdir;
	}
	public int getYdir() {
		return ydir;
	}
	public void setYdir(int ydir) {
		this.ydir = ydir;
	}
};