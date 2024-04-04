package com.javaex.ex01;

public class Ractangle extends Shape {
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	public int getWidth() {
		return width;
	}
	
//	public void showInfo(){
//		System.out.println("[사각형]#면색:" +super.fillColor+ " "
//				+ " #가로:" + width 
//				+" #세로:" + height + "그렸습니다.");                                                                        
//	}
	
	// 추상 클래스 상속시 내부의 추상 메서드는 반드시 구현
	@Override
	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
		

}


