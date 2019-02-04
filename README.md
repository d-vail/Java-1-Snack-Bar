# Java I - JDK and Java Classes

## Snack Bar Project

A shippable JAR file including multi Class application.

### 1: Create classes

- **Snack**
  - *Variables:* id, name, quantity, cost, vending machine id
  - *Methods:* set name, get quantity, add quantity given quantity, buy snack given
    quantity, get total cost given a quantity
- **VendingMachine**
  - *Variables:* id, name
  - *Methods:* set and return name
- **Customer**
  - *Variables:* id, name, cash on hand
  - *Methods:* add cash, buy given total cash used in purchase, get and set name, get
    cash on hand

### 2: Instantiate objects

- Instantiate 2 customers
  - Jane with $45.25
  - Bob with $33.14
- Instantiate 3 Vending Machines
  - Food
  - Drink
  - Office
- Instantiate 5 snacks
  - In Vending Machine Food
    - 36 Chips at $1.75
    - 36 Chocolate Bar at $1.00
    - 30 Pretzel at $2.00
  - In Vending Machine Drink
    - 24 Soda at $2.50
    - 20 Water at $2.75

### 3: Perform actions with objects
- Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
- Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
- Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
- Customer 1 finds $10. Print Customer 1 Cash on Hand.
- Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
- Snack 3 gets 12 more. Print quantity of snack 3.
- Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

## Compile and Run Instructions

To compile `cd` into `/src` and run:

```` bash
javac snackBarApp/*.java
````

To prepare a shippable application (JAR file) run:

```` bash
jar cvfe SnackBarApp.jar snackBarApp.Main snackBarApp/*.class
````

To execute the application run:

```` bash
java -jar SnackBarApp.jar
````