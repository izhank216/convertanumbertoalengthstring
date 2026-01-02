# Convert a Number to a Length String
A Java and Kotlin/Android library to convert numeric values into human-readable length strings.
Supports custom units and provides a simple API to represent numbers and lengths, convert between them, and format them as strings.

Licensed under Apache 2.0.

## Usage
*Java*
```java
import com.izhan.convertanumbertoalengthstring.*;

public class Test {
    public static void main(String[] args) {
        Number n1 = new Number(1500);
        Length length1 = Convert.numberToLength(n1, "m");
        System.out.println(String.fromLength(length1));  // 1500.0 m

        Number n2 = new Number(1.5);
        Length length2 = Convert.numberToLength(n2, "km");
        System.out.println(String.fromLength(length2));  // 1.5 km
    }
}
```

*Kotlin/Android*
```kotlin
import com.izhan.convertanumbertoalengthstring.android.*

fun main() {
    val n1 = Number(1500.0)
    val length1 = Convert.numberToLength(n1, "m")
    println(String.fromLength(length1))  // 1500.0 m

    val n2 = Number(1.5)
    val length2 = Convert.numberToLength(n2, "km")
    println(String.fromLength(length2))  // 1.5 km
}
```

