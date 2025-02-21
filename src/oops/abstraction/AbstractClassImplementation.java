package oops.inheritance.abstraction;

/**
 * Rule:
 * 1. If you are creating explicit parameter constructor in abstract class that should be invoked
 * from the subclass if default constructor(no-args constructor) not present.
 * 2. If only default constructor(no-args constructor) present in abstract class then you don't need to
 * invoke constructor it will be automatically invoked.
 */
public class AbstractClassImplementation extends AbstractClass{

    AbstractClassImplementation(){
        super();
    }

    AbstractClassImplementation(int param){
        super(10);
        System.out.println("Subclass constructor called");
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClassImplementation(10);
        abstractClass.display();
    }
}
