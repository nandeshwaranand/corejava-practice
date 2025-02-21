package oops.inheritance;

public interface IParent2 {

   void show();

    default void add(int a, int b) {
        System.out.println("Parent 2 add method called. Result:"+(a+b));
    }
}
