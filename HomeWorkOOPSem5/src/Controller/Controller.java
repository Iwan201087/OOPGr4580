package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Dict;
import Model.Student;

/**
 * Класс контроллера, служащий для  связи модели и представления.
 * Содержит в себе методы для получения списка студентов, обновления представления,
 * запуска приложения и обработки команд пользователя.
 */
public class Controller {

    private List<Student> students; // список студентов
    private iGetView view; // объект представления
    private iGetModel model; // объект модели
    private String lang; // язык приложения

    /**
     * Создание конструктора класса.
     * 
     * @param view  - объект представления
     * @param model - объект модели
     * @param lang  - язык приложения
     */
    public Controller(iGetView view, iGetModel model, String lang) {
        this.view = view;
        this.model = model;
        this.lang = lang;
        this.students = new ArrayList<Student>();
    }

    /**
     * Метод для получения списка всех студентов из модели.
     */
    public void getAllStudents() {
        students = model.getAllStudents();
    }

    /**
     * Метод для проверки наличия данных в списке студентов.
     * 
     * @return true, если список не пустой, иначе -  false.
     */
    public boolean test() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод для обновления представления со списком студентов.
     */
    public void updateView() {
        getAllStudents();
        if (test()) {
            view.printAllStudents(students);
        } else {
            System.out.println(Dict.get("emptyList", lang));
        }
    }

    /**
     * Метод для получения команд от пользователя.
     */
    public void run() {
        boolean getNewIteration = true; // флаг
        while (getNewIteration) {
            String command = view.prompt(Dict.get("enterCommand", lang));

            try {
                Command com = Command.valueOf(command.toUpperCase());
                switch (com) {
                    // Командя для выхода из программы
                    case EXIT:
                        getNewIteration = false;
                        System.out.println(Dict.get("exit", lang));
                        break;
                    // Команда для вывода списка студентов
                    case LIST:
                        getAllStudents();
                        updateView();
                        System.out.println("");
                        break;
                    // Команда для удаления студента
                    case DELETE:
                        updateView();
                        Long studentID = Long.parseLong(view.prompt(Dict.get("enterStudentId", lang)));
                        boolean isDeleted = model.deleteStudent(studentID);
                        if (!isDeleted) {
                            System.out.println(Dict.get("notFound", lang));
                        } else {
                            System.out.println(Dict.get("deleted", lang));
                            updateView();
                            System.out.println("");
                        }
                        break;
                    default:
                        System.out.println(Dict.get("notCorrect", lang));
                        break;
                }
            } catch (Exception e) {
                System.out.println(Dict.get("notCorrect", lang) + " = " + e.getMessage());
                System.out.println("");
            }
        }
    }

}