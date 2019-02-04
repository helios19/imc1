Setup Instructions
--

**Fat-Jar**

In order to make this program easily portable and runnable, the decision has been made to build a fat-jar (encapsulating
the few needed dependencies). By doing so, this application can be executed easily using the methods described below.

To build this application, simply run the following gradle command in a terminal, at the root of the source folder to generate
the runnable fat jar:

```
./gradlew clean build
```

Then, to run the application, simply type:

```
java -jar <SOURCE_FOLDER>/build/libs/imc-visitor-1.0.jar
```

Alternatively, you could also use the 'run' gradle task to execute the application (skipping the jar packaging altogether):

```
./gradlew run
```

After the application has started, the standard output should display the following shape areas as per the arbitrary shape instantiated in the Application class:

```
[main] INFO  com.imc.visitor.Application - Area of Triangle(base=5.0, height=6.0): 15.0
[main] INFO  com.imc.visitor.Application - Area of Triangle(base=7.0, height=8.0): 28.0 
[main] INFO  com.imc.visitor.Application - Area of Rectangle(breadth=9.0, height=10.0): 90.0 
[main] INFO  com.imc.visitor.Application - Area of Rectangle(breadth=11.0, height=12.0): 132.0 
[main] INFO  com.imc.visitor.Application - Area of Circle(radius=20.0): 1256.6370614359173 
[main] INFO  com.imc.visitor.Application - Area of Circle(radius=30.0): 2827.4333882308138 

```


Design decisions and other considerations
--

This application has been implemented in a way to be as readable, concise, testable and maintainable as possible. Hence, the following
coding principles and paradigms have been followed:

- SOLID
- YAGNI
- DRY
- TDD/BDD

Note also that the following additional third-party libraries have been used to apply some of the above coding practices:

- Lombok (to reduce Java boilerplate code)
- Gradle (application scaffolding, build and execution using groovy scripting language)
- JUnit 5 (latest methods available on the Jupiter package)
- BDD test style (given/when/then)
- Checkstyle / PMD / Findbugs (code quality)
- Spock (to make parameterized tests more readable)
