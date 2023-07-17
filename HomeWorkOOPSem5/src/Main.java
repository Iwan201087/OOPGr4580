import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.ModelHashMap;
import Model.Student;
import View.ViewRus;
import View.ViewEng;

/**
 * Главный класс
 */
public class Main {

   /**
    * Объект сканера для считывания пользовательского ввода.
    */
   public static Scanner in = new Scanner(System.in, "Cp866");

   /**
    * Возвращает объект отображения в зависимости от выбранного языка.
    * 
    * @param lang выбранный язык
    * @return объект отображения
    * @throws IllegalArgumentException если выбран неподдерживаемый язык
    */
   public static iGetView view(String lang) {
      iGetView view;
      if (lang.equals("RUS")) {
         view = new ViewRus();
      } else if (lang.equals("ENG")) {
         view = new ViewEng();
      } else {
         throw new IllegalArgumentException("Неподдерживаемый язык!");
      }
      return view;
   }

   /**
    * Точка входа в приложение.
    * 
    * @param args аргументы командной строки
    * @throws Exception Исключения, если возникла ошибка
    */
   public static void main (String[] args) throws Exception {
      System.out.printf("Выберите язык: RUS/ENG: ");
      String lang = in.nextLine().toUpperCase();

      ModelHashMap studentsHash = new ModelHashMap();
      studentsHash.addStudent("Иван", "Юдицкий", 35, (long) 10001);
      studentsHash.addStudent("Евгений", "Кринский", 46, (long) 10002);
      studentsHash.addStudent("Евгений", "Капылов", 42, (long) 10003);
      studentsHash.addStudent("Александр", "Капитан", 36, (long) 10004);
      studentsHash.addStudent("Галина", "Капралова", 34, (long) 10005);
      
      List<Student> studentsList = new ArrayList<Student> (Arrays.asList(
            new Student("Иван", "Юдицкий", 35, (long) 10001),
            new Student("Евгений", "Кринский", 46, (long) 10002),
            new Student("Евгений", "Капылов", 42, (long) 10003),
            new Student("Александр", "Капитан", 36, (long) 10004),
            new Student("Галина", "Капралова", 34, (long) 10005)));
           

      FileRepo fileRepo = new FileRepo("Student.txt");
      for (Student person : studentsList) {
         fileRepo.addStudent(person);
      }
      fileRepo.saveAllStudentsToFile();

      iGetView view = view(lang);
      iGetModel modelHashMap = studentsHash;
      Controller control = new Controller(view, modelHashMap, lang);
      control.run();
   }
}