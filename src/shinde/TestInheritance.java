package shinde;

//Base class
class Person {
 protected String name;
 protected int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Derived class Student
class Student extends Person {
 private int rollNumber;
 private char grade;

 public Student(String name, int age, int rollNumber, char grade) {
     super(name, age);  // calling the constructor of the base class
     this.rollNumber = rollNumber;
     this.grade = grade;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();  // calling the method of the base class
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Grade: " + grade);
 }
}

//Derived class Teacher
class Teacher extends Person {
 private String subject;
 private double salary;

 public Teacher(String name, int age, String subject, double salary) {
     super(name, age);  // calling the constructor of the base class
     this.subject = subject;
     this.salary = salary;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();  // calling the method of the base class
     System.out.println("Subject: " + subject);
     System.out.println("Salary: " + salary);
 }
}

//Test the classes
public class TestInheritance {
 public static void main(String[] args) {
     Student student = new Student("sunil", 23, 23359, 'c');
     Teacher teacher = new Teacher("Miss. Amruta", 30, "Java", 60000);

     System.out.println("Student Details:");
     student.displayDetails();

     System.out.println("\nTeacher Details:");
     teacher.displayDetails();
 }
}

