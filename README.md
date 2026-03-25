# Core Java Programming

A curated Java practice repository with focused examples on core language features, data structures, algorithms, Java 8 streams, and common interview-style problems.

## Overview

This project is organized as a collection of small, self-contained classes that demonstrate:

- **Core Java fundamentals** (loops, recursion, string handling, number operations)
- **Data structures and algorithms** (searching, linked list, stack, map-based problems)
- **Java 8 functional programming** (Stream API, lambda expressions, method references, collectors)
- **Object-oriented concepts** (comparable/comparator usage, design patterns)

The codebase is ideal for:

- Concept revision before interviews
- Hands-on Java syntax and API practice
- Quick reference examples for common coding tasks

## Tech Stack

- **Language:** Java 8
- **Build Tool:** Maven
- **Project Type:** Standard Maven Java project

## Project Metadata

Defined in `pom.xml`:

- **Group ID:** `com.keval.javaconcepts`
- **Artifact ID:** `java-concepts`
- **Version:** `1.0-SNAPSHOT`

## Repository Structure

```text
src/main/java/com/corejavaprogramming/
├── arrays/            # Array problems and transformations
├── corejava/          # Core Java basics and utility examples
├── designpattern/     # Factory and Singleton samples
├── dsa/               # Linked list, map, stack examples
├── hashmap/           # Concurrent and synchronized map examples
├── streamapi/         # Java 8 stream/lambda/collector examples
├── string/            # String algorithms and utilities
├── stringbuffer/      # StringBuffer operations
└── ...                # Comparable/comparator, recursion, servlet, etc.

├── dsa/algorithm/      # Searching algorithms (LinearSearch, BinarySearch)
```


## Package Naming (Professional Best Practice)

If your goal is to share this repository publicly (with recruiters, teammates, or interview peers), package naming consistency matters.

Recommended conventions:

- Use a **single lowercase base package** (for example: `com.yourname.corejavaprogramming` or `io.github.yourusername.corejavaprogramming`)
- Keep package segments lowercase only (no uppercase segments like `programmingKC` or `Collectors`)
- Use topic-based subpackages under that base package (for example: `.arrays`, `.corejava`, `.dsa.searching`, `.streamapi`)
- Avoid mixed naming styles such as `designPattern` and `methodReference`; prefer `designpattern` and `methodreference`

This repository now uses a single unified base package, `com.corejavaprogramming`, so anyone reviewing the code can immediately recognize this as one consolidated collection of core Java coding topics.

## Topic Coverage via Package Structure

The package layout is intentionally topic-oriented so shared code immediately communicates breadth:

- `com.corejavaprogramming.corejava` → Java basics and foundational programs
- `com.corejavaprogramming.arrays` and `...string` → common coding interview problem sets
- `com.corejavaprogramming.dsa.*` → data structure and algorithm implementations
- `com.corejavaprogramming.streamapi` and `...streamapi.collectors` → Java 8 functional style and collector patterns
- `com.corejavaprogramming.designpattern` / `...comparable` / `...comparator` → OOP and design-oriented examples

This gives a professional “all major coding topics covered” signal when you share the repository link.

## Getting Started

### Prerequisites

- JDK 8+ installed
- Maven 3.6+ installed

### Clone the repository

```bash
git clone <your-repo-url>
cd CoreJavaProgramming
```

### Compile the project

```bash
mvn clean compile
```

> If your environment blocks Maven Central access, compilation may fail due to plugin resolution restrictions.

## Running Examples

Most classes are standalone examples with a `main` method. After compilation, run a class directly:

```bash
java -cp target/classes com.corejavaprogramming.corejava.FactorialNumber
```

Additional examples:

```bash
java -cp target/classes com.corejavaprogramming.dsa.algorithm.BinarySearch
java -cp target/classes com.corejavaprogramming.streamapi.StreamAPI
```

## Learning Areas Covered

- Basic syntax and control flow
- String operations and palindrome checks
- Recursion and numeric algorithms
- Collections and map operations
- Linked list and stack manipulations
- Stream API transformations and aggregations
- Comparator/Comparable and sorting strategies
- Introductory design pattern implementations

## Suggested Improvements

If you want to evolve this repository further, consider:

- Adding **JUnit test cases** for each module
- Creating package-level documentation and usage notes
- Standardizing class names and package spelling (for consistency)
- Adding CI checks for compilation and style validation

## Contributing

Contributions are welcome. You can:

1. Fork the repository
2. Create a feature branch
3. Add or improve examples
4. Open a pull request with a clear summary

## License

No license file is currently defined. Add a license (for example, MIT) if you plan to distribute or accept external contributions.
