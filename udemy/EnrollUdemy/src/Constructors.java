class Machine {

  private String name;
  private int code;

  public Machine() {
    this("Eum", 99);
    System.out.println("Constructor running.");

    name = "Tanta";
  }

  public Machine(String name) {
    this(name, 0);
    System.out.println("Second constructor running.");

    this.name = name;
  }

  public Machine(String name, int code) {
    System.out.println("Third constructor running.");
    this.name = name;
    this.code = code;
  }
}

public class Constructors {

  public static void main(String[] args) {
    Machine machine1 = new Machine();
    Machine machine2 = new Machine("Syifa");
    Machine machine3 = new Machine("Syifa", 99);
  }
}
