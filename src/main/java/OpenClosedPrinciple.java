public class OpenClosedPrinciple {
    public static void main(String[] args) {

    }
}
class AreaCalculator {

    private void squareArea(Double height, Double width) {
        System.out.println(height * width);
    }

    private void circleArea(Double radius) {
        System.out.println(radius * radius * 3.14);
    }
}
//this principle is important to avoid changing logic of a method whenever the element being tested changes. this is where polymorphism, interfaces and abstraction come in. that way they can inherit the general methods and also the methods can be
//overriden in their classes.
//opened for extension meaning (triange, circle and rectangle) can extend parent class shape
//but closed for modification meaning we wont have to change the logic of the method everytime a new shape comes up.
//see example below;
class AreaCalculator2 {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
}

interface Shape {
    void calculate();
}


class Rectangle implements Shape {
    public Double height;
    public Double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}


class Circle implements Shape {
    public Double radius;

    @Override
    public void calculate() {
        System.out.println(radius * radius * 3.14);
    }
}