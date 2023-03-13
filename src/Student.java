import java.util.Objects;

public class Student {

    int id;
    String firstname;
    String lastName;
    int age;
    int yearLevel;
    static int studentCount;

    public void setId(int id) {
        this.id = id;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public Student(String firstname, String lastName, int age, int yearLevel) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;

        studentCount = studentCount + 1;
        id = studentCount - 1;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getId() {
        return id;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && yearLevel == student.yearLevel && Objects.equals(firstname, student.firstname) && Objects.equals(lastName, student.lastName);
    }
}
