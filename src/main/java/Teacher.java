import lombok.Data;

import java.util.ArrayList;

@Data
public class Teacher {
    private ArrayList<Student> students;

    private String teacherName;
    private String teacherSurname;
    private int teacherId;
    private String teacherGender;
    private int teacherAge;
    private int teacherPhone;
    private String teacherQualificationLevel;
    private String teacherEmail;
    private String teacherNationality;
    private int teacherWorkExperience;
    private int teacherIQ;
    private int teacherNumberOfItems;

}

