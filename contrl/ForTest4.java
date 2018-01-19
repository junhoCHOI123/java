package contrl;

public class ForTest4 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println("3의 배수 합 : " + sum);
	}
}