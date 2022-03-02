package lesson01;

public class Exam06 {
	public static void main(String[] args) {
		// 문자 저장 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3'; // 숫자가 아닌 문자 3
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();
		
		// 숫자로 문자 저장
		char value4 = 65;
		System.out.println(value4);
		System.out.println();
		
		// 유니코드로 문자 저장
		char value5 = '\u0065';
		System.out.println(value5);
		System.out.println();
		
		/*
		 * 형변환 type casting
		 * boolean을 제외한 기본 자료형은 서로 형을 변환할 수 있다.
		 * 변환시 저장할 수 있는 값의 볌위나 종류가 달라지므로 값이 변할 수 있다.
		 */
		int value6 = (int)5.3 ;
		
		System.out.println(value6);
		
		/*
		 * 타입변화에는 자바가 자동으로 수행하는 '자동타입변환'과 개발자가 직접
		 * 수행하는 '수동타입변환'이 있다. 크기가 작은 자료형을 큰 자료형으로
		 * 타입변환할 때는 손실이 발생하지 않는다.
		 */
		float value7 = 3; // int -> float 업캐스팅
		long value8 = 5; // int -> long 업캐스팅
		
		// int value9 = 3.5; // double -> int 다운캐스팅(x)
		int value10 = (int)3.5;
		// 실수의 기본형은 double형이다.
		// float value11 = 7.5; 
		float value12 = (float)7.5;
		float value13 = 7.5F;
		
		// 자료형 간의 연산
		int value14 = 3 + 5;
		int value15 = 8 / 5;
		float value16 = 3.0f + 5.0f;
		double value17 = 8.0 / 5.0;
		
		// 최소연산단위인 int보다 작은 자료형끼리의 연산은 결과값이 int로 나온다.
		byte data1 = 3;
		byte data2 = 5;
		
//		byte data = data1 + data2; 
		int data = data1 + data2;
		
		// 결과값이 double이므로 에러
//		int value18 = 5 + 3.5;
		double value19 = 5 + 3.5;
	}

}


