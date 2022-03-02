package lesson01; //패키지 선언부, 소싀의 첫줄로 선언
// default package의 경우는 패키지 선언부가 생략된다.

// class 선언부
// public 접근지정자
// class Test - Test라는 명의 class를 나타낸다. 클래스명은 파일명고 일치해야만 한다. 클래스명은 관용적으로 대분자로 시작한다.
public class Exam01 {
	
	// 메서드
	// static - 객체를 생성하지 않고도 실행가능
	// void - 리턴값이 없음을 의미
	// main - 자바는 반드시 1개의 메인 메서드가 있어야만 한다. 시작점
	// String[] - 배열을 의미 args 인수를 의미
	public static void main(String[] args) {
		// 시스템에서 내보낸다 프린트로 줄바꿔서
		// println : 인쇄후 줄바꿈
		// print : 인쇄
		System.out.print("Hello Java") ; // 복사 ctrl + alt + 위/아래
		System.out.println("Hello Java") ; // 이동 alt + 위/아래
		System.out.println("Hello Java") ;
		
		// print
		System.out.println("str" + "str") ;
		System.out.println(3.14) ;
		System.out.println(3 + 4) ;
		System.out.println("str" + 3) ;
		System.out.println("str" + 3 + 5) ; // 문자열이 오고난 후로는 문자로 취급된다.
		System.out.println(3 + 5 + "str" + 6 + 4) ;
		
		// int 정수형 변수 선언
		int a = 3;
		// string 문자열 변수 선언
		String b = "str";
		System.out.println(a);
		System.out.println(b);
		System.out.println(b + "str");
		System.out.println(a + b + "str");
		
		// 줄바꿈
		System.out.print("Hello Java\n") ; // 개행문자 \n
		System.out.print("Hello Java") ; 
		
		// printf()
		System.out.printf("%d\n", 30) ;
		System.out.printf("%f\n", 3.14) ;
		System.out.printf("%s\n", "출력") ;
	}
}

/*
자바에서 여러줄 주석 ctrl + shift + / 해제 단추키가 없다.
*/

//자바에서 한줄 주석 ctrl + /


