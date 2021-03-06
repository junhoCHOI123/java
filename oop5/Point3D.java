package oop5;

public class Point3D extends Point2D{
	private int z;
	

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
		System.out.println("Point3D(x,y,z)수행중...");
	}

	public Point3D() {
		this(1, 1, 1);
		System.out.println("Point3D() 수행중...");
	}
	
	@Override
	public String toString() {
		return super.toString() +","+ z;
	}
}