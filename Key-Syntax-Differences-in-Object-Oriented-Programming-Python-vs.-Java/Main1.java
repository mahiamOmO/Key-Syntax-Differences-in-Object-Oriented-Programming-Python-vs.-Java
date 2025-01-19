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
