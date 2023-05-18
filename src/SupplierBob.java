public class SupplierBob extends Thread {

    @Override
    public void run() {
        Scholarship scholarshipBob = new Scholarship();
        String stringBob = scholarshipBob.getScholarship(new Student("Bob", "Bobson", 8.3));
        System.out.println(stringBob + " " + getName());
    }
}
