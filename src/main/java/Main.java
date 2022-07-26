import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // создать поле список студентов в классе учитель.
        // В Main создаю судентов.
        // Добавляю их в список.
        // Этот список сетаю в учителя.
        //  создать иерархию данных
        Student student = new Student();
        ArrayList<Student> studentsList = new ArrayList<>(128);
        student.setStudentAge(18);
        student.setStudentEmail("gmail.com");
        student.setStudentGender("Man");
        student.setStudentHeight(181);
        student.setStudentWeight(76);
        student.setStudentId(1);
        student.setStudentIQ(92);
        student.setStudentName("Maksim");
        student.setStudentSurname("Pechkin");
        student.setStudentNationality("Belarus");
        student.setStudentPhone(123456789);
        student.setStudentSkinColor("White");
        studentsList.add(student);

        Student student1 = new Student();
        ArrayList<Student> studentList1 = new ArrayList<>(128);
        student1.setStudentAge(17);
        student1.setStudentName("Alex");
        student1.setStudentSurname("Ivanov");
        student1.setStudentEmail("@mail.ru");
        student1.setStudentHeight(176);
        student1.setStudentWeight(72);
        student1.setStudentId(2);
        student1.setStudentIQ(67);
        student1.setStudentNationality("Polish");
        student1.setStudentGender("Man");
        student1.setStudentSkinColor("White");
        student1.setStudentPhone(112233445);
        studentList1.add(student1);

        Student student2 = new Student();
        ArrayList<Student> studentList2 = new ArrayList<>(128);
        student2.setStudentAge(20);
        student2.setStudentName("Minny");
        student2.setStudentSurname("Mouse");
        student2.setStudentEmail("@yandex.ru");
        student2.setStudentHeight(173);
        student2.setStudentWeight(50);
        student2.setStudentId(3);
        student2.setStudentIQ(76);
        student2.setStudentNationality("Belarus");
        student2.setStudentGender("Woman");
        student2.setStudentSkinColor("Black");
        student2.setStudentPhone(556677889);
        studentList2.add(student2);

        Teacher teacher = new Teacher();
        teacher.setStudents(studentsList);

        teacher.setTeacherAge(54);
        teacher.setTeacherEmail("teacher@gmail.com");
        teacher.setTeacherGender("Women");
        teacher.setTeacherId(12);
        teacher.setTeacherIQ(99);
        teacher.setTeacherName("Irina");
        teacher.setTeacherSurname("Ivanova");
        teacher.setTeacherNationality("Belarus");
        teacher.setTeacherNumberOfItems(2);
        teacher.setTeacherPhone(123456799);
        teacher.setTeacherQualificationLevel("Height");
        teacher.setTeacherWorkExperience(21);

        ArrayList<Teacher> teacherList = new ArrayList<>(128);
        teacherList.add(teacher);

        Teacher teacher1 = new Teacher();
        teacher1.setStudents(studentList1);

        teacher1.setTeacherAge(34);
        teacher1.setTeacherEmail("teacherSchool@gmail.com");
        teacher1.setTeacherGender("Man");
        teacher1.setTeacherId(15);
        teacher1.setTeacherIQ(100);
        teacher1.setTeacherName("Valentin");
        teacher1.setTeacherSurname("Pirazhkov");
        teacher1.setTeacherNationality("Belarus");
        teacher1.setTeacherNumberOfItems(2);
        teacher1.setTeacherPhone(123212233);
        teacher1.setTeacherQualificationLevel("Middle");
        teacher1.setTeacherWorkExperience(11);

        ArrayList<Teacher> teacherList1 = new ArrayList<>(128);
        teacherList1.add(teacher1);

        Teacher teacher2 = new Teacher();
        teacher2.setStudents(studentList2);

        teacher2.setTeacherAge(40);
        teacher2.setTeacherEmail("teacherBest@gmail.com");
        teacher2.setTeacherGender("Women");
        teacher2.setTeacherId(21);
        teacher2.setTeacherIQ(111);
        teacher2.setTeacherName("Juliay");
        teacher2.setTeacherSurname("Kuzmenkova");
        teacher2.setTeacherNationality("Belarus");
        teacher2.setTeacherNumberOfItems(4);
        teacher2.setTeacherPhone(888765434);
        teacher2.setTeacherQualificationLevel("Height");
        teacher2.setTeacherWorkExperience(17);

        ArrayList<Teacher> teacherList2 = new ArrayList<>(128);
        teacherList2.add(teacher2);

        Classroom classroom = new Classroom();
        classroom.setTeachers(teacherList);
        classroom.setCountDesk(2);
        classroom.setCountWindow(5);
        classroom.setFormatClass("maths class");

        ArrayList<Classroom> classroomList = new ArrayList<>(128);
        classroomList.add(classroom);

        Classroom classroom1 = new Classroom();
        classroom1.setTeachers(teacherList1);
        classroom1.setCountDesk(1);
        classroom1.setCountWindow(6);
        classroom1.setFormatClass("physic class");

        ArrayList<Classroom> classroomList1 = new ArrayList<>(128);
        classroomList1.add(classroom1);

        Classroom classroom2 = new Classroom();
        classroom2.setTeachers(teacherList2);
        classroom2.setCountDesk(1);
        classroom2.setCountWindow(6);
        classroom2.setFormatClass("IT class");

        ArrayList<Classroom> classroomList2 = new ArrayList<>(128);
        classroomList2.add(classroom2);

        School school = new School();
        school.setClassrooms(classroomList);
        school.setClassrooms(classroomList1);
        school.setClassrooms(classroomList2);
        ArrayList<School> schoolList = new ArrayList<>(1000);
        schoolList.add(school);

        System.out.println(schoolList);
// почему только один класс выводится, а не три ?
    }
}
