public class Student {
    private String name;
    private String lastName;
    private double grade;

    public Student(String name, String lastName, double grade) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new StudentException("Student`s name can't be null, create student with name and lastname");
        }
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (name == null) {
            throw new StudentException("Student`s lastname can't be null, create student with name and lastname");
        }
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 10) {
            throw new StudentException("Student`s grade should be more than 0 and less than 10");
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
