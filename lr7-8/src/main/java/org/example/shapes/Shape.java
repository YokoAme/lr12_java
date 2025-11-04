package org.example.shapes;

public abstract class Shape {
 public String name;

 Shape(String name){
     this.name= name;
 }
    public abstract double calculateArea();
}
