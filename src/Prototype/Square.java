package Prototype.Entity;

import Prototype.Shape;

/**
 * @author KIKOFranklin
 * @create 2021/4/4 0004 13:52
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
