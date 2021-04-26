public class StringBuilderAndStringFormatting {

  public static void main(String[] args) {
    // INEFFICIENT //
    String info = "";

    info += "Hello,";
    info += " ";
    info += "my name is Tanta!";

    System.out.println(info);

    // EFFICIENT //
    StringBuilder sb = new StringBuilder("");

    sb.append("My name is Tanta.");
    sb.append(" ");
    sb.append("I am a college student.");

    System.out.println(sb.toString());

    StringBuilder s = new StringBuilder();

    s
      .append("I also can play guitar!")
      .append(" ")
      .append("You want Jazz? Bring it!");

    System.out.println(s.toString());

    // FORMATTING //
    System.out.print("Here is some text\tThat was a tab\nThat was a new line");
    System.out.println();
    System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);

    for (int i = 0; i < 20; i++) {
      System.out.printf("%-2d: %s\n", i, "here is some text");
    }

    System.out.printf("Total value: %.2f\n", 5.6789);
    System.out.printf("Total value: %5.1f\n", 12345.6789);
    System.out.printf("Total value: %5.1f\n", 2345.6789);
  }
}
