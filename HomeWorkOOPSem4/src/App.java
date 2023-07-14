import Controllers.EmployeeController;
import Domen.Employee;
import Domen.Student;
import Domen.Teacher;
import StudentService.AverageAge;

/*
 * Главный класс приложения.
 */
public class App {
    /**
     * Метод app, точка старта приложения приложение.
     * 
     * @param args аргументы командной строки.
     * @throws Exception возможные исключения.
     */
    public static void main(String[] args) throws Exception {

        // Создание объекта "сотрудник" для начисления зарплаты
        Employee person1 = new Employee("Иван", "Юдицкий", 35, 1001);

        // Выплата зарплаты введенному сотруднику
        EmployeeController.paySalary(person1);

        // Вычисление среднего количества учебных часов и средней ЗП
        Integer stHour[] = {80 , 160, 180, 198, 210 };
        System.out.printf("Среднее количество часов: %.2f\n", EmployeeController.mean(stHour));
        Double emplSalary[] = { 65200.56, 76850.69, 105000.0 };
        System.out.printf("Средняя ЗП: %.2f\n", EmployeeController.mean(emplSalary));

        // Вычисление среднего возраста студентов, преподавателей и сотрудников
        AverageAge<Student> averageAgeStudents = new AverageAge<>();
        averageAgeStudents.add(new Student("Евгений", "Белоручко ", 28, 10001));
        averageAgeStudents.add(new Student("Инна", "Прохурина ", 23, 10002));
        averageAgeStudents.add(new Student("Максим", "Иванов ", 29, 10003));
        System.out.println(averageAgeStudents + " ( студентов)");

        AverageAge<Teacher> averageAgeTeachers = new AverageAge<>();
        averageAgeTeachers.add(new Teacher("Александр", "Кургузиков ", 56, 100001, "Кандидат"));
        averageAgeTeachers.add(new Teacher("Николай", "Курочкин", 36, 100002, "Младший научный сотрудник"));
        averageAgeTeachers.add(new Teacher("Виктор", "Викторов ", 59, 303, "Доцент"));
        System.out.println(averageAgeTeachers + " ( преподавателей)");

        AverageAge<Employee> averageAgeEmployees = new AverageAge<>();
        averageAgeEmployees.add(new Employee("Юрий", "Шатов ", 48, 10000001));
        averageAgeEmployees.add(new Employee("Ирина", "Лукьянова ", 36, 10000002));
        averageAgeEmployees.add(new Employee("Кирилл", "Александров ", 41, 10000003));
        System.out.println(averageAgeEmployees + " ( сотрудников)");

        
    }
}