
public class Scholarship {
    private static final int BEST_SCHOLARSHIP = 100;
    private static final int GOOD_SCHOLARSHIP = 60;
    private static final double GRADE_FOR_BEST_SCHOLARSHIP = 10;
    private static final double GRADE_FOR_GOOD_SCHOLARSHIP = 8;


    public String getScholarship(Student student) {
        if (student.getGrade() == GRADE_FOR_BEST_SCHOLARSHIP) {
            return student + " scholarship is " + BEST_SCHOLARSHIP;
        } else if (student.getGrade() >= GRADE_FOR_GOOD_SCHOLARSHIP
                && student.getGrade() < GRADE_FOR_BEST_SCHOLARSHIP) {
            return student + " scholarship is " + GOOD_SCHOLARSHIP;
        } else {
            return student + " scholarship is 0";
        }
    }
//    public List<String> getScholarship(List<Student> studentList) {
//        List<String> student = new ArrayList<>();
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getGrade() == GRADE_FOR_BEST_SCHOLARSHIP) {
//                student.add(studentList.get(i) + " " + "scholarship is " + BEST_SCHOLARSHIP) ;
//            } else if (studentList.get(i).getGrade() >= GRADE_FOR_GOOD_SCHOLARSHIP
//                    && studentList.get(i).getGrade() < GRADE_FOR_BEST_SCHOLARSHIP) {
//                student.add(studentList.get(i) + " " + "scholarship is " + GOOD_SCHOLARSHIP);
//            } else {
//                student.add(studentList.get(i) + " scholarship is 0");
//            }
//        }
//        return student;

}
