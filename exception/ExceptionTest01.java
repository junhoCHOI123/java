package exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		String str = null;
		
		
		try {
			System.out.println(str.toString());
			//throw new NullPointerException()
		} catch (NullPointerException e) {	//Exception e = new NullPointerException();
				e.printStackTrace();
		} catch (Error|Exception e) {	//Exception e = new NullPointerException();
			e.printStackTrace();
		} finally {		//예외가 발생하든, 하지 않든, 무조건 수행하고 싶은 것.
			System.out.println("finally");
		}
		
		System.out.println("종료");
	}
}