package oops.abstraction;

public abstract class AbstractClass {

    protected AbstractClass(){
        System.out.println("Abstract class instantiated");
    }



    protected AbstractClass(int param){
        System.out.println("Abstract class parameter constructor called");
    }

    public void display(){
        System.out.println("Abstract class display method.");
    }
}
