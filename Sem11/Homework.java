
public class Homework {

    /**
     * Разработать свое MVP приложение со следующей моделью данных:
     * 1. Группа студентов (идентификатор, номер)
     * 2. Студент (идентификатор, имя, группа)
     * Реализовать стандартные операции:
     * - создание группы
     * - просмотр всех групп
     * - создание студента в группе
     * - просмотр всех студентов одной группы
     * 3*. Реализовать новую сущность Урок (идентификатор, группа, дата).
     * - создание урока для групп
     * - просмотр всех уроков у студента
     * lesson <-> studentGroup <- student
     */
    
    public static void main(String[] args) {
        GroupModel groupModel = new GroupModel();
        StudentModel studentModel = new StudentModel();

        GroupPresenter groupPresenter = new GroupPresenter(groupModel);
        StudentPresenter studentPresenter = new StudentPresenter(studentModel);

        View view = new View();

        view.setGroupPresenter(groupPresenter);
        view.setStudentPresenter(studentPresenter);

        view.start();
    }
}
