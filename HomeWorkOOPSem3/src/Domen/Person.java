package Domen;
/**
 * Класс, который описывает  пользователя системы.
 */
public class Person {

    private String firstName; // Имя пользователя
    private String secondName; // Фамилия пользователя
    private int age; // Возраст пользователя
    
    /**
     * Конструктор класса.
     * 
     * @param firstName  Имя пользователя
     * @param secondName Фамилия пользователя
     * @param age        Возраст пользователя
     */
    public Person(String firstName, String secondName, int age, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    // Гетерры
    /**
     * Метод, предназначенный  для чтения имени пользователя.
     * 
     * @return Имя пользователя
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Метод, предназначенный  для чтения фамилии пользователя.
     * 
     * @return Фамилия пользователя
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Метод, предназначенный для чтения возраста пользователя.
     * 
     * @return Возраст пользователя
     */
    public int getAge() {
        return age;
    }
    //Сеттеры
    /**
     * Метод, предназначенный  для записи (сеттер) имени пользователя.
     * 
     * @param firstName Имя пользователя
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Метод, предназначенный  для записи (сеттер) фамилии пользователя.
     * 
     * @param secondName Фамилия пользователя
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Метод, предназначенный для записи (сеттер) возраста пользователя.
     * 
     * @param age Возраст пользователя
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Переопределение метода toString() для вывода информации
     * 
     * @return Информация о пользователе
     */
    @Override
    public String toString() {
        return "User{" +
                "Имя = " + firstName +
                ", Фамилия = " + secondName +
                ", Возраст = " + age +
                '}';
    }
}