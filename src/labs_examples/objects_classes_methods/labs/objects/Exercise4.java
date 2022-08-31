package labs_examples.objects_classes_methods.labs.objects;

public class Exercise4 {
    public static void main(String[] args) {

        // first constructor
        Student firstStudent = new Student();
        firstStudent.studentID = "1234sn";
//        firstStudent.name = "Shintaro Nakamura";
//        firstStudent.age = 33;
//        firstStudent.height = 6.1;
        System.out.println("The first student ID is "+ firstStudent.studentID + ". the name is "+firstStudent.name + ". the age is "+firstStudent.age + ". the height is "+firstStudent.height);

        // second constructor
        Student secondStudent = new Student("2345mj", "Michael Jordan", 13, 6.4);
        System.out.println("\nThe first student ID is "+ secondStudent.studentID + ". the name is "+secondStudent.name + ". the age is "+secondStudent.age + ". the height is "+secondStudent.height);

        // third constructor
        Student thirdStudent = new Student("5873mk", "Mark Mochizuki");
//        thirdStudent.age = 56;
//        thirdStudent.height = 4.11;
        System.out.println("\nThe first student ID is "+ thirdStudent.studentID + ". the name is "+thirdStudent.name + ". the age is "+thirdStudent.age + ". the height is "+thirdStudent.height);
    }

}


class Student {
    String studentID;
    String name;
    int age;
    double height;

    // first constructor
    Student(){
        this.studentID = "No ID";
        this.name = "Jon";
        this.age = 31;
        this.height = 6.1;
    }

    // second constructor
    Student(String studentID, String name, int age, double height) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // third constructor
    Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.age = 18;
        this.height = 5;
    }
}
