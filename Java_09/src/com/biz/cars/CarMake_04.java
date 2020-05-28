package com.biz.cars;

import com.biz.classis.Car;

public class CarMake_04 {

	public static void main(String[] args) {
		
		Car 소나타 = new Car();
		Car 그랜져 = new Car();
		
		소나타.자동차이름 = "소나타";
		그랜져.자동차이름 = "그랜져";
		
		/*
		 * 1. 소나타가 전진합니다
		 * 2. 그랜져가 전진합니다
		 * 3. 소나타가 후진합니다
		 * 4. 그랜져는 좌회전 합니다
		 * 5. 소나타가 멈춥니다.
		 * 6. 그랜져가 후진을 합니다.
		 * 7. 소나타가 전진을 합니다.
		 */
		소나타.전진();
		그랜져.전진();
		소나타.후진();
		그랜져.좌();
		소나타.멈춤();
		그랜져.후진();
		소나타.전진();
		그랜져.우();
		소나타.좌();
		소나타.우();
		
		/*
		 * Car 클래스를 사용해서 생성된 소나타 객체를 만들게 되면
		 * Car 클래스에 선언된 method를 소나타의 method 명령문처럼
		 * 사용할수 있다.
		 * 
		 * method의 호출, method의 사용
		 * 
		 */
		소나타.주차();
		그랜져.주차();
	
	}
}
