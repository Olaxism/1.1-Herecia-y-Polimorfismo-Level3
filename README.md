# 📚 1.1-Herencia-y-Polimorfismo-Level3

Java exercises demonstrating OOP concepts, static members, and initialization blocks.

## 💻 Technologies Used

List of technologies, libraries and tools used in the development of the exercise.

- **Java** - Version X.X
- **Maven/Gradle** (choose one)
- **JUnit** - Version X.X
- **IntelliJ IDEA/Eclipse** (choose one)
- Other dependencies...

## 📋 Prerequisites

Specifications of the requirements needed to run the project, such as software versions, dependencies, etc.

- **Java Development Kit (JDK)** - Version 11 or higher
- **Maven** - Version 3.6+ (if using Maven)
- **Git** - For version control
- **IDE**: IntelliJ IDEA or Eclipse

## 🛠️ Installation

### Option 1: Clone and Import in IDE
```bash
git clone <repository-url>
cd <project-directory>
````
### Option 2: Open in IDE
Open the project in your preferred IDE:

IntelliJ IDEA: File → Open → Select project folder

Eclipse: File → Import → Existing Projects into Workspace

Ensure JDK is properly configured in your IDE.

## 📁 Project Structure

```text
src/
├── instruments/
│   ├── Instrument.java          # Abstract base class
│   ├── WindInstrument.java      # Wind instrument implementation
│   ├── StringInstrument.java    # String instrument implementation
│   └── PercussionInstrument.java # Percussion instrument implementation
├── car/
│   └── Car.java                 # Car class with static and final members
└── Main.java                    # Main class to demonstrate exercises
```

## ▶️ Execution
From IDE:
Locate the Main.java file in src/ directory

Right-click and select "Run Main.main()"

From Command Line:
```bash

## Compile all Java files
javac -d out src/**/*.java src/*.java

## Run the main class
java -cp out Main
```

## 📝 Exercises Overview
### Exercise 1: Musical Instruments
Demonstrates:

- Abstract classes and inheritance

- Method overriding with polymorphism

- Static and instance initialization blocks

- Class loading mechanisms

### Exercise 2: Car Class
Demonstrates:

- Different variable modifiers: static final, static, final

- Static vs instance methods

- Constructor initialization limitations

## 🤝 Contributing
While this is an exercise project, suggestions are welcome:

1. Fork the repository

2. Create your feature branch

3. Commit your changes

4. Push to the branch

5. Open a Pull Request