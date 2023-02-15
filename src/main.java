import java.util.ArrayList;
import java.util.Scanner;

abstract class Vehicle {
  protected String type;
  protected String brand;
  protected String name;
  protected String licenseNumber;
  protected int topSpeed;
  protected int gasCap;
  protected int wheel;

  public void displayInfo(int index) {
    System.out.println("| " + index + " | " + this.type + "\t| " + this.name + "\t|");
  }

  abstract public void input();

  public void turnOnEntertainmentSystem() {
    System.out.println("Turning on entertainment system...");
  }
}

class Car extends Vehicle {
  private String carType;
  private int entertainmentSystem;

  @Override
  public void input() {
    Scanner input = new Scanner(System.in);
    System.out.print("Input brand [>= 5]: ");
    this.brand = input.nextLine();
    while (this.brand.length() < 5) {
      System.out.print("Brand must have at least 5 characters. Input brand [>= 5]: ");
      this.brand = input.nextLine();
    }
    System.out.print("Input name [>= 5]: ");
    this.name = input.nextLine();
    while (this.name.length() < 5) {
      System.out.print("Name must have at least 5 characters. Input name [>= 5]: ");
      this.name = input.nextLine();
    }
    System.out.print("Input license number [A-Z]{1,4} [0-9]{1,4} [A-Z]{1,3}: ");
    this.licenseNumber = input.nextLine();
    while (!this.licenseNumber.matches("^[A-Z]{1,4} [0-9]{1,4} [A-Z]{1,3}$")) {
      System.out.print("Invalid license number. Input license number [A-Z]{1,4} [0-9]{1,4} [A-Z]{1,3}: ");
      this.licenseNumber = input.nextLine();
    }
    System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
    this.topSpeed = input.nextInt();
    while (this.topSpeed < 100 || this.topSpeed > 250) {
      System.out.print("Top speed must be between 100 and 250. Input top speed [100 <= topSpeed <= 250]: ");
      this.topSpeed = input.nextInt();
    }
    System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
    this.gasCap = input.nextInt();
    while (this.gasCap < 30 || this.gasCap > 60) {
      System.out.print("Gas capacity must be between 30 and 60. Input gas capacity [30 <= gasCap <= 60]: ");
      this.gasCap = input.nextInt();
    }
    System.out.print("Input wheel [4 <= wheel <= 6]: ");
    this.wheel = input.nextInt();
    while (this.wheel < 4 || this.wheel > 6) {
      System.out.print("Wheel(s) must be between 4 and 6. Input wheel [4 <= wheel <= 6]: ");
      this.wheel = input.nextInt();
    }
    input.nextLine(); // clear input buffer
    System.out.print("Input type [SUV | Supercar | Minivan]: ");
    this.carType = input.nextLine();
    while (!this.carType.matches("^(SUV|Supercar|Minivan)$")) {
      System.out.print("Invalid car type. Input type [SUV | Supercar | Minivan]:
