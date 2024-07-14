
package com.synechron.java.abstrac;

public class GeometricManager {

	
	public static void main(String[] args) {
		
		
		Geometry triangle = new Triangle();
		Geometry circle = new Circle();
		
		triangle.area();
		triangle.shape();
		
		circle.area();
		circle.shape();
	}
}
