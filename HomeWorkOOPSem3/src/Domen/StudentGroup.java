package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, предназначенный для описания  группы студентов, а так же дополнительно содержит список студентов.
 * Класс также реализует интерфейс Iterable для возможности итерации по списку
 * студентов.
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    /*
     * Список студентов
     */
    private List<Student> students; // Список студентов
    private int numGroup; // Номер группы

    /*
     * Конструктор класса StudentGroup.
     * 
     * @param listStud список студентов
     */
    public StudentGroup(int numGroup, List<Student> listStud) {
        this.numGroup = numGroup;
        this.students = listStud;
    }

    /**
     * Метод, предназначенный для чтения списка студентов.
     * 
     * @return список студентов
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Метод, предназначенный для записи списка студентов.
     * 
     * @param students список студентов
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Метод, предназначенный для чтения номера группы студентов
     * 
     * @return номер группы
     */
    public int getNumGroup() {
        return numGroup;
    }

    /**
     * Метод, предназначенный для записи номера группы студентов
     * 
     * @param numGroup номер группы
     */
    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    /**
     * Реализация метода iterator() интерфейса Iterable (для возможности итерации по
     * списку студентов)
     * 
     * @return итератор списка студентов
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    /**
     * Реализация метода compareTo() интерфейса Comparable (для возможности сравнения групп по
     * размеру).
     * 
     * @param o группа, с которой нужно сравнить текущую группу
     * @return результат сравнения в виде целого числа (0 - равны, 1 - текущая
     *         группа больше, -1 - текущая группа меньше)
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.students.size()) {
            return 0;
        }
        if (this.students.size() < o.students.size()) {
            return -1;
        }
        return 1;
    }

    /**
     * Переопределенный метод toString() для вывода информации о группе.
     * 
     * @return информация о группе в виде строки
     */
    @Override
    public String toString() {
        String result = "Номер группы = " + numGroup +
                ", количество студентов = " + this.students.size() +
                ", список студентов:\n";
        for (Student student : students) {
            result += "Имя: " + student.getFirstName() +
                    "\tФамилия: " + student.getSecondName() +
                    "\tВозраст: " + student.getAge() +
                    "\tstudentID: " + student.getStudentID() + "\n";
        }
        return result;
    }
}