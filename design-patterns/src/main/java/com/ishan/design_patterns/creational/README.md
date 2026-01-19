# Creational Design Patterns (Java)

Creational design patterns focus on **how objects are created**.
They help manage **object instantiation complexity**, improve **decoupling**, and ensure object creation is *
*controlled, consistent, and flexible**.

Instead of creating objects directly using `new`, these patterns guide *when, where, and how* objects should be created.

---

## 1. Singleton

**What it is**
Ensures that a class has only one instance and provides a global access point to it.

**When to use it (real-world signal)**

* Exactly one instance must coordinate behavior
* Shared state or centralized configuration is required

**Example scenarios**

* Configuration manager
* Application-level cache
* Thread pool manager

---

## 2. Factory Method

**What it is**
Defines an interface for creating an object but lets subclasses decide which class to instantiate.

**When to use it (real-world signal)**

* Object creation logic varies by context
* You want to defer instantiation to subclasses

**Example scenarios**

* Document processors based on document type
* Notification creation based on channel

---

## 3. Abstract Factory

**What it is**
Provides an interface for creating families of related objects without specifying their concrete classes.

**When to use it (real-world signal)**

* Multiple related objects must be created together
* Switching entire product families should be easy

**Example scenarios**

* UI components for different platforms
* Document processing pipelines for different formats

---

## 4. Builder

**What it is**
Separates the construction of a complex object from its representation.

**When to use it (real-world signal)**

* Objects have many optional fields
* Constructor overloading becomes unreadable

**Example scenarios**

* Immutable objects with optional attributes
* Request or response objects

---

## 5. Prototype

**What it is**
Creates new objects by copying an existing object.

**When to use it (real-world signal)**

* Object creation is expensive
* You want to avoid complex construction logic

**Example scenarios**

* Cloning configuration templates
* Copying complex objects with predefined state

---

## Summary Table

| Pattern          | Primary Purpose                        |
|------------------|----------------------------------------|
| Singleton        | Ensure a single shared instance        |
| Factory Method   | Defer object creation to subclasses    |
| Abstract Factory | Create related object families         |
| Builder          | Construct complex objects step-by-step |
| Prototype        | Clone existing objects                 |

---

**Key takeaway**
Creational patterns reduce tight coupling by **abstracting object creation**.
If you find your code tightly bound to constructors or complex initialization logic, a creational pattern is often the
right choice.

---

