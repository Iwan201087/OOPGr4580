package Controllers;

import Domen.Employee;
import Domen.Person;
import StudentService.EmployeeService;

/**
 * Контроллер для работы с "сотрудниками" а так же реализует интерфейс iUserController.
 */
public class EmployeeController implements iUserController<Employee> {
    private final EmployeeService empService = new EmployeeService();

    /**
     * Создание нового сотрудника.
     * 
     * @param firstName  имя сотрудника
     * @param secondName фамилия сотрудника
     * @param age        возраст сотрудника
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    /**
     * Метод для выплаты зарплаты сотруднику.
     * 
     * @param person сотрудник, которому выплачивается зарплата
     */
    static public <T extends Employee> void paySalary(T person) {
        System.out.println(
                ((Person) person).getFirstName() + " " + ((Person) person).getSecondName()
                        + " получил зарплату 20000р");
    }

    /**
     * Метод для вычисления среднего значения произвольного массива чисел.
     * 
     * @param num массив чисел
     * @param <T> тип элементов массива
     * @return среднее значение элементов массива
     */
    static public <T extends Number> Double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}