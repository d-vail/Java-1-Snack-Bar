package snackBarApp;

public class Main {
  private static void operateSnackBar() {
    // Instantiate objects
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

    Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
    Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
    Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
    Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
    Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

    System.out.println("*** Starting Data ***");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println("\n");

    /**
     * Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity
     * of snack 4.
     */
    System.out.println("*** Customer 1 buys 3 of snack 4 ***");
    c1.buy(s4.getTotalCost(3));
    s4.buySnack(3);
    System.out.println("Customer 1 Cash on Hand: " + c1.getCashOnHand());
    System.out.println("Snack 4 Quantity: " + s4.getQuantity());
    System.out.println("\n");

    /**
     * Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity
     * of snack 3.
     */
    System.out.println("*** Customer 1 buys 1 of snack 3 ***");
    c1.buy(s3.getTotalCost(1));
    s3.buySnack(1);
    System.out.println("Customer 1 Cash on Hand: " + c1.getCashOnHand());
    System.out.println("Snack 3 Quantity: " + s3.getQuantity());
    System.out.println("\n");

    /**
     * Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity
     * of snack 4.
     */
    System.out.println("*** Customer 2 buys 2 of snack 4 ***");
    c2.buy(s4.getTotalCost(2));
    s4.buySnack(2);
    System.out.println("Customer 2 Cash on Hand: " + c2.getCashOnHand());
    System.out.println("Snack 4 Quantity: " + s4.getQuantity());
    System.out.println("\n");
    
    /**
     * Customer 1 finds $10. Print Customer 1 Cash on Hand.
     */
    System.out.println("*** Customer 1 found $10 ***");
    c1.addCash(10.00);
    System.out.println("Customer 1 Cash on Hand: " + c1.getCashOnHand());
    System.out.println("\n");
    
    /**
     * Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity
     * of snack 2.
     */
    System.out.println("*** Customer 1 buys 1 of snack 2 ***");
    c1.buy(s2.getTotalCost(1));
    s2.buySnack(1);
    System.out.println("Customer 1 Cash on Hand: " + c1.getCashOnHand());
    System.out.println("Snack 2 Quantity: " + s2.getQuantity());
    System.out.println("\n");
    
    /**
     * Snack 3 gets 12 more. Print quantity of snack 3.
     */
    System.out.println("*** Snack 3 gets 12 more ***");
    s3.addQuantity(12);
    System.out.println("Snack 3 Quantity: " + s3.getQuantity());
    System.out.println("\n");
    
    /**
     * Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity
     * of snack 3
     */
    System.out.println("*** Customer 2 buys 3 of snack 3 ***");
    c2.buy(s3.getTotalCost(3));
    s3.buySnack(3);
    System.out.println("Customer 2 Cash on Hand: " + c2.getCashOnHand());
    System.out.println("Snack 3 Quantity: " + s3.getQuantity());
    System.out.println("\n");
  }

  public static void main(String[] args) {
    operateSnackBar();
  }
}