package contrl;

public class WhileTest2 {
	public static void main(String[] args) {
	int sum = 0;
	int i=1;
	
	while(i<=10000) 
	{
		if(i%3==0)
			sum+=i;
		i++;
	}
	System.out.println("3의 배수 합 : "+sum);
	}
}
