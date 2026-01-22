# Template Design Pattern – Game Example (Java)

## Intent (What it is)

The **Template Design Pattern** defines the **skeleton of an algorithm** in a base class and lets subclasses **customize
specific steps** of that algorithm **without changing its overall structure**.

---

## Problem It Solves

When multiple classes follow the **same workflow** but differ in **certain steps**, duplicating the full flow in each
class leads to:

- Code duplication
- Inconsistent behavior
- Hard-to-maintain logic

---

## Solution

- Put the **common algorithm structure** in an abstract base class.
- Mark the algorithm method as `final` to prevent modification.
- Let subclasses override only the **variable steps**.

---

## Example: Game Lifecycle

All games follow the same lifecycle:

1. Initialize the game
2. Start the game
3. End the game

The **order must never change**, but the **implementation of each step can vary**.

---

## Structure

```

template/
└── gameexample/
├── Game.java // Abstract template
├── CricketGame.java // Concrete implementation
├── FootballGame.java // Concrete implementation
└── TemplateClientApplication.java

```

---

## Key Components

### 1. Abstract Template (`Game`)

- Defines the algorithm (`play()`)
- Declares abstract steps (`initialize`, `start`, `end`)
- Enforces execution order

### 2. Concrete Classes (`CricketGame`, `FootballGame`)

- Implement game-specific behavior
- Do NOT change the algorithm flow

### 3. Client (`TemplateClientApplication`)

- Works with the abstract class
- Can switch implementations at runtime

---

## Execution Flow

```

play()
├── initialize()
├── start()
└── end()

```

The client calls **only `play()`**, never the individual steps.

---

## Output (Example)

```

Playing game...
Cricket game initialized! Start playing.
Cricket game started. Enjoy the game!
Cricket game finished!
======================

Playing game...
Football game initialized! Start playing.
Football game started. Enjoy the game!
Football game finished!

```

---

## When to Use Template Pattern

- When multiple classes share a **common workflow**
- When the **sequence of steps must be fixed**
- When subclasses should customize behavior **without altering structure**

---

## Key Takeaways

- Algorithm structure is **locked** in the base class
- Customization happens via **inheritance**
- Promotes **code reuse** and **consistent behavior**

---

## One-Line Summary

> **Template Pattern = fixed algorithm + customizable steps**
