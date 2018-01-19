package method;

public class MethodTest1 {
	public static void main(String[] args) {
		print();
		print("hi");

		int a = 5;
		int b = 3;
		System.out.println(a + "+" + b + "=" + add(a, b));
		System.out.println(a + "-" + b + "=" + sub(a, b));
		System.out.println(a + "*" + b + "=" + mul(a, b));
		System.out.println(a + "%" + b + "=" + div(a, b) + "..." + mod(a, b));
		System.out.println("주사위의 값은 " + getDice());

	}

	private static int getDice() {
		return (int) (Math.random() * 6 + 1);
	}

	private static int mod(int a, int b) {
		int result = a % b;
		return result;
	}

	private static int div(int a, int b) {
		int result = a / b;
		return result;
	}

	private static int mul(int a, int b) {
		int result = a * b;
		return result;
	}

	private static int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

	private static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	private static void print(String name) {
		System.out.println("hello~" + name);
		return;
	}

	private static void print() {
		System.out.println("hello");
	}
}
