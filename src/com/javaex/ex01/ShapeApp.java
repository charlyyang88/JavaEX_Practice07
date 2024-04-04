package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {
		// Shape 클래스는 추상 클래스이므로 직접적으로 인스턴스화(객체화)할 수 없습니다.
//		Shape s = new Shape("빨강");

		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		//sr1의 가로크기 출력	
        //sr1은 Shape 타입으로 선언되었으므로 Shape 클래스의 메서드만 사용 가능합니다.
        //따라서 sr1을 Ractangle 타입으로 형변환한 후 가로크기를 출력해야 합니다.
		// 다운 캐스팅
        if (sr1 instanceof Ractangle) {
            int width = ((Ractangle) sr1).getWidth();
            System.out.println("sr1의 가로 크기: " + width);
        }
	}
}

	
	