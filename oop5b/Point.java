package oop5b;

public class Point {
	private static Point point = null;
	
	public static Point getInstance() {
		if(point == null) {
			point = new Point();
		}
		
		return point;  //��ɸ� ���� ���� �ֵ���. point�� return
	}
	private Point() {}
	
}