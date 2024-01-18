## AP Computer Science A Unit 1-4 Review

Here's a gimkit that can be used to review these concepts: https://www.gimkit.com/view/659f6a10e7e21c00311a896a

## MATH CLASS
-         Math.max(x,y)       	Returns biggest number
-         Math.min(x,y)         Returns smallest number
-         Math.sqrt(a)          Returns square root
-         Math.abs(a)           Returns absolute value
-         Math.random()       	Returns random double (no form, 0.0 to 1.0 random number)

---

## Primitive Data Types and Wrapper Classes

### byte

- **Wrapper Class:** Byte
- **Description:** Stores whole numbers from -128 to 127 (1 byte)

### short

- **Wrapper Class:** Short
- **Description:** Stores whole numbers from -32768 to 32767 (2 bytes)

### int

- **Wrapper Class:** Integer
- **Description:** Stores whole numbers from -2,147,483,648 to 2,147,483,647 (4 bytes)

### long

- **Wrapper Class:** Long
- **Description:** Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8 bytes)

### float

- **Wrapper Class:** Float
- **Description:** Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits.

### double

- **Wrapper Class:** Double
- **Description:** Stores fractional numbers. Sufficient for storing 15 decimal digits.

### boolean

- **Wrapper Class:** Boolean
- **Description:** Represents true or false values.

### char

- **Wrapper Class:** Character
- **Description:** Stores a single letter/character (case sensitive)

## Control Structures

### While Loops

```java
while (true) {
    // Your code here
}
```

### For Loops

```java
for (int i = start; i < stop; i++) {
    // Your code here
}

// Example
int sum = 0;
for (int i = 0; i <= 100; i++) {
    sum += i;
}
System.out.println(sum); // Output: 5050
```

### Substrings and String Manipulation

#### Substring Method

```java
String str = "Grad Lin";
String sub = str.substring(a, b);
System.out.println(sub);
System.out.println(str);
```

Output:

```java
// Example
String sub = str.substring(0, 2);
System.out.println(sub);  // Output: Gr
System.out.println(str);  // Output: Grad Lin
```

#### Other Substring Operations

```java
String str = "Grad Lin";
String sub1 = str.substring(5);  // Output: Lin since (5) means (5, str.length().
String sub2 = str.substring(5, str.length());  // Output: Lin (which is the same as above)
```

### String Comparison

```java
String str = "Grad Lin";
String str1 = "Grad Lin ";

if (str.equals(str1)) {
    System.out.println("str and str1 are equal");
} else {
    System.out.println("str and str1 are NOT equal");
}   // Output: false, str and str1 are NOT equal, and .equals() returns a boolean.

str1 = str1.substring(0, 8);

if (str.equals(str1)) {
    System.out.println("str and str1 are equal");
} else {
    System.out.println("str and str1 are NOT equal");
}   // Output: str and str1 are equal
```

### String Operations

```java
int x = str.length(); //str="Grad Lin"
System.out.println(x);  // Output: 8
```
