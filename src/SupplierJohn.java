public class SupplierJohn extends Thread{

    @Override
    public void run() {
        Scholarship scholarshipJohn = new Scholarship();
        String stringJohn = scholarshipJohn.getScholarship(new Student("John", "Johnson", 10));
        System.out.println(stringJohn + " " + getName());
    }
}
