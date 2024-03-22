package com.javaPractiseQuestions;

public class CaluculateArea {

	public static void main(String[] args) {
		
        // create object of class to call the metods
		CaluculateArea area = new CaluculateArea();
		area.areaOfSquare(5);
		int area_Rectangle = area.areaOfRectangle(4, 5);
		System.out.println("Area Of Rectangle : " + area_Rectangle);
		double area_circle = area.areaOfCircle(2);
		System.out.println("Area Of Circle : " + area_circle);
		area.areaOfCylinder(2, 3);

	}

	public void areaOfSquare(int side) {

		int areaOfSq = side * side;
		System.out.println("Area Of Square : " + areaOfSq);
	}

	public int areaOfRectangle(int length, int width) {
		int areaOfRect = length * width;
		return areaOfRect;
	}

	public double areaOfCircle(double radius) {

		double pi = 3.14;
		double areaOfCir = pi * radius * radius;
		return areaOfCir;
	}

	public void areaOfCylinder(double radius, double height) {
		double pi = 3.14;
		double areaOfCyli = 2 * pi * radius * radius * height;
		System.out.println("Area Of Cylinder : " + areaOfCyli);
	}
}
