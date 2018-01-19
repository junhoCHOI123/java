package oop5b;

public class Point {
	private static Point point = null;
	
	public static Point getInstance() {
		if(point == null) {
			point = new Point();
		}
		
		return point;  //기능만 갖다 쓸수 있도록. point를 return
	}
	private Point() {}
	
}