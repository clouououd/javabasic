package lesson01;

public class Exam04 {
	public static void main(String[] args) {
	int value1 = 3 ; // value1 변수 생성
	{
		int value2 = 5; // value2 변수 생성
		System.out.println(value1);
		System.out.println(value2);
	} // value2 변수 소멸
	System.out.println(value1);
//	System.out.println(value2);	
} // value1 변수 소멸

}
