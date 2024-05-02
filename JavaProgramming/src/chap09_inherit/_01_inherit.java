package chap09_inherit;

import chap09_inherit.car.Car;
import chap09_inherit.car.HyundaiCarInherit;
import chap09_inherit.car.KiaCarInherit;

public class _01_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 상속받은 자식 클래스 객체 생성
		HyundaiCarInherit hCar = new HyundaiCarInherit();
		
		// 2. 부모클래스인 Car의 속성과 기능 사용
		hCar.company = "현대";
		hCar.model = "제네시스";
		hCar.color = "검정";
		hCar.price = 5000;
		
		hCar.carInfo();
		
		// 3. 자식 클래스인 HundaiCarInherit의 고유한 속성이나 기능 사용
		hCar.autoPilot();
		
		KiaCarInherit kCar = new KiaCarInherit();
		
		kCar.company = "기아";
		kCar.model = "k9";
		kCar.color = "초록";
		kCar.price = 6000;
		
		kCar.carInfo();
		
		kCar.cruiseMode();
		
		// 4. 상속은 다형성의 기초
		// 다형성은 다양한 형태를 띠는 성질
		// 부모클래스 타입 변수에 여러 형태의 자식 객체를 담아서 사용할 수 있게 된다.
		// 객체 하나로 다양한 모습 (형태)로 사용 가능
		
		
		// 자식 객체 생성시 무조건 부모 생성자가 먼저 생성
		Car car = new HyundaiCarInherit();
		
		// 부모클래스 타입의 변수에서는 자식 클래스의 고유한 속성이나 기능은 사용하지 못한다.
//		car.autoPilot();
//		car.cruiseMod();
		
	}

}
