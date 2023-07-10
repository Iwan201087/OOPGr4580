package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, который предназначен для реализации итератора списка студентов.
 */
public class StudentGroupIterator implements Iterator<Student> {
    /*
     * counter будет используется для отслеживания текущей позиции в списке студентов
     * students будет содержать ссылку на список студентов, по которому  производится
     * итерация.
     */
    private int counter;
    private final List<Student> students;

    /**
     * Конструктор для  класса StudentGroupIterator.
     * 
     * @param students список студентов
     */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /**
     * Метод, предназначенный  для проверки наличия следующего элемента в списке.
     * 
     * @return true, если следующий элемент существует, иначе - false
     */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    /**
     * Метод, предназначенный для получения следующего элемента списка.
     * 
     * @return следующий элемент списка
     */
    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return students.get(counter++);
    }
}