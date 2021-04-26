class Thing {

  public String name;
  public static String description;
  public static final int EXAMPLE_CONSTANT = 69420;
  public static int count = 1;
  public int id;

  public Thing() {
    id = count;
    count++;
  }

  public void showName() {
    System.out.println(name);
    System.out.println("Object ID: " + id + ", " + description + ": " + name);
  }

  public static void showInfo() {
    System.out.println("Hello");
  }
}

public class StaticAndFinal {

  public static void main(String[] args) {
    Thing.description = "I am a thing";

    Thing.showInfo();

    System.out.println("Before creating object, count is: " + Thing.count);

    System.out.println(Thing.description);

    Thing thing1 = new Thing();
    Thing thing2 = new Thing();

    System.out.println("After creating object, count is: " + Thing.count);

    thing1.name = "Tanta";
    thing2.name = "Kiko";

    thing1.showName();
    thing2.showName();

    System.out.println(Math.PI);
    System.out.println(Thing.EXAMPLE_CONSTANT);
  }
}
