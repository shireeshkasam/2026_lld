# Factory Design Pattern (Creational)

This module demonstrates the **Factory Design Pattern** using multiple real-world use cases.
The focus is on understanding **Simple Factory**, its structure, benefits, and limitations,
before moving on to more advanced factory variants.

---

## What is the Factory Pattern?

The Factory Pattern is a **creational design pattern** that provides a way to create objects
without exposing the instantiation logic to the client.

Instead of creating objects using `new` directly, the client delegates object creation
to a factory class.

---

## Simple Factory (What is covered here)

The **Simple Factory** pattern centralizes object creation logic in a single factory class.
The client interacts only with:

- An **abstract base class / interface**
- A **factory method**

### Key Characteristics

- Centralized object creation
- Client depends on abstraction, not concrete classes
- Easy to understand and implement
- **Violates Open–Closed Principle (OCP)** when new types are added

---

## Project Structure

```

factory
├── laptop_example
│ ├── Laptop.java
│ ├── AppleLaptop.java
│ ├── DellLaptop.java
│ ├── HPLaptop.java
│ ├── LaptopBrand.java
│ ├── LaptopFactory.java
│ └── FactoryClient.java
│
└── usecase
├── document_example
│ ├── DocumentProcessor.java
│ ├── TextDocumentProcessor.java
│ ├── SpreadsheetDocumentProcessor.java
│ ├── PresentationDocumentProcessor.java
│ ├── DocumentType.java
│ └── DocumentProcessorFactory.java
│
├── audio_player_example
│ ├── AudioPlayer.java
│ ├── MP3Player.java
│ ├── WAVPlayer.java
│ ├── FLACPlayer.java
│ ├── MediaFormat.java
│ └── AudioPlayerFactory.java
│
└── notification_example
│ ├── Notification.java
│ ├── EmailNotification.java
│ ├── SmsNotification.java
│ ├── PushNotification.java
│ ├── NotificationType.java
└──── NotificationFactory.java

```

---

## Example 1: Laptop Factory (Basic Example)

### Problem

Create different laptop objects (HP, Dell, Apple) without exposing creation logic.

### Solution

- `Laptop` → abstract product
- Concrete implementations → `HPLaptop`, `DellLaptop`, `AppleLaptop`
- `LaptopFactory` → creates laptops based on `LaptopBrand` enum

### Key Learning

- Use of `enum` instead of `String`
- Centralized object creation
- Clean client code

---

## Example 2: Document Processing System

### Problem

Create document processors for different document types (Text, Spreadsheet, Presentation).

### Solution

- `DocumentProcessor` → common abstract parent
- Concrete processors per document type
- `DocumentProcessorFactory` creates processors based on `DocumentType`

### Key Learning

- Real-world use case
- Factory creates objects requiring constructor parameters
- Shows Simple Factory limitations clearly

---

## Example 3: Audio Player System

### Problem

Support multiple audio formats (MP3, WAV, FLAC) with different playback logic.

### Solution

- `AudioPlayer` → abstract base class
- Format-specific player implementations
- `AudioPlayerFactory` creates players based on `MediaFormat`

### Key Learning

- Factory handling multiple constructor arguments
- Consistent interface for different implementations

---

## Example 4: Notification System

### Problem

Send notifications using different channels (Email, SMS, Push).

### Solution

- `Notification` → abstract base
- Channel-specific notification classes
- `NotificationFactory` creates notifications based on `NotificationType`

### Key Learning

- Some constructor arguments apply only to specific types (Email sender)
- Demonstrates **design limitations of Simple Factory**
- Natural motivation for Factory Method or Builder pattern

---

## Limitations of Simple Factory (Important)

- Adding a new type requires:
    - New concrete class
    - New enum value
    - Modification of factory logic
- This violates the **Open–Closed Principle**
- Factory method signatures may become bloated

These limitations are **intentional learning points** and motivate:

- Factory Method
- Abstract Factory
- Builder Pattern

---

## Why This Structure?

- `factory` → pattern category
- `laptop_example` → simplest conceptual example
- `usecase` → real-world scenarios
- Each example is **self-contained**
- Easy comparison across use cases
- Interview-friendly layout

---

## Summary

This module focuses on:

- Understanding object creation problems
- Applying Simple Factory correctly
- Recognizing design trade-offs
- Preparing a strong foundation for advanced factory patterns
