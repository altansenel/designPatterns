package com.decorator;

public abstract class ShapeDecorator implements Shape {
	
	protected Shape decoratedShape;//extends eden sınıf da görsün diye

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}

	
//	public Shape getDecoratedShape() {
//		return decoratedShape;
//	}
//
//	public void setDecoratedShape(Shape decoratedShape) {
//		this.decoratedShape = decoratedShape;
//	}

}
