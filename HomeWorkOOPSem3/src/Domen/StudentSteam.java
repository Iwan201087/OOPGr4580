package Domen;

import java.util.Iterator;
import java.util.List;

/*
 * Класс, который описывает поток студентов.
 * Класс также реализует интерфейс Iterable для возможности итерации по списку групп.
 */
public class StudentSteam implements Iterable<StudentGroup> {
    /*
     * groups содержит ссылку на список групп студентов в потоке, по которому будет
     * производиться итерация.
     * numSteam - Номер потока.
     */
    private List<StudentGroup> groups;
    private int numSteam;
    /**
     * Конструктор для класса.
     * 
     * @param numSteam номер потока
     * @param groups     список групп студентов в потоке
     */
    public StudentSteam(int numSteam, List<StudentGroup> groups) {
        this.groups = groups;
    }

    /**
     * Метод, предназначенный  для получения списка групп студентов в потоке.
     * 
     * @return список групп студентов
     */
    public List<StudentGroup> getGroups() {
        return groups;
    }

    /**
     * Метод, предназначенный для получения номера потока.
     * 
     * @return номер потока
     */
    public int getNumSteam() {
        return numSteam;
    }

    /**
     * Метод, предназначенный для установки списка групп студентов в потоке.
     * 
     * @param groups список групп студентов
     */
    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    /**
     * Метод, предназначенный для установки номера потока.
     * 
     * @param numSteam номер потока
     */
    public void setNumSteam(int numSteam) {
        this.numSteam = numSteam;
    }

    /**
     * Метод, предназначенный для получения итератора по списку групп студентов в потоке.
     * 
     * @return итератор по списку групп студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            // Текущая позиция в списке групп студентов.
            private int index = 0;

            /**
             * Метод, предназначенный для проверки наличия следующего элемента в списке групп студентов.
             * 
             * @return true, если следующий элемент есть, false - в противном случае
             */
            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            /**
             * Метод, предназначенный для получения следующей группы студентов из списка.
             * 
             * @return следующая группа студентов
             */
            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groups.get(index++);
            }
        };
    }

    /**
     * Переопределенный метод toString() для вывода информации о потоке в виде строки.
     * 
     * @return информация о потоке в виде строки
     */
    @Override
    public String toString() {
        String result = "Номер потока = " + numSteam +
                ", количество групп = " + this.groups.size() +
                ", список студентов:\n";
        for (StudentGroup group : groups) {
            for (Student student : group) {
                result += "Имя: " + student.getFirstName() +
                        "\tФамилия: " + student.getSecondName() +
                        "\tВозраст: " + student.getAge() +
                        "\tstudentID: " + student.getStudentID() + "\n";
            }
        }
        return result;
    }
}