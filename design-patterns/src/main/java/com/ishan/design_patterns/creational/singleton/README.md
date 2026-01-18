# Singleton Design Pattern

This module provides a **complete and structured exploration of the Singleton design pattern**,
covering implementation variants, common failure scenarios, hardened implementations,
and a real-world use case.

The goal is not only to show *how* Singleton is implemented,
but also *how it breaks*, *how it can be protected*, and *where it is actually used*.

---

## 📁 Package Structure

```

singleton
├── variants
│ ├── EagerSingleton
│ ├── LazySingleton
│ ├── ThreadSafeSingleton
│ ├── DoubleCheckedLockingSingleton
│ ├── BillPughSingleton
│ └── EnumSingleton
│
├── breakage
│ ├── LazySingletonThreadBreakDemo
│ ├── BrokenSynchronizedBlockSingletonDemo
│ ├── CloneBreakSingletonDemo
│ ├── ReflectionBreakSingletonDemo
│ └── SerializationBreakSingletonDemo
│
├── safe
│ ├── RobustDoubleCheckedLockingSingleton
│ └── RobustBillPughSingleton
│
└── usecase
└──── connectionpool
├────── DatabaseConnection
├────── ConnectionPool
└────── ConnectionPoolImpl

```

---

## 🔹 `variants`

Different ways to implement the Singleton pattern.

- **EagerSingleton** – Instance created at class load time
- **LazySingleton** – Instance created on first access (not thread-safe)
- **ThreadSafeSingleton** – Synchronized access
- **DoubleCheckedLockingSingleton** – Optimized thread-safe lazy initialization
- **BillPughSingleton** – Initialization-on-demand holder idiom (recommended non-enum)
- **EnumSingleton** – Simplest and safest approach

---

## 🔹 `breakage`

Demonstrates **how Singleton can fail** if not implemented carefully.

- Multithreading race conditions
- Incorrect synchronization
- Cloning
- Reflection
- Serialization

Each class is a runnable demo showing how multiple instances can be created.

---

## 🔹 `safe`

Hardened Singleton implementations that defend against:

- Multithreading
- Reflection
- Serialization
- Cloning

These are **non-enum defensive implementations** created for learning and comparison.

---

## 🔹 `usecase`

A **real-world application** of Singleton.

### Connection Pool

- Combines **Singleton + Object Pool** patterns
- Uses `BlockingQueue` for thread-safe connection management
- Demonstrates *why* Singleton is commonly used in infrastructure components

---

## 🧠 Key Takeaways

- Singleton controls object creation, not just access
- Thread safety must be explicitly handled
- Reflection, cloning, and serialization can break naive implementations
- **Enum Singleton is the only 100% safe Singleton in Java**
- **Bill Pugh Singleton is the best non-enum choice in practice**

---

## ✅ Recommendation

- Prefer **EnumSingleton** when possible
- Prefer **BillPughSingleton** for clean, lazy, non-enum usage
- Avoid overusing Singleton — hidden global state is a design smell
