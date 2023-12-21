package practice11;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Maks", 22),
                new Student("Boris", 18),
                new Student("Bob", 14),
                new Student("David", 45),
                new Student("Mari", 16)
        };

        System.out.println("Unsorted");
        for (Student student: students){
            System.out.println(student);
        }

        // vsavkaSort(students);
        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nSorted");
        for (Student student: students){
            System.out.println(student);
        }
    }

    public static void vsavkaSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++){
            Student tmp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getId() > tmp.getId()){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = tmp;
        }
    }
}
