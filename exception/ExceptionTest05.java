package exception;

public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			System.out.println("a() ȣ����");
			a();
			System.out.println("a()ȣ����");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("���� �޼����� catch��");
			e.printStackTrace();
		} finally {
			System.out.println("���� �޼����� finally��");
		}
		System.out.println("����Ϸ�");
	}

	public static void a() {
		try {
			System.out.println("b() ȣ����");
			b();
			System.out.println("b()ȣ����");
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("a�޼����� catch��");
			e.printStackTrace();
		} finally {
			System.out.println("a�޼����� finally��");
		}
	}

	public static void b() {
		try {
			System.out.println("c() ȣ����");
			int x = 1;
			int y = 0;
			int z;
			z = x / y;
			System.out.println(z);
			c();
			System.out.println("c()ȣ����");
		} catch (NumberFormatException e) {
			e.printStackTrace();

		} finally {
			System.out.println("b�޼����� finally��");
		}
	}

	public static void c() {
		try {
			System.out.println("d() ȣ����");
			d();
			System.out.println("d()ȣ����");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("c��");
		}
	}

	public static void d() {
		try {
			System.out.println("��������");
			int x = 1;
			int y = 1;
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("d��");
		}
	}
}
