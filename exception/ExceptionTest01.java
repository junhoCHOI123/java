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
		} finally {		//���ܰ� �߻��ϵ�, ���� �ʵ�, ������ �����ϰ� ���� ��.
			System.out.println("finally");
		}
		
		System.out.println("����");
	}
}