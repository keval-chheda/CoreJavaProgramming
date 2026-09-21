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

All application classes use the short `com.corejava` root package and are
organized by the topic demonstrated:

```text
src/main/java/com/corejava/
├── basics/                         # Core language and number examples
├── collections/                    # Collections, arrays, strings, and sorting
│   ├── arrays/
│   ├── characters/
│   ├── lists/
│   ├── maps/
│   ├── sorting/                    # Comparable and Comparator examples
│   ├── stacks/
│   └── strings/
├── streams/                        # Stream API, lambdas, and method references
│   └── collectors/
├── company/epam/                   # Company-specific interview questions
├── interview/                      # General interview problems
├── algorithms/                     # Recursion and searching
└── patterns/                       # Factory and Singleton examples
```


## Package Naming (Professional Best Practice)

If your goal is to share this repository publicly (with recruiters, teammates, or interview peers), package naming consistency matters.

Recommended conventions:

- Use a **single lowercase base package** (for example: `com.yourname.corejavaprogramming` or `io.github.yourusername.corejavaprogramming`)
- Keep package segments lowercase only (no uppercase segments like `programmingKC` or `Collectors`)
- Use topic-based subpackages under that base package (for example: `.arrays`, `.corejava`, `.dsa.searching`, `.streamapi`)
- Avoid mixed naming styles such as `designPattern` and `methodReference`; prefer `designpattern` and `methodreference`

This repository uses the shorter unified base package, `com.corejava`, so
package declarations remain readable while still being consistently
namespaced.

## Topic Coverage via Package Structure

The package layout is intentionally topic-oriented so shared code immediately communicates breadth:

- `com.corejava.basics` and `com.corejava.collections.*` → foundational
  language and collection problem sets
- `com.corejava.streams` and `...streams.collectors` → Java 8 stream,
  lambda, and collector examples
- `com.corejava.algorithms.*` → recursion and searching examples
- `com.corejava.collections.sorting` → Comparable and Comparator examples
- `com.corejava.company.epam` → examples grouped by company

This gives a professional “all major coding topics covered” signal when you share the repository link.

## Interview Roadmap

Suggested high-impact additions for interview prep (including Java 25/26 topic ideas) are documented in:

- `INTERVIEW_ROADMAP.md`

## Complexity Documentation

A complete time/space complexity reference (with short explanations) for all programs is available in:

- `COMPLEXITY_GUIDE.md`

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
java -cp target/classes com.corejava.basics.FactorialNumber
```

Additional examples:

```bash
java -cp target/classes com.corejava.algorithms.search.BinarySearch
java -cp target/classes com.corejava.streams.StreamAPI
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
