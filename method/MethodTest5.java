package method;

public class MethodTest5 {
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(4, 5, 6);

	}

	private static void print(int... i) {
		for (int j : i) {
			System.out.print(j + "\t");
		}
		System.out.println();
	}

}
