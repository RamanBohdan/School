import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Teacher extends Student {
    public Student student;
    private String teacherName;
    private String teacherSurname;
    private String teacherId;
    private String teacherGender;
    private String teacherAge;
    private String teacherPhone;
    private String teacherQualificationLevel;
    private String teacherEmail;
    private String teacherNationality;
    private String teacherWorkExperience;
    private String teacherIQ;
    private String teacherNumberOfItems;

    private List<Student> students;

    public Teacher getListStudentsForTeacher() {
        List<String> list = new ArrayList<>();
        list.add(student.getStudentName());
        list.add(student.getStudentSurname());
        list.add(student.getStudentAge());
        list.add(student.getStudentEmail());
        list.add(student.getStudentPhone());
        list.add(student.getStudentGender());
        list.add(student.getStudentHeight());
        list.add(student.getStudentId());
        list.add(student.getStudentIQ());
        list.add(student.getStudentWeight());
        list.add(student.getStudentNationality());
        list.add(student.getStudentSkinColor());
        return new Teacher();
    }
}
