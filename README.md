# ArrayList Example (Java)

A simple Java program demonstrating common `ArrayList<String>` operations, written for Boston University METCS622.

## Description

The program creates an `ArrayList` containing seven strings and then performs these operations:

1. **Iterate** through the list and print every element (enhanced for-loop).
2. **Search** for the position of `"BU"` using `indexOf()`.
3. **Find indexes** of `"METCS622"` and `"test1"`.
4. **Check membership** of `"test3"` using `contains()`.
5. **Remove** `"foo"` and `"bar"` using `remove()`, then print the updated list.

## Project Structure

```
.
└── ListExample/
    └── ArrayListExample.java
```

## Requirements

- Java JDK 8 or higher

## How to Compile and Run

From the project root (the folder containing `ListExample/`):

```bash
javac ListExample/ArrayListExample.java
java ListExample.ArrayListExample
```

## Expected Output

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

## Key Concepts Covered

| Method | Purpose |
|---|---|
| `add(E e)` | Append an element |
| `indexOf(Object o)` | Return index of first match, or `-1` if absent |
| `contains(Object o)` | Return `true` if element exists |
| `remove(Object o)` | Remove first matching element |
| Enhanced `for` loop | Iterate over all elements |

## Notes

- `ArrayList` indexes start at **0**.
- `indexOf()` returns `-1` when the element is not found.
- `remove(Object)` shifts the remaining elements left, so indexes change after removal.

## Author

Bhargav Sai Gundapaneni, Boston University
