package Domen;

/**
 * Класс, представляющий сотрудника.
 */
public class Employee extends Person {

    /**
     * Идентификатор сотрудника.
     */
    private long empId;

    /**
     * Конструктор класса.
     * 
     * @param firstName  Имя сотрудника.
     * @param secondName Фамилия сотрудника.
     * @param age        Возраст сотрудника.
     * @param empId      Идентификатор сотрудника.
     */
    public Employee(String firstName, String secondName, int age, long empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }

    /**
     * Метод, возвращающий идентификатор сотрудника.
     * 
     * @return Идентификатор сотрудника.
     */
    public long getEmpId() {
        return empId;
    }

    /**
     * Метод, устанавливающий идентификатор сотрудника.
     * 
     * @param empId Идентификатор сотрудника.
     */
    public void setEmpId(long empId) {
        this.empId = empId;
    }
}