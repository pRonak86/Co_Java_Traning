package com.test;

import java.util.Scanner;

abstract class GeometricObject {
	String color;
	boolean filled;

	protected GeometricObject() {
	}

	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("Color: " + color);
	}

	public String toString() {
		return color;
	}

	abstract double getArea();

	abstract double getPerimeter();
}

class Circle extends GeometricObject {
	Scanner sc = new Scanner(System.in);
	double radius;

	Circle() {
	}

	Circle(double r, String c, boolean f) {
		radius = r;
		color = c;
		filled = f;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double rad) {
		System.out.println("Radius: " + radius);
	}

	double getDiameter() {
		return 2 * radius;
	}

	double getArea() {
		return 3.14f * radius * radius;
	}

	double getPerimeter() {
		return 2 * 3.14f * radius;
	}
}

class Rectangle extends GeometricObject {
	double weidth, height;

	Rectangle() {
	}

	Rectangle(double w, double h) {
		weidth = w;
		height = h;
	}

	Rectangle(double w, double h, String c, boolean f) {
		this(w, h);
		color = c;
		filled = f;
	}

	double getwidth() {
		return weidth;
	}

	void setwidth(double w) {
		System.out.println("Weidth: " + w);
	}

	double getHeigth() {
		return height;
	}

	void setHeight(double h) {
		height = h;
	}

	double getArea() {
		return weidth * height;
	}

	double getPerimeter() {
		return 2 * (weidth + height);
	}
}

public class TestGeometricObject {
	public static void main(String[] args) {
		Circle c = new Circle(11.23, "Yellow", false);
		Rectangle r = new Rectangle(12.3, 20.569, "Red", true);

		System.out.println("Rectangle:\n");
		System.out.println("Width: " + r.getwidth() + "\nHeight: " + r.getHeigth());
		System.out.println("Area of Rectangle: " + r.getArea() + "\nPerimeter of Rectangle: " + r.getPerimeter());
		System.out.println("\nCircle:\n");
		System.out.println("Radius: " + c.getRadius() + "\nDiameter: " + c.getDiameter());
		System.out.println("Perimeter of Circle: " + c.getPerimeter() + "\nArea of Circle: " + c.getArea());
	}
}
