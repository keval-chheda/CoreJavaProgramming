package com.infra.designPattern;

//Shape.java
 interface Shape {
 void draw();
}

//Circle.java
 class Circle implements Shape {
  @Override
  public void draw() {
      System.out.println("Drawing a Circle");
  }
}

//Square.java
 class Square implements Shape {
  @Override
  public void draw() {
      System.out.println("Drawing a Square");
  }
}

//Rectangle.java
 class Rectangle implements Shape {
  @Override
  public void draw() {
      System.out.println("Drawing a Rectangle");
  }
}
 
//ShapeFactory.java
 class ShapeFactory {
  
  // Use getShape method to get the object of a specific shape type
  public Shape getShape(String shapeType) {
      if (shapeType == null) {
          return null;
      }
      if (shapeType.equalsIgnoreCase("CIRCLE")) {
          return new Circle();
      } else if (shapeType.equalsIgnoreCase("SQUARE")) {
          return new Square();
      } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
          return new Rectangle();
      }
      return null;
  }
}
 
//FactoryPatternDemo.java
public class FactoryPattern {

  public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      // Get an object of Circle and call its draw method
      Shape shape1 = shapeFactory.getShape("CIRCLE");
      shape1.draw();

      // Get an object of Square and call its draw method
      Shape shape2 = shapeFactory.getShape("SQUARE");
      shape2.draw();

      // Get an object of Rectangle and call its draw method
      Shape shape3 = shapeFactory.getShape("RECTANGLE");
      shape3.draw();
  }
}



