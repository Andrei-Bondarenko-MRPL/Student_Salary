public class SupplierStive extends Thread {

    @Override
    public void run() {
        Scholarship scholarshipStive = new Scholarship();

        String stringStive= scholarshipStive.getScholarship(new Student("Stive", "Stivenson", 7.9));
        System.out.println(stringStive + " " + getName());
    }
}
