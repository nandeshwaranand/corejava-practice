package solid.lsp;

/*
 * LSP -  Liskov Substitution Principle
 * A subclass should be substitutable for its superclass.
 * It extends the Open/Closed Principle by focusing on the behavior of a superclass and its subtypes.
 * The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
 * That requires the objects of your subclasses to behave in the same way as the objects of your superclass.
 * An overridden method of a subclass needs to accept the same input parameter values as the method of the superclass.
 * That means you can implement less restrictive validation rules, but you are not allowed to enforce stricter ones in your subclass.
 * Otherwise, any code that calls this method on an object of the superclass might cause an exception, if it gets called with an object of the subclass.
 *
 * The Liskov Substitution Principle (LSP) in SOLID is closely related to
 * - Strategy Pattern ensures that objects can be replaced without modifying behavior.
 * - Template Method Pattern enforces a common structure while allowing specific implementations.
 * https://stackify.com/solid-design-liskov-substitution-principle/
 */