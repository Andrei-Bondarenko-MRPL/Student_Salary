public class Service extends Thread {
    private Student student;

    public Service(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        Scholarship scholarship = new Scholarship();
        System.out.println(scholarship.getScholarship(student) + " " + getName());
    }
}
