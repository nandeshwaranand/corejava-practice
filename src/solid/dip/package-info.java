package solid.dip;

/*
 *
 * DIP - Dependency Inversion Principle
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * To achieve that, you need to introduce an abstraction that decouples the high-level and low-level modules from each other.
 * Abstractions should not depend on details. Details should depend on abstractions.
 *
 * DIP used following design pattern
 * - Factory Pattern ensures high-level modules don’t depend on low-level modules directly.
 * - Dependency Injection (DI) injects dependencies at runtime instead of hardcoding them.
 * https://stackify.com/dependency-inversion-principle/
 */