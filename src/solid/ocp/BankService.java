package solid.ocp;

/**
 * Fixing OCP problem, keeping common methods and assigning single responsibility to the class
 * Fixed using OCP (Use Polymorphism)
 */
 abstract class BankService {

    abstract double calculateInterest();
}
