/*
 * Program Name: CircleComparable.java
 * Author: Julian Fuentes
 * Date Last Updated: 04 February 2024
 * Purpose: This program will compare two circles. 
 */

import java.util.*;

public abstract class GeometricObject 
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() 
	{
		dateCreated = new java.util.Date();
	}
	//This should construct a default geometric object.
	
	public GeometricObject(String color, boolean filled) 
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	//This should construct a geometric object with the specified
	//color and filled value.
	
	public String getColor() 
	{
		return color;
	}
	//This should return color.
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	//This should set a new color.
	
	public boolean isFilled() 
	{
		return filled;
	}
	//This should return filled.
	
	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}
	//This should set a new filled.
	
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	//This should get dateCreated.
	
	@Override
	public String toString() 
	{
		return "created on " + dateCreated + "\ncolor: " 
				+ color + " and filled: " + filled;
	}
	//This should return a string representation of this object.
	
	public abstract double getArea();
	public abstract double getPerimeter();
	//Abstract methods for getArea and getPerimeter.
}
