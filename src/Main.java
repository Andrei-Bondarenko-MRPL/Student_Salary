public class Main {
    public static void main(String[] args) throws InterruptedException {
         SupplierBob bob = new SupplierBob();
         bob.start();

         SupplierJohn john = new SupplierJohn();
         john.start();

         SupplierStive stive = new SupplierStive();
         stive.start();

         SupplierTania tania = new SupplierTania();
         tania.start();

//        Student bob = new Student("Bob" , "Bobson", 8.3);
//        Student john = new Student("John", "Johnson", 10);
//        Student stive = new Student("Stive", "Stivenson", 7.9);
//        Student tania = new Student("Tania", "Ivanova", 5);
//        List<Student> studentList = List.of(bob, john, stive, tania);
//
//        Scholarship scholarship = new Scholarship();
//        List<String> list = scholarship.getScholarship(studentList);
//        list.stream()
//                .forEach(s -> System.out.println(s));
    }
}