/*
 * Program Name: CircleComparable.java
 * Author: Julian Fuentes
 * Date Last Updated: 04 February 2024
 * Purpose: This program will compare two circles. 
 */

import java.util.*;

public class CircleComparable
{
	public static void main(String[] args) 
	{
		Circle firstCircle = new Circle(5, "blue", true);
		Circle secondCircle = new Circle(5, "red", false);
		Circle thirdCircle = new Circle(4, "red", false);
		//These are three circle objects.
	
		System.out.println("The first circle's radius: " + firstCircle.getRadius());
		System.out.println("The second circle's radius: " + secondCircle.getRadius());
		System.out.println("The third circle's radius: " + thirdCircle.getRadius());
		System.out.println("The first circle is " + (firstCircle.equals(secondCircle)
			? "":"not ") + "equal to the second circle.");
		System.out.println("The first circle is " + (firstCircle.equals(thirdCircle) 
			? "":"not ") + "equal to the third circle.");
		//I didn't know exactly what to write for the println statements, so this 
		//is what looks good to me.
	}
}
