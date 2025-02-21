package oops.inheritance.abstraction;

public abstract class AbstractClass {

    public AbstractClass(){
        System.out.println("Abstract class instantiated");
    }

    public AbstractClass(int param){
        System.out.println("Abstract class parameter constructor called");
    }

    public void display(){
        System.out.println("Abstract class display method.");
    }
}
