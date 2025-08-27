package org.example;

public class Rectangle {

    private double base;
    private double height;
    public static char style = '*';

    public Rectangle() {

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.base*this.height;
    }

    public double getPerimeter() {
        return 2 * (this.base + this.height);
    }

    public void print() {
        for(int i=0; i<this.height; i++){
            for(int j=0; j<this.base; j++){
                System.out.print(Rectangle.style);
            }
            System.out.println();
        }
        System.out.printf("Base: %.2f , Height: %.2f , Area: %.2f%n",
                this.base, this.height, this.getArea());
    }

}
