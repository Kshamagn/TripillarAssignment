package basic.TripillarAssignment.Module11;
public class Maze {
    static void solve(int i, int j, int n) {
        if (i == n - 1 && j == n - 1) {
            System.out.println("Reached end");
            return;
        }

        if (i < n) solve(i + 1, j, n);
        if (j < n) solve(i, j + 1, n);
    }

    public static void main(String[] args) {
        solve(0, 0, 3);
    }
}

