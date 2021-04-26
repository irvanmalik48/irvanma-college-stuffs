public class Array {

  public static void main(System args[]) {
    int[] values = { 5, 7, 9, 12 };
    String[] words = { "umm", "ano", "eto", "eung" };

    for (int i = 0; i < values.length; i++) {
      System.out.print(values[i]);
    }

    for (String word : words) {
      System.out.println(word);
    }

    int[][] grid = {
      { 8, 9, 7, 6, 9, 2, 6 },
      { 7, 9, 6, 4, 5, 3, 9 },
      { 8, 6, 8, 2, 3, 0, 7 },
    };
    System.out.print(grid[1][1]);
    System.out.print(grid[3][5]);

    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[row].length; col++) {
        System.out.print(grid[row][col] + "\t");
      }
      System.out.println();
    }

    String[][] texts = {
      { "ini", "array", "multi", "dimensi" },
      { "umm", "ano", "eto", "eung" },
    };
    System.out.print(texts[1][1]);
    System.out.print(texts[0][3]);

    for (int rowstr = 0; rowstr < texts.length; rowstr++) {
      for (int colstr = 0; colstr < texts[rowstr].length; colstr++) {
        System.out.print(texts[rowstr][colstr] + "\t");
      }
      System.out.println();
    }
  }
}
