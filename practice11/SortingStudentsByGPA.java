package practice11;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // сравнение в порядке убывания
        if (student1.getId() > student2.getId()) {
            return -1;
        } else if (student1.getId() < student2.getId()) {
            return 1;
        } else {
            return 0; // баллы равны
        }
    }
}
