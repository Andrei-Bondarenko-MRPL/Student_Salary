public class Main {
    public static void main(String[] args) {
        Service bob = new Service(new Student("Bob", "Bobson", 7.8));
        bob.start();

        Service alice = new Service(new Student("Alice", "Alison", 8.3));
        alice.start();

        Service john = new Service(new Student("John", "Johnson", 10));
        john.start();

        Service tania = new Service(new Student("Tania", "Ivanova", 5.3));
        tania.start();
    }
}