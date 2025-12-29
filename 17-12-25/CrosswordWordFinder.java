import java.util.*;

public class CrosswordWordFinder {

    static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    static int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};

    public static void findWord(char[][] grid, String word) {
        int rows = grid.length;
        int cols = grid[0].length;
        int len = word.length();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == word.charAt(0)) {

                    for (int d = 0; d < 8; d++) {
                        int r = i, c = j;
                        int k;

                        for (k = 0; k < len; k++) {
                            if (r < 0 || c < 0 || r >= rows || c >= cols)
                                break;
                            if (grid[r][c] != word.charAt(k))
                                break;

                            r += dx[d];
                            c += dy[d];
                        }

                        if (k == len) {
                            int endRow = r - dx[d];
                            int endCol = c - dy[d];

                            System.out.println(
                                "Word found from (" + i + "," + j + 
                                ") to (" + endRow + "," + endCol + ")"
                            );
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Word not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        char[][] grid = new char[rows][cols];

        System.out.println("Enter crossword matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        // Input word
        System.out.print("Enter word to find: ");
        String word = sc.next();

        findWord(grid, word);
    }
}
