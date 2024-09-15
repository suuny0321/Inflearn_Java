package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int num = 1; num <= 9; num++) {
                System.out.println(i + "*" + num + "=" + i * num);
            }
        }
    }
}
