package module3.task3;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
//    static Date date = Date.valueOf();
//    static LocalDate ld = new java.sql.Date(date.getTime()).toLocalDate();
    public static void main(String[] args) {
        Course course1 = new Course("Math", 2, "Chudo");
        Course course2 = new Course("Physics", 3, "Boloto");
        Course course3 = new Course("English", 1, "Lisovyi");
        Course course4 = new Course("Biology", 2, "Lopatko");
        Course course5 = new Course("Chemistry", 20, "Prianyk");
//        Course course2 = new Course(Date.valueOf(ld), "Physics");
        Course[] coursesTaken = {course1, course2, course3, course4, course5};
        Student student1 = new Student("Oleg", "Onopko", 45);
        Student student2 = new Student("Propuk", coursesTaken);
        CollegeStudent collegeStudent1 = new CollegeStudent("Petro", "Bodriak", 39);
        CollegeStudent collegeStudent2 = new CollegeStudent("Bratok", coursesTaken);
        CollegeStudent collegeStudent3 = new CollegeStudent("Arahnid", "Paykovich", 12, "AkademiaPrinzess", 10, 651244321);
        SpecialStudent specialStudent1 = new SpecialStudent("Chemto", "Osobennyi", 1);
        SpecialStudent specialStudent3 = new SpecialStudent("Escho", "Odin", 55, "PTU", 0, 313265486);
        SpecialStudent specialStudent2 = new SpecialStudent("Neo", coursesTaken, 1234);
    }
}
