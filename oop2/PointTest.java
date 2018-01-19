package oop2;

public class PointTest {
	public static void main(String[] args) {
		Point2D pt = new Point3D();
		pt.setX(100);
		pt.setY(200);
		//pt.setZ(300);
		
		pt.print();
		
		Point3D pt2 = (Point3D) pt;
		pt2.setX(1000);
		pt2.setY(2000);
		pt2.setZ(3000);
	}
}