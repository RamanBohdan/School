public class Main {
    public static void main(String[] args) {

        /*
        ArrayList<AbstractSchoolClass> schools = new ArrayList<>(128);
        schools.add(new AbstractSchoolClass("Inna", "1", "Bob"));
        schools.add(new AbstractSchoolClass("Kamilla", "2", "Michael"));
        schools.add(new AbstractSchoolClass("Tamara","3","Konstantin"));
        schools.add(new AbstractSchoolClass("Elena","4","Nataliya"));
        schools.add(new AbstractSchoolClass("Vasilisa", "4", "Mariya"));
        schools.add(new AbstractSchoolClass("Valeriya", "6", "Sofia"));
        schools.add(new AbstractSchoolClass("Juliya", "7","Raman"));
        schools.add(new AbstractSchoolClass("Vladislava","8", "Kirill"));
        schools.add(new AbstractSchoolClass("Vera", "9","Kira"));
        schools.add(new AbstractSchoolClass("Svetlana","10","Maksim"));
        schools.add(new AbstractSchoolClass("Alina","11","Aleksandr"));
         */

        Student student = new Student();
        student.setStudentAge("18");
        student.setStudentEmail("gmail.com");
        student.setStudentGender("Man");
        student.setStudentHeight("181");
        student.setStudentWeight("76");
        student.setStudentId("1");
        student.setStudentIQ("92");
        student.setStudentName("Maksim");
        student.setStudentSurname("Pechkin");
        student.setStudentNationality("Belarus");
        student.setStudentPhone("+375291234567");
        student.setStudentSkinColor("White");

        Teacher teacher = new Teacher();
        teacher.getListStudentsForTeacher();

        /*
        teacher.setStudentAge("19");
        teacher.setStudentEmail("gmail.com");
        teacher.setStudentGender("Man");
        teacher.setStudentHeight("180");
        teacher.setStudentWeight("79");
        teacher.setStudentId("111");
        teacher.setStudentIQ("50");
        teacher.setStudentName("Ivan");
        teacher.setStudentSurname("Petrovich");
        teacher.setStudentNationality("Belarus");
        teacher.setStudentPhone("+3725291234567");
        teacher.setStudentSkinColor("White");

         */
    }
}
