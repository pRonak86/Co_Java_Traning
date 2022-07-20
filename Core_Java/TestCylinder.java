package com.test;

class Cylinder
{
	double rad, hei, PI = 3.14;

	Cylinder() {
		rad = 1;
		hei = 1;
	}

	Cylinder(double r) {
		rad = r;
	}

	Cylinder(double r, double h) {
		rad = r;
		hei = h;
	}

	double area() {
		return 2 * PI * rad * hei + 2 * PI * rad * rad;
	}
}

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		Cylinder c2 = new Cylinder(12.1);
		Cylinder c3 = new Cylinder(12, 13);
		System.out.print("\nFor default constructor:\n");
		System.out.println("Area of Cylinder : " + c1.area());

		System.out.print("\nFor constructor with one arg:\n");
		System.out.println("Area of Cylinder : " + c2.area());

		System.out.print("\nFor constructor with two arg:\n");
		System.out.println("Area of Cylinder : " + c3.area());
	}
}
