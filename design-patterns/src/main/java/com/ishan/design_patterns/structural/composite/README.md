## Composite Pattern – File System Example

### What it is

Composite pattern allows you to treat individual objects and groups of objects uniformly.

### Problem (Before Composite)

- Client code depends on concrete classes
- Uses instanceof checks
- Adding new node types requires modifying existing logic

### Solution (After Composite)

- Introduce a common component interface
- Both File and Directory implement the same abstraction
- Client works with a tree structure polymorphically

### When to use it

- You have tree-like structures
- You want clients to treat single objects and compositions the same way

### Real-world examples

- File systems (files & folders)
- UI components (buttons, panels, containers)
- Organization hierarchies
