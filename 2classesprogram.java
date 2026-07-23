class Student {
    int rollno;
    String name;
    String dept;
    String section;
    int year;

    Student(int rollno, String name, String dept, String section, int year) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.year = year;
    }
}
class Marks {
    int tamil, english, maths, science, social;

    Marks(int tamil, int english, int maths, int science, int social) {
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.social = social;
    }
    int total() {
        return tamil + english + maths + science + social;
    }
    double average() {
        return total() / 5.0;
    }
}
public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[2];
        Marks[] marks = new Marks[2];

        Student s1 = new Student(101, "Abi", "CSE", "A", 2);
        Marks s2 = new Marks(85, 90, 80, 85, 92);
         students[0] = s1;
        marks[0] = s2;

        Student s3 = new Student(102, "Priya", "ECE", "B", 3);
        Marks s4 = new Marks(78, 82, 80, 85, 90);
        students[1] = s3;
        marks[1] = s4;
       
        for (int i = 0; i < students.length; i++) {

            System.out.println("Student " + (i + 1));
            System.out.println("Roll No : " + students[i].rollno);
            System.out.println("Name    : " + students[i].name);
            System.out.println("Dept    : " + students[i].dept);
            System.out.println("Section : " + students[i].section);
            System.out.println("Year    : " + students[i].year);

            System.out.println("Tamil   : " + marks[i].tamil);
            System.out.println("English : " + marks[i].english);
            System.out.println("Maths   : " + marks[i].maths);
            System.out.println("Science : " + marks[i].science);
            System.out.println("Social  : " + marks[i].social);

            System.out.println("Total   : " + marks[i].total());
            System.out.println("Average : " + marks[i].average());
            System.out.println();
        }
    }
}
