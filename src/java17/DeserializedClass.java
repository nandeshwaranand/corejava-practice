package java17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

/**
 * Introduces a mechanism to define filters that control which classes can be deserialized.
 * Key Benefits:
 * Prevents security vulnerabilities caused by deserialization attacks.
 * Allows setting up class filters before deserialization.
 */
public class DeserializedClass {

    ObjectInputFilter filter = ObjectInputFilter.allowFilter(
            cl -> cl == PermitSavingAccount.class, ObjectInputFilter.Status.REJECTED);

    public DeserializedClass() throws IOException, ClassNotFoundException {

        System.out.println("Deserialized constructor called..");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"));
        in.setObjectInputFilter(filter);
        PermitSavingAccount obj = (PermitSavingAccount) in.readObject();
        obj.show();
    }

    public boolean print(){
        System.out.println("Deserialized print method called..");
        return false;
    }
}
