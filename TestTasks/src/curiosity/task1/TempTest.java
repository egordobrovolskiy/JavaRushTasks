package curiosity.task1;

public class TempTest {
    public static void main(String[] args) {
        f(5);
    }
    public static int f(int x) {
//        System.out.print(" " + x);
        int result = (x < 2) ? x : f(x - 2) + f(x - 1);
//        System.out.println();
        System.out.print(" " + x);
        return result;

    }
}
