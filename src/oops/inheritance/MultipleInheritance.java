package oops.inheritance;

/**
 * If you extend more than one parent class compiler will prompt the error because of multiple oops.inheritance not supported.
 * Multiple oops.inheritance can be achieved using interfaces
 * Rule:
 * 1. If both the interfaces contains the same abstract method then compiler will force to override the method,
 *    and implementation class method will be executed further.
 *    e.g., refer show method
 * 2. If interfaces contains different default method(Java8) then compiler will not force to override the method,
 *    depending on the type of interface object, default method will be called.
 *    e.g., IParent1 parent1 = new MultipleInheritance();
 *         parent1.sub(20,10);
 * If both the interfaces contains the same default method(Java8) then compiler will force to override the method,
 *    and implementation class method will be executed further. It's up to implementation class how overridden method is implemented
 *    e.g., refer add method
 */
public class MultipleInheritance implements IParent1, IParent2 {

    @Override
    public void show() {
        System.out.println("Multiple oops.inheritance subclass method");
    }

    @Override
    public void add(int a, int b) {
        IParent2.super.add(a, b); // calling parent 2 method
    }

    public static void main(String[] args) {
        IParent1 parent1 = new MultipleInheritance();
        parent1.show();
        parent1.add(10,20);
        parent1.sub(20,10);
    }
}
