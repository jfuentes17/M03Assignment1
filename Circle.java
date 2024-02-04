/*
 * Program Name: CircleComparable.java
 * Author: Julian Fuentes
 * Date Last Updated: 04 February 2024
 * Purpose: This program will compare two circles. 
 */

import java.util.*;

public class Circle extends GeometricObject implements Comparable<Circle>
{
	private double radius;
	
	public Circle() 
	{
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) 
	{
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() 
	{
		return radius;
	}
	//This should return the radius.
	
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	//This should set the new radius.
	
	@Override
	public double getArea() 
	{
		return radius * radius * Math.PI;
	}
	//This should return the area.
	
	public double getDiameter() 
	{
		return 2 * radius;
	}
	//This should return the diameter.
	
	@Override
	public double getPerimeter() 
	{
		return 2 * radius * Math.PI;
	}
	//This should return the perimeter.
	
	@Override
	public boolean equals(Object obj) 
	{
		return this.compareTo((Circle)obj) == 0;
	}
	//This should return true if the objects' radii are equal.
	
	@Override
	public int compareTo(Circle obj) 
	{
		if(this.radius > obj.radius)
			return 1;
		else if(this.radius < obj.radius)
			return -1;
		else return 0;
	}
	//This should implement the compareTo method.
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nDate created: " 
				+ getDateCreated() + "\nRadius: " + radius;
	}
	//This should implement the toString method.
	
}
