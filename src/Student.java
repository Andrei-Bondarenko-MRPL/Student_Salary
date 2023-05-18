public class Student {
    private String name;
    private String lastName;
    private double grade;

    public Student(String name, String lastName, double grade) {
        if (name == null) {
            throw new StudentException("Student`s name can't be null, create student with name and lastname");
        } else {
            this.name = name;
        }
        if (lastName == null) {
            throw new StudentException("Student`s lastname can't be null, create student with name and lastname");
        } else {
            this.lastName = lastName;
        }
        if (grade < 0 || grade > 10) {
            throw new StudentException("Grade should be more than 0 and less than 10");
        } else {
            this.grade = grade;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", grade=" + getGrade() +
                '}';
    }
}
