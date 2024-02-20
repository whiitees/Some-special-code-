import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(92);
        System.out.println("Average grade for " + student1.name + ": " + student1.calculateAverageGrade());
    }
}
