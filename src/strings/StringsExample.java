package strings;

/**
 * Java used SCP(String constant Pool) to store the strings and its make sure string can not be duplicated in SCP
 * The String Constant Pool (SCP) in Java is a special memory area inside the heap where string literals are stored
 * to optimize memory usage and improve performance..
 */
public class StringsExample {

    public static void main(String[] args) {
        //stored in the String Pool
        String s = "Constant";
        String s2 = "Constant";
        // A new string object is created in heap (outside the pool) but "Constant" in the pool is reused
        String str = new String("Constant");
       // Manually add it to the pool, Now stored in the pool
        String str1 = str.intern();
        String st2 = "Constant Variable";

        System.out.println("s.equals(str): "+s.equals(str));
        System.out.println("s==s2:"+(s == s2));
        System.out.println("s==str:"+(s == str));
        System.out.println("str==str1:"+(str == str1));
        System.out.println("str.hashCode() == str1.hashCode():"+(str.hashCode() == str1.hashCode()));
    }
}
