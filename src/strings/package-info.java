package strings;

/**
 * the String Constant Pool (also known as the String Pool) is a part of the heap memory in Java, but with a specific distinction.
 * Here’s how it works:
 * Heap Memory: In Java, the heap is where all objects are stored, including instances of classes like arrays, user-defined objects, etc. The String Constant Pool is a special area within the heap dedicated to storing unique string literals.
 * String Pool: When you create a string literal (e.g., "hello"), Java first checks the String Constant Pool to see if that literal already exists. If it does, the reference to the existing string is returned, thus saving memory and ensuring that there is only one instance of each string literal.
 * Interned Strings: Strings stored in the String Pool are sometimes referred to as interned strings. When you explicitly call the intern() method on a string, it checks the pool and returns the string if it exists or adds it if it does not.
 *
 * Key Points:
 * Yes, the String Constant Pool is stored in the heap memory.
 * However, it's a special area within the heap that is managed differently from other objects.
 * Only string literals and interned strings are placed in this pool.
 */