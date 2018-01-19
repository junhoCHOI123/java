package exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			runMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Á¾·á");
	}

	private static void runMethod() throws Exception{
		System.out.println("runMethod block");
//		System.out.println(10/0);
		throw new NullPointerException();
	}
}

