package oops.polymorphism;

public class PolyParentClass {

    public static final int b = 40;

    public void methodOverride(int a){
        int result = a + b;
        System.out.println("Parent class 1 methodOverride called result:"+result);
    }

    //same method name different parameters
    public void methodOverload(float a){
        System.out.println("Parent class 1 methodOverload called with integer.");
    }

    public void methodOverload(long param){
        System.out.println("Parent class 1 methodOverload called with long.");

    }
}
