package snackBarApp;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, VendingMachine vm) {
    maxId++;
    id = maxId;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vm.getId();
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

  public int getQuantity() {
    return quantity;
  }

  public void addQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void buySnack(int quantity) {
    this.quantity -= quantity;
  }

  public double getTotalCost(int quantity) {
    double total = quantity * this.cost;
    return total;
  }

  @Override
  public String toString() {
    String rtnStr = "Snack #" + id + ": " + quantity + " " + name + " at " + cost + " in vending machine " + vendingMachineId;
    return rtnStr;
  }
}