package com.seavenois.tetris;

import android.graphics.drawable.Drawable;

/*************************************************/
/* A box is each one of the positions in the *****/
/* board (200) ***********************************/
/*************************************************/
public class Box {
	private int top, left, side, color;
	Drawable img;

	/*************************************************/
	/* Color getter **********************************/
	/*************************************************/
	/* The color is also used to indicate the box ****/
	/* state. '0' means that the box is free *********/
	/*************************************************/
	public int getColor() {
		return color;
	}
	
	/*************************************************/
	/* Color setter **********************************/
	/*************************************************/
	/* The color is also used to indicate the box ****/
	/* state. Setting color to '0' is marking the ****/
	/* box as free ***********************************/
	/*************************************************/
	public void setColor(int color) {
		this.color = color;
	}
	
	/*************************************************/
	/* Position getters ******************************/
	/*************************************************/
	public int getTop() {
		return top;
	}
	public int getLeft() {
		return left;
	}
	public int getSide() {
		return side;
	}
	
	/*************************************************/
	/* Class constructor *****************************/
	/*************************************************/
	/* Defines the position and size of the box and **/
	/* marks it as free ******************************/
	/*************************************************/
	public Box(int _top, int _left, int _side){
		top = _top;
		left = _left;
		side = _side;
		color = Values.COLOR_NONE;
	}
}
