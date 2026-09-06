public class Student {
    String name;
    int age;
    int rollNumber;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nagaraj";
        s1.age = 20;
        s1.rollNumber = 15;

        s1.display();
    }
}