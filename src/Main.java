public class Main {
    public static void main(String[] args) {
         SupplierBob bob = new SupplierBob();
         bob.start();

         SupplierJohn john = new SupplierJohn();
         john.start();

        SupplierTania tania = new SupplierTania();
        tania.start();

         SupplierStive stive = new SupplierStive();
         stive.start();
    }
}