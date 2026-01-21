# Chain of Responsibility Design Pattern

## Intent (Meaning)

Pass a request through a chain of handlers where each handler decides **whether it can handle the request** or forwards it to the next handler.
**The request is handled by exactly one handler.**

---

## Problem It Solves

Avoids **large `if-else` / `switch` ladders** used for request filtering based on configuration.

### Without this pattern

```java
if (configuredLevel == DEBUG) {
    if (messageLevel == DEBUG) logDebug();
    if (messageLevel == INFO)  logInfo();
    if (messageLevel == ERROR) logError();
} else if (configuredLevel == INFO) {
    if (messageLevel == INFO)  logInfo();
    if (messageLevel == ERROR) logError();
} else if (configuredLevel == ERROR) {
    if (messageLevel == ERROR) logError();
}
```

❌ Problems:

* Nested conditional logic
* Hard to extend (new level = code changes)
* Configuration and handling logic mixed
* Violates Open/Closed Principle

---

## With Chain of Responsibility

Each handler:

* Knows **only one log level**
* Decides whether it can handle the request
* Forwards the request **only if it cannot handle it**
* Stops the chain once handled

✔️ No nested `if-else`
✔️ Each log printed **only once**
✔️ Configuration separated from handling
✔️ Easy to add new levels (e.g. WARN)

---

## Structure

* **Handler (abstract class)**
  Defines the logging interface and holds reference to the next handler
* **Concrete Handlers**
  Handle exactly one log level
* **Factory / Client**
  Builds the chain and decides the **entry point** based on configuration

---

## Real-Life Use Cases

* Logging frameworks (level-based filtering)
* Authentication checks (first failure stops processing)
* Validation pipelines
* Request routing
* Middleware / filter chains

---

## Example in This Project

### Logging system (single print behavior)

* Configured level = `DEBUG`

  * DEBUG → printed
  * INFO → printed
  * ERROR → printed

* Configured level = `INFO`

  * DEBUG → ignored
  * INFO → printed
  * ERROR → printed

* Configured level = `ERROR`

  * DEBUG → ignored
  * INFO → ignored
  * ERROR → printed

Each log request is handled **by exactly one handler**.

Chain structure:

```
DEBUG → INFO → ERROR
```

The **configured log level decides where the chain starts**.

---

## Key Insight (Easy to Remember)

> **Configuration decides the entry point.
> The request stops at the first matching handler.**

---

## When to Use

* Exactly one handler should process the request
* Order of handlers matters
* You want to avoid conditional explosion
* You want to follow Open/Closed Principle

---

## When NOT to Use

* All handlers must always process the request (use Observer instead)
* Handler order is unpredictable
* Chain length is extremely large and performance is critical

