# Java Collections Examples (ListExample)

A small set of Java programs demonstrating basic collection operations, written for Boston University METCS622.

## Project Structure

```
.
└── ListExample/
    ├── ArrayListExample.java
    ├── QueueExample.java
    └── GenericClass.java
```

## Requirements

- Java JDK 8 or higher

## Files

### 1. `ArrayListExample.java`
Demonstrates common `ArrayList<String>` operations:
- Iterate and print all elements (enhanced for-loop)
- Find the index of `"BU"`, `"METCS622"`, and `"test1"` with `indexOf()`
- Check membership of `"test3"` with `contains()`
- Remove `"foo"` and `"bar"` with `remove()`

### 2. `QueueExample.java`
Demonstrates the `Queue<String>` interface using a `LinkedList`:
- Add `"x"`, `"y"`, `"z"` with `offer()`
- Remove two elements from the head with `poll()` (FIFO order)
- Print the queue before and after removal

### 3. `GenericClass.java`
An empty placeholder class with a default constructor. It has no `main` method and is not runnable on its own.

## How to Compile and Run

From the project root (the folder containing `ListExample/`):

```bash
javac ListExample/*.java

java ListExample.ArrayListExample
java ListExample.QueueExample
```

## Expected Output

**ArrayListExample**
```
List contents:
foo
bar
test1
test2
METCS622
BU
Boston University

'BU' is found at position: 5

'METCS622' is found at position: 4
'test1' is found at position: 2

'test3' is not present in the list.

Updated list after removing 'foo' and 'bar':
test1
test2
METCS622
BU
Boston University
```

**QueueExample**
```
Queue after adding elements: [x, y, z]
Queue after removing two elements: [z]
```

## Key Concepts

| Method | Class/Interface | Purpose |
|---|---|---|
| `add(E e)` | `ArrayList` | Append an element |
| `indexOf(Object o)` | `ArrayList` | Index of first match, or `-1` if absent |
| `contains(Object o)` | `ArrayList` | `true` if element exists |
| `remove(Object o)` | `ArrayList` | Remove first matching element |
| `offer(E e)` | `Queue` | Insert at the tail |
| `poll()` | `Queue` | Remove and return the head (`null` if empty) |

## Notes

- `ArrayList` indexes start at **0**; after a removal, later elements shift left.
- `Queue` is first-in, first-out (FIFO). `LinkedList` is one common implementation.
- `poll()` returns `null` on an empty queue instead of throwing an exception.

## Author

Bhargav Sai Gundapaneni, Boston University# Java Collections Examples (ListExample)

A small set of Java programs demonstrating basic collection operations, written for Boston University METCS622.

## Project Structure

```
.
└── ListExample/
    ├── ArrayListExample.java
    ├── QueueExample.java
    └── GenericClass.java
```

## Requirements

- Java JDK 8 or higher

## Files

### 1. `ArrayListExample.java`
Demonstrates common `ArrayList<String>` operations:
- Iterate and print all elements (enhanced for-loop)
- Find the index of `"BU"`, `"METCS622"`, and `"test1"` with `indexOf()`
- Check membership of `"test3"` with `contains()`
- Remove `"foo"` and `"bar"` with `remove()`

### 2. `QueueExample.java`
Demonstrates the `Queue<String>` interface using a `LinkedList`:
- Add `"x"`, `"y"`, `"z"` with `offer()`
- Remove two elements from the head with `poll()` (FIFO order)
- Print the queue before and after removal

### 3. `GenericClass.java`
An empty placeholder class with a default constructor. It has no `main` method and is not runnable on its own.

## How to Compile and Run

From the project root (the folder containing `ListExample/`):

```bash
javac ListExample/*.java

java ListExample.ArrayListExample
java ListExample.QueueExample
```

## Expected Output

**ArrayListExample**
```
List contents:
foo
bar
test1
test2
METCS622
BU
Boston University

'BU' is found at position: 5

'METCS622' is found at position: 4
'test1' is found at position: 2

'test3' is not present in the list.

Updated list after removing 'foo' and 'bar':
test1
test2
METCS622
BU
Boston University
```

**QueueExample**
```
Queue after adding elements: [x, y, z]
Queue after removing two elements: [z]
```

## Key Concepts

| Method | Class/Interface | Purpose |
|---|---|---|
| `add(E e)` | `ArrayList` | Append an element |
| `indexOf(Object o)` | `ArrayList` | Index of first match, or `-1` if absent |
| `contains(Object o)` | `ArrayList` | `true` if element exists |
| `remove(Object o)` | `ArrayList` | Remove first matching element |
| `offer(E e)` | `Queue` | Insert at the tail |
| `poll()` | `Queue` | Remove and return the head (`null` if empty) |

## Notes

- `ArrayList` indexes start at **0**; after a removal, later elements shift left.
- `Queue` is first-in, first-out (FIFO). `LinkedList` is one common implementation.
- `poll()` returns `null` on an empty queue instead of throwing an exception.

## Author

Bhargav Sai Gundapaneni, Boston University
