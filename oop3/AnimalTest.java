package oop3;

public class AnimalTest {
	public static void main(String[] args) {
//		Eagle eagle = new Eagle();
//		System.out.println(eagle);
		
//		Bird bird = new Eagle();	//upcasting - 자동형변환
//		System.out.println(bird);
		
//		Animal animal = new Eagle();
//		System.out.println(animal);
		
//		Bird bird = (Bird) animal;
//		System.out.println(bird);
		
		
//		Animal animal = new Bird();
//		System.out.println(animal);
		
//		Condor condor = (Condor) new Eagle();	//downcasting - 강제형변환
//		System.out.println(condor);
		
		Object object = new Tiger();
		System.out.println(object);
		if(object instanceof Tiger) {				//캐스팅 가능, 불가능 여부 알려줌.
			System.out.println("Tiger로 캐스팅 가능");
			Tiger tiger=(Tiger)object;
			System.out.println(tiger);
		}else {
			System.out.println("Tiger로 캐스팅 불가능");
		}
//		Tiger tiger = (Tiger)object;
//		System.out.println(tiger);
		
		
	}
}
