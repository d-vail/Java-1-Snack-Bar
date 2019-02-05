package snackBarApp;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(String name, double cashOnHand) {
    maxId++;
    id = maxId;

    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCashOnHand() {
    return cashOnHand;
  }

  public void addCash(double cash) {
    cashOnHand += cash;
  }

  public void buy(int quantity, Snack snack) {
    double totalCost = snack.getTotalCost(quantity);
    cashOnHand -= totalCost;

    snack.buySnack(quantity);
  }

  @Override
  public String toString() {
    String rtnStr = "Customer #" + id + ": " + name + " with $" + cashOnHand;
    return rtnStr;
  }
}