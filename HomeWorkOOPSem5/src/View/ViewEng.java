package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * Класс ViewEng - аналог класса View, с выводом информации на английском языке.
 * Содержит методы для вывода информации на экран
 * и получения ввода от пользователя.
 */
public class ViewEng implements iGetView {
    public Scanner in = new Scanner(System.in, "Cp866");

    public void printAllStudents(List<Student> students) {
        System.out.println("____________Displaying a list of students____________");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("____________End of list____________");
    }

    public String prompt(String message) {
        System.out.printf(message);
        return in.nextLine();
    }
}