package oops.polymorphism;

/**
 * 1. Method overload happen at compile time
 * 2. Method overriding happen at runtime
 * Depend on the type of object created, method will be overridden and called
 */
public class PolymorphismExample extends PolyParentClass {

    public static final int b = 20;

    public void methodOverride(int a){
        int result = a + b;
        System.out.println("Polymorphism subclass method overridden result:"+result);
    }

    public static void main(String[] args) {
        PolyParentClass polymorphism = new PolymorphismExample();
        polymorphism.methodOverload(10.10F);
        polymorphism.methodOverload(10L);
        polymorphism.methodOverride(10);
    }
}
