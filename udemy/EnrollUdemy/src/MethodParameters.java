class Robot {

  public void speak(String speech) {
    System.out.println(speech);
  }

  public void run(int length) {
    System.out.println("Running for the " + length + " mark");
  }

  public void move(String direction, int distance) {
    System.out.println(
      "Into the " + direction + " which is " + distance + " meters"
    );
  }
}

public class MethodParameters {

  public static void main(String[] args) {
    Robot reich = new Robot();
    reich.speak("Hi! I'm the Reichsbot!");
    reich.run(900);
    reich.move("left", 1800);
  }
}
