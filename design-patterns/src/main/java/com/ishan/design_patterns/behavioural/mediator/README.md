# Mediator Design Pattern (Java)

## Intent

**Define an object that encapsulates how a set of objects interact.**
Mediator promotes **loose coupling** by preventing objects from referring to each other explicitly and allows their
interaction logic to vary independently.

---

## Real-World Analogy

**WhatsApp / Chat Server**

* Users do **not** talk to each other directly
* Every message goes through a **central server**
* The server decides **who receives what**

👉 The server acts as the **Mediator**

---

## Problem It Solves

When multiple objects communicate directly with each other:

* Tight coupling between classes
* Complex dependency graphs
* Changes in one class ripple across many others
* Hard to maintain and extend

### Without Mediator

```java
userA.sendTo(userB);
userA.

sendTo(userC);
userB.

sendTo(userA);
```

Each user needs to know about every other user.

---

## Solution

Introduce a **Mediator** that:

* Knows all participants
* Handles all communication
* Participants talk **only to the mediator**
* Participants never talk to each other directly

---

## Structure

### Key Participants

1. **Mediator (Interface)**

    * Declares communication methods

2. **ConcreteMediator**

    * Implements coordination logic
    * Maintains references to participants

3. **Colleague (Abstract / Base Class)**

    * Holds reference to mediator
    * Sends/receives messages via mediator

4. **ConcreteColleague**

    * Implements actual behavior

---

## Mapping to This Example

| Concept            | Class                |
|--------------------|----------------------|
| Mediator           | `ChatMediator`       |
| Concrete Mediator  | `ChatMediatorImpl`   |
| Colleague          | `ChatClient`         |
| Concrete Colleague | `WhatsAppChatClient` |
| Domain Object      | `User`               |
| Client             | `MediatorMainApp`    |

---

## Flow Explained

1. A `User` registers via a `ChatClient`
2. `ChatClient` registers itself with `ChatMediator`
3. When a message is sent:

    * Client → Mediator
    * Mediator → All other registered clients
4. Clients receive messages **without knowing sender details**

---

## Key Benefits

* Loose coupling between communicating objects
* Centralized communication logic
* Easier to add new clients or rules
* Cleaner and more readable code

---

## Trade-Offs

* Mediator can become **too large / complex**
* Risk of creating a “God Object” if not designed carefully

---

## When to Use

* Many objects communicate in complex ways
* You want to avoid tight coupling
* Communication logic keeps growing
* You want centralized control of interactions

---

## One-Line Memory Hook

> **Mediator = Central brain that coordinates communication so objects don’t talk directly**


