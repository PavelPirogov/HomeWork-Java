
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentModel {
        private List<Student> students = new ArrayList<>();

        public void create(String name, UUID groupId) {
            students.add(new Student(name, groupId));
        }

        public List<Student> getAll() {
            return List.copyOf(students);
        }

    }