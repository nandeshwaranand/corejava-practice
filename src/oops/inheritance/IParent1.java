package oops.inheritance;

public interface IParent1 {

    void show();

    default void add(int a, int b) {
        System.out.println("Parent 1 add method called. Result:"+(a+b));
    }

    default void sub(int a, int b) {
        System.out.println("Parent 1 sub method called. Result:"+(a+b));
    }
}
