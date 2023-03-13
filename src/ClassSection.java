import java.util.ArrayList;

public class ClassSection {
    String subject;
    int capacity;
    int yearLevel;
    ArrayList<Student> students;

    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    @Override
    public String toString() {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            if (s.getYearLevel() == this.yearLevel) {
                students.add(s);
            }
        }
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public boolean isStudentEnrolled(Student s) {
        if (students.contains(s)) {
            return true;
        }
        else {
            return false;
        }
    }
}
