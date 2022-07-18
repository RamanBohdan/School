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
        student.setStudentPhone(1234567);
        student.setStudentSkinColor("White");
        studentsList.add(student);

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
        teacher.setTeacherPhone(1234567);
        teacher.setTeacherQualificationLevel("Height");
        teacher.setTeacherWorkExperience(21);

        ArrayList<Teacher> teacherList = new ArrayList<>(128);
        teacherList.add(teacher);

        Classroom classroom = new Classroom();
        classroom.setTeachers(teacherList);
        classroom.setCountDesk(2);
        classroom.setCountWindow(5);
        classroom.setFormatClass("maths class");

        ArrayList<Classroom> classroomSchoolList = new ArrayList<>(128);
        classroomSchoolList.add(classroom);

        School school = new School();
        school.setClassrooms(classroomSchoolList);
        System.out.println(school);
    }
}
