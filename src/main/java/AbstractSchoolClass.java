import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AbstractSchoolClass {

    protected String teacher;
    protected String classNumber;
    protected String studentName;

    public AbstractSchoolClass(String teacher, String classNumber, String studentName) {
        this.teacher = teacher;
        this.classNumber = classNumber;
        this.studentName = studentName;
    }
}
