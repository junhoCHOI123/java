package oop5;

public class Point2D {
	int x;
	int y;

	public Point2D() {	//constructor
		System.out.println("Point2D() 수행중...");
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) 수행중...");
	}

	@Override
	public String toString() {
		return x + "," + y;
	}
}
