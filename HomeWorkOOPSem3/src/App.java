import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;


public class App {
    /**
     * Метод app, предназначенный для запуска приложения (точка входа).
     * 
     * @param args аргументы командной строки.
     * @throws Exception возможные исключения.
     */
    public static void main(String[] args) throws Exception {
        /*
         * Создим экземпляры класса Student
         */
        Student s1 = new Student("Иван", "Юдицкий ", 23, 10001);
        Student s2 = new Student("Петр", "Петрович ", 22, 10002);
        Student s3 = new Student("Алан", "Поддубный ", 22, 10003);
        Student s4 = new Student("Станислав", "Шубодеров ", 20, 10004);
        Student s5 = new Student("Виктория", "Аникина ", 20, 10005);
        Student s6 = new Student("София", "Статкевич ", 22, 10006);
        Student s7 = new Student("Андрей", "Пусиков ", 21, 10007);
        Student s8 = new Student("Светлана", "Непейвода ", 22, 10008);
        Student s9 = new Student("Александр", "Скрипка ", 21, 10009);
        Student s10 = new Student("Максим", "Музыченко ", 23, 10010);
        Student s11 = new Student("Дмитрий", "Смычок ", 22, 10011);
        Student s12 = new Student("Елизавета", "Васечкина ", 21,10012);
        Student s13 = new Student("Артур", "Пирогов ", 20, 10013);
        Student s14 = new Student("Тонни", "Старковский ", 23, 10014);
        Student s15 = new Student("Гарри", "Потный ", 23, 10015);
        /*
         * Создим и заполним коллекции экземплярами класса Student
         */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud1.add(s6);
        listStud1.add(s7);
        listStud1.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s11);
        listStud3.add(s12);
        listStud3.add(s13);
        listStud3.add(s14);
        listStud3.add(s15);
        
        /*
         * Создим экземпляры класса StudentGroup
         */
        StudentGroup group1 = new StudentGroup(1, listStud1);
        StudentGroup group2 = new StudentGroup(2, listStud2);
        StudentGroup group3 = new StudentGroup(3, listStud3);

        /*
         * Создаем и заполняем коллекцию экземплярами класса StudentGroup
         */
        List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        listSteam.add(group1);
        listSteam.add(group2);
        listSteam.add(group3);

        /*
         * Создим экземпляр класса StudentSteam
         */
        StudentSteam steam1 = new StudentSteam(1, listSteam);

        /*
         * Построчно выведем группы со списком студентов, ( еще не отсортированные)
         */
        for (StudentGroup group : steam1) {
            System.out.printf("Группа %d\n", group.getNumGroup());
            for (Student stud : group) {
                System.out.println(stud);
            }
        }
        System.out.println("***************************************************************************************"); // разделитель вывода
        /*
         * Производим сортировку
         */
        Collections.sort(steam1.getGroups());
        Collections.sort(group1.getStudents());
        Collections.sort(group2.getStudents());
        Collections.sort(group3.getStudents());

        /*
         * Построчно выведем группы со списком студентов, отсортированые
         * по колличеству студентов в группе
         */
        for (StudentGroup group : steam1) {
            System.out.println(group);
        }

        /*
         * Выведем на экран экземпляра класса StudentSteam с помощью переопределенного
         * метода ToString
         */
        System.out.println(steam1);
        
    }
}