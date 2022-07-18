import lombok.Data;

import java.util.ArrayList;

@Data
public class Classroom{
    private ArrayList<Teacher> teachers;
    private int countDesk;
    private int countWindow;
    private String formatClass;

}

