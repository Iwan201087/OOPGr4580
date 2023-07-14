package Controllers;

import java.util.List;
import Domen.Student;
import Domen.StudentGroup;

/**
 * Интерфейс контроллера группы студентов.
 * 
 * @param <T> тип группы студентов.
 */
public interface iGroupController<T extends StudentGroup> {

    /**
     * Обьеденяет студентов  а группу на основе переданного списка студентов.
     * 
     * @param listStud список студентов.
     */
    void createGroup(List<Student> listStud);
}