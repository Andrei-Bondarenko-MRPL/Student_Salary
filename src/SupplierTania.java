public class SupplierTania extends Thread{
    @Override
    public void run() {
        Scholarship scholarshipTania = new Scholarship();
        String stringTania = scholarshipTania.getScholarship(new Student("Tania", "Ivanova", 5));
        System.out.println(stringTania + " " + getName());
    }
}
