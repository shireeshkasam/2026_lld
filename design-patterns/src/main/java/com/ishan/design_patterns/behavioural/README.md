``# Behavioral Design Patterns (Java)

Behavioral design patterns focus on **how objects communicate and collaborate**.
They help manage **responsibilities, interactions, and control flow** between objects while keeping the system flexible
and easy to extend.

They answer the question:

> *How do objects talk to each other without becoming tightly coupled?*

---

## 1. Strategy

**What it is**  
Defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.

**When to use it (real-world signal)**

* You have multiple ways of doing the same task
* You see large `if-else` or `switch` blocks selecting behavior

**Example scenarios**

* Different payment methods (Card, UPI, Wallet)
* Sorting strategies (QuickSort, MergeSort)

---

## 2. Observer

**What it is**  
Defines a one-to-many dependency so when one object changes state, all its dependents are notified automatically.

**When to use it (real-world signal)**

* Multiple components need to react to a single event
* You want loose coupling between event source and listeners

**Example scenarios**

* Event listeners in UI frameworks
* Notification systems (email, SMS, push)

---

## 3. Command

**What it is**  
Encapsulates a request as an object, allowing you to parameterize clients with different requests.

**When to use it (real-world signal)**

* You want to decouple sender and receiver
* You need undo/redo or request queuing

**Example scenarios**

* Remote controls triggering actions
* Transaction or job queues

---

## 4. Chain of Responsibility

**What it is**  
Passes a request along a chain of handlers until one of them handles it.

**When to use it (real-world signal)**

* Multiple objects can handle a request
* You want to avoid tight coupling between sender and handler

**Example scenarios**

* Logging frameworks (INFO → DEBUG → ERROR)
* Approval workflows

---

## 5. State

**What it is**  
Allows an object to alter its behavior when its internal state changes.

**When to use it (real-world signal)**

* Behavior changes based on state
* You see state-based `if-else` logic everywhere

**Example scenarios**

* Order lifecycle (New, Paid, Shipped, Delivered)
* Media player states (Play, Pause, Stop)

---

## 6. Template Method

**What it is**  
Defines the skeleton of an algorithm in a base class while allowing subclasses to override specific steps.

**When to use it (real-world signal)**

* Overall process is fixed
* Certain steps vary across implementations

**Example scenarios**

* Data processing pipelines
* Framework lifecycle methods

---

## 7. Iterator

**What it is**  
Provides a way to access elements of a collection sequentially without exposing its internal structure.

**When to use it (real-world signal)**

* You want consistent traversal across different collections
* You want to hide internal representation

**Example scenarios**

* Iterating over lists, trees, or custom collections
* Java Collections Iterator

---

## 8. Mediator

**What it is**  
Defines an object that encapsulates how a set of objects interact.

**When to use it (real-world signal)**

* Many objects communicate in complex ways
* Direct references create tight coupling

**Example scenarios**

* Chat rooms
* UI components coordinating via a controller

---

## 9. Memento

**What it is**  
Captures and restores an object’s internal state without violating encapsulation.

**When to use it (real-world signal)**

* You need undo/rollback functionality
* State history must be preserved safely

**Example scenarios**

* Text editor undo feature
* Game checkpoints

---

## 10. Visitor

**What it is**  
Separates algorithms from the objects on which they operate.

**When to use it (real-world signal)**

* You need to perform many unrelated operations on a stable object structure
* Adding operations is more frequent than adding new object types

**Example scenarios**

* Operations on ASTs
* Reporting or analytics on object structures

---

## Summary Table

| Pattern                 | Primary Purpose                          |
|-------------------------|------------------------------------------|
| Chain of Responsibility | Pass requests through handlers           |
| Command                 | Encapsulate requests as objects          |
| Iterator                | Traverse collections uniformly           |
| Mediator                | Centralize object communication          |
| Observer                | Notify multiple objects of state changes |
| Memento                 | Capture and restore state                |
| Strategy                | Swap algorithms at runtime               |
| State                   | Change behavior based on state           |
| Template Method         | Define algorithm skeleton                |
| Visitor                 | Add operations without changing classes  |

---

## Key Takeaway

Behavioral patterns are about **communication and responsibility distribution**.
If your problem involves **who does what, when, and how objects coordinate**, a behavioral pattern is usually the right
choice.
