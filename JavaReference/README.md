# JavaReference

A self-contained Java + DSA reference library, organized as a topic hierarchy so each file
can be opened independently and explored with Ctrl+Click / hover in the IDE.

Every file is a standalone `public class` with a `main` method containing runnable examples.
There are **no package declarations** (see "Why no packages?" below), so any file can be
compiled and run on its own:

```powershell
javac JavaReference/06_Maps/HashMapReference.java
java -cp JavaReference/06_Maps HashMapReference
```

## Hierarchy

| Folder | Contents |
|---|---|
| `01_Basics/` | Primitives, wrapper classes, variables, casting, operators, conditionals, loops |
| `02_Strings/` | `String` (immutable) and `StringBuilder` (mutable) |
| `03_Arrays/` | 1D/2D arrays and array↔List conversions |
| `04_Lists/` | `List` interface, `ArrayList`, `LinkedList` |
| `05_Sets/` | `Set` interface, `HashSet`, `LinkedHashSet`, `TreeSet` |
| `06_Maps/` | `Map` interface, `HashMap`, `LinkedHashMap`, `TreeMap` |
| `07_Stacks_Queues/` | `Stack`, `Queue`, `Deque`, `ArrayDeque`, `PriorityQueue` |
| `08_Utilities/` | `Arrays`, `Collections`, `Comparator`, `Math`, `Optional` |
| `09_Numbers/` | `Integer`, `Long`, `BigInteger`, `BigDecimal` |
| `10_Iteration/` | `Iterable` and `Iterator` mechanics behind for-each loops |
| `11_Generics/` | Generic classes, generic methods, bounded types, wildcards |
| `12_DSA_Patterns/` | Small, reusable LeetCode patterns built from the collections above |

## How the sections relate

- **01_Basics** is the foundation — every other section builds on primitives, casting, and
  control flow.
- **02_Strings** and **03_Arrays** are the two most common raw data structures you'll
  manipulate directly in DSA problems.
- **04_Lists → 07_Stacks_Queues** cover the core `java.util` collection interfaces. Each
  `XxxReference.java` follows the same layout: what it is, whether duplicates/ordering/sorting
  apply, common methods with examples, time complexity, and typical DSA use case. They all
  favor the "interface on the left, implementation on the right" style, e.g.:
  ```java
  List<Integer> list = new ArrayList<>();
  Map<Integer, Integer> map = new HashMap<>();
  Deque<Integer> deque = new ArrayDeque<>();
  ```
- **08_Utilities** and **09_Numbers** are the static helper toolbox you reach for while
  operating on the collections/arrays above (sorting, comparing, searching, big numbers).
- **10_Iteration** explains the interfaces (`Iterable`/`Iterator`) that make every collection
  in 04-07 work with for-each loops and safe removal during iteration.
- **11_Generics** explains the `<T>` syntax used throughout all the collection classes.
- **12_DSA_Patterns** ties everything together: each file is a minimal, ready-to-adapt
  algorithm pattern (frequency counting, two sum, heaps, monotonic stack, BFS queue, etc.)
  built directly from the types introduced in the earlier folders.

## Quick lookup cheatsheet

Forgot a method? Jump straight to the file:

- `HashMap.getOrDefault()` → [06_Maps/HashMapReference.java](06_Maps/HashMapReference.java)
- `PriorityQueue.poll()` / min-max heap → [07_Stacks_Queues/PriorityQueueReference.java](07_Stacks_Queues/PriorityQueueReference.java)
- `Deque.push()` / `pop()` → [07_Stacks_Queues/DequeReference.java](07_Stacks_Queues/DequeReference.java)
- `Arrays.sort()` / `binarySearch()` → [08_Utilities/ArraysReference.java](08_Utilities/ArraysReference.java)
- `Comparator.comparing().thenComparing()` → [08_Utilities/ComparatorReference.java](08_Utilities/ComparatorReference.java)
- Frequency counting / Two Sum / heaps / BFS → [12_DSA_Patterns/](12_DSA_Patterns/)

## Why no packages?

Folder names like `01_Basics` and `12_DSA_Patterns` are not valid Java package identifiers
(package names can't start with a digit). Since the goal is for each file to compile and run
independently with a plain `javac`/`java` command, all files intentionally omit a `package`
declaration rather than restructuring the folder names.

## Notes

- All examples use only the Java standard library — no external dependencies.
- Examples are intentionally small and beginner-friendly, favoring clarity over completeness.
- This folder is purely a reference library; it does not affect or depend on any other code
  in the repository.
