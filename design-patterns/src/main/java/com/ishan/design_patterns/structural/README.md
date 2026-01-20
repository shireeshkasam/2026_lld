# Structural Design Patterns (Java)

Structural design patterns focus on **how classes and objects are composed** to form larger structures while keeping
them **flexible, efficient, and maintainable**.
They help answer the question:

> *How do I connect or organize existing components without changing their core behavior?*

---

## 1. Adapter

**What it is**
Converts the interface of a class into another interface that the client expects.

**When to use it (real-world signal)**

* You want to use an existing class, but its API does not match what your code expects
* Integrating third-party or legacy libraries without modifying them

**Example scenarios**

* Adapting a legacy payment gateway to a new payment interface
* Wrapping an old logging system to fit a new logging API

---

## 2. Bridge

**What it is**
Separates an abstraction from its implementation so both can evolve independently.
Bridge pattern avoids class explosion by separating what a class does from how it does it, allowing both to change
independently using composition.

**The Bridge**

`protected Engine engine;`

This line: Connects Car and Engine. It uses composition, not inheritance. It prevents tight coupling.

**Without Bridge (problem)**

If you used inheritance:

* PetrolSedan
* DieselSedan
* ElectricSedan
* PetrolSUV
* DieselSUV
* ElectricSUV

➡️ Class explosion
➡️ Any new engine multiplies car classes

**With Bridge (solution)**

* Add a new Car → no engine changes
* Add a new Engine → no car changes
* Both hierarchies evolve independently

That independence is the essence of Bridge.

**When to use it (real-world signal)**

* You see class explosion caused by multiple independent dimensions of variation
  (e.g., Car type × Engine type)
* You want to change or extend implementation details without modifying high-level business abstractions
* You want to combine different abstractions and implementations at runtime

**Example scenarios**

* Car types (Sedan, SUV) with multiple engine types (Petrol, Diesel, Electric)
* Message types (Text, Alert) abstraction with multiple delivery providers (SMS, Email, Push)

---

## 3. Composite

**What it is**
Treats individual objects and compositions of objects uniformly.

**When to use it (real-world signal)**

* You work with tree-like structures
* Clients should not care whether they are working with a single object or a group

**Example scenarios**

* File system (files and folders)
* UI components (buttons, panels, containers)

---

## 4. Decorator

**What it is**
Adds behavior to an object dynamically without modifying its class.

**When to use it (real-world signal)**

* You need optional or combinable features
* Inheritance would lead to too many subclasses

**Example scenarios**

* Adding compression or encryption to streams
* Enhancing notifications with logging, retry, or auditing

---

## 5. Facade

**What it is**
Provides a simplified interface to a complex subsystem.

**When to use it (real-world signal)**

* Clients depend on many classes and complex workflows
* You want to reduce coupling and hide internal complexity

**Example scenarios**

* One service coordinating multiple backend services
* Simplified API over a complex SDK

---

## 6. Flyweight

**What it is**
Reduces memory usage by sharing common object state.

**When to use it (real-world signal)**

* Large number of similar objects are created
* Memory or performance becomes a concern

**Example scenarios**

* Caching character objects in text editors
* Reusing configuration or metadata objects

---

## 7. Proxy

**What it is**
Provides a placeholder or surrogate for another object to control access to it.

**When to use it (real-world signal)**

* You need lazy loading, access control, or logging
* You want to add behavior before or after delegating calls

**Example scenarios**

* Lazy-loading large objects
* Security or rate-limiting around a service
* Remote service invocation

---

## Summary Table

| Pattern   | Primary Purpose                              |
|-----------|----------------------------------------------|
| Adapter   | Make incompatible interfaces work together   |
| Bridge    | Separate abstraction from implementation     |
| Composite | Treat individual and group objects uniformly |
| Decorator | Add behavior dynamically                     |
| Facade    | Simplify complex subsystems                  |
| Flyweight | Optimize memory usage                        |
| Proxy     | Control access to an object                  |

---

**Key takeaway**
Structural patterns are less about *what* a class does and more about *how objects are connected*.
If you find yourself struggling with **integration, layering, or object relationships**, a structural pattern is usually
the right tool.

---

