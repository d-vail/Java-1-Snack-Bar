package snackBarApp;

public class Main {
  private static void print(Customer customer, Snack snack) {
    if (customer != null) {
      System.out.println("Customer " + customer.getId() + " | Name: " + customer.getName() + ", Cash On Hand: $"
          + customer.getCashOnHand());
    }

    if (snack != null) {
      System.out.println("Snack " + snack.getId() + " | Name: " + snack.getName() + ", Qty: " + snack.getQuantity());
    }

    System.out.println("\n");
  }

  private static void operateSnackBar() {
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, food);
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food);
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food);
    Snack soda = new Snack("Soda", 24, 2.50, drink);
    Snack water = new Snack("Water", 20, 2.75, drink);

    System.out.println("*** Customer 1 buys 3 of snack 4 ***");
    jane.buy(3, soda);
    print(jane, soda);

    System.out.println("*** Customer 1 buys 1 of snack 3 ***");
    jane.buy(1, pretzel);
    print(jane, pretzel);

    System.out.println("*** Customer 2 buys 2 of snack 4 ***");
    bob.buy(2, soda);
    print(bob, soda);
    
    System.out.println("*** Customer 1 found $10 ***");
    jane.addCash(10.00);
    print(jane, null);
    
    System.out.println("*** Customer 1 buys 1 of snack 2 ***");
    jane.buy(1, chocolateBar);
    print(jane, chocolateBar);

    System.out.println("*** Snack 3 gets 12 more ***");
    pretzel.addQuantity(12);
    print(null, pretzel);
    
    System.out.println("*** Customer 2 buys 3 of snack 3 ***");
    bob.buy(3, pretzel);
    print(bob, pretzel);
  }

  public static void main(String[] args) {
    operateSnackBar();
  }
}