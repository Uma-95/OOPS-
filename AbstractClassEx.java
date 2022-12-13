 
//  1. Write a java program to create an abstract class named Shape that contains two integers 
//  and an empty method named print Area(). Provide three classes named Rectangle, 
//  Triangle and Circle such that each one of the classes extends the class Shape. Each one of 
//  the classes contain only the method print Area( ) that prints the area of the given shape.

 abstract class Shape {
    abstract double printArea();
}

 class Rectangle extends Shape{
    double l;double b;
    public Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
double printArea(){
    return  l*b;
}
}
 class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r=r;
    }
double printArea(){
    return  3.14*r*r;
}
}
 class Triangle extends Shape{
    double base;double h;
    public Triangle(double base,double h){
        this.base=base;
        this.h=h;
    }
double printArea(){
    return  0.5*base*h;
}
}
class AbstractClassEx{
    public static void main (String []args){
        Circle c1=new Circle(4);
        Rectangle r1=new Rectangle(4,5);
        Triangle t1=new Triangle(4,5);
        System.out.println(c1.printArea());
         System.out.println(t1.printArea());
          System.out.println(r1.printArea());
    }
}

