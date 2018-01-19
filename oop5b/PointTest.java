package oop5b;

public class PointTest {
	public static void main(String[] args) {
		Point pt1 = Point.getInstance();
		Point pt2 = Point.getInstance();
		
		System.out.println(pt1.getClass());
		System.out.println(pt1.hashCode());
		System.out.println(pt1.toString());
		
		System.out.println(pt2.getClass());
		System.out.println(pt2.hashCode());
		System.out.println(pt2.toString());
	}
}
