package Domen;

/**
 * Класс, предназначенный для описания данный о  студенте (содержит информацию о его имени, фамилии,
 * возрасте, и ID).
 * Класс будет дополнительно реализовывать интерфейс Comparable( для сравнения студентов по
 * возрасту и идентификатору).
 */
public class Student extends Person implements Comparable<Student> {
    /*
     * ID студента
     */
    private int studentID;

    /**
     * Конструктор для класса Student.
     * 
     * @param firstName  имя студента
     * @param secondName фамилия студента
     * @param age        возраст студента
     * @param studentID  ID студента
     */
    public Student(String firstName, String secondName, int age, int studentID) {
        super(firstName, secondName, age, secondName);
        this.studentID = (int) studentID;
    }
    // Геттер
    /**
     * Метод, предназначенный для чтения ID студента.
     * 
     * @return ID студента
     */
    public int getStudentID() {
        return studentID;
    }
    // Сеттер
    /**
     * Методпредназначенный записи ID студента.
     * 
     * @param studentID ID студента
     */
    public void setStudentID(long studentID) {
        this.studentID = (int) studentID;
    }

    /**
     * Переопределенный метод toString() для вывода информации о студенте.
     * 
     * @return информация о студенте ( в виде строки )
     */
    @Override
    public String toString() {
        return "Имя = " + super.getFirstName() +
                "\tФамилия = " + super.getSecondName() +
                "\tВозраст = " + super.getAge() +
                "\tstudentID = " + studentID;
    }

    // /**
    // * Реализация метода compareTo() интерфейса Comparable для сравнения студентов
    // по возрасту и идентификатору.
    // * @param o студент, с которым нужно сравнить текущего студента
    // * @return результат сравнения в виде целого числа (0 - равны, 1 - текущий
    // студент больше, -1 - текущий студент меньше)
    // */
    @Override
    public int compareTo(Student o) {
        System.out.println(super.getFirstName() + " - " + o.getFirstName());
        if (super.getAge() == o.getAge()) {
            if (this.studentID == o.studentID) {
                return 0;
            }
            if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }

}