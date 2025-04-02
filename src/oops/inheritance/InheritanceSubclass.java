package oops.inheritance;

/**
 * If you extend more than one parent class compiler will prompt the error because of multiple oops.inheritance not supported
 * e.g., class InheritanceSubclass extends ParentClass1, ParentClass2
 */
public class InheritanceSubclass extends ParentClass1 implements IParent1{

    @Override
    public void show() {
        System.out.println("Subclass show method..");
    }

    public static void main(String[] args) {
        InheritanceSubclass obj = new InheritanceSubclass();
        obj.show();
    }
}
