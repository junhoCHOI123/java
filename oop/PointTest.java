package oop;

public class PointTest {
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);

		System.out.println("x : " + pt.getX());
		System.out.println("y : " + pt.getY());
		System.out.println("z : " + pt.getZ());
	}
}
