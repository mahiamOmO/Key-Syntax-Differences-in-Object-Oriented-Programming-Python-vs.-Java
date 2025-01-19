# "Key Syntax Differences in Object-Oriented Programming: Python vs. Java”
## class & object

### python code:

#Student is the class
class Student:
    name = "Momo";


#here s1 is the object of Student class
s1 = Student()   
print(s1.name)

## constructor

### python code

class Student:
    
    def __init__(self,fullname):  #constructor 
        self.name = fullname

s1 = Student("Momo")
print(s1.name)

## class & object in java

### java code:

// Student is the class
class Student {
    String name = "Momo";
}

// Main class to test the Student class
public class Main {
    public static void main(String[] args) {
        // s1 is the object of the Student class
        Student s1 = new Student();
        System.out.println(s1.name);
    }
}

```

## constructor in java

### java code:


// Student class
class Student {
    String name; // Instance variable

    // Constructor
    public Student(String fullname) {
        this.name = fullname;
    }
}

// Main class to test the Student class
public class Main1 {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student s1 = new Student("Momo");
        // Print the name
        System.out.println(s1.name);
    }
}
