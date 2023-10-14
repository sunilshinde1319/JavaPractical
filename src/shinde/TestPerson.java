package shinde;

class Person1{
    protected String name;
    protected int age;
    protected char gender; // 'M' for male, 'F' for female, 'O' for other

    public Person1(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// For testing purposes
public class TestPerson {
    public static void main(String[] args) {
        Person1 person = new Person1("Sunil", 23, 'M');
        person.displayDetails();

        // Using the setters to change details
        person.setName("Bob");
        person.setAge(25);
        person.setGender('M');

        // Using the getters to retrieve details
        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}

