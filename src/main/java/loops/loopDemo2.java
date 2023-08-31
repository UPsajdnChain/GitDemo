package loops;

public class loopDemo2 {
    public static void main(String[] args) {

        int k = 1;

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++)
            {
                System.out.print(k * 3 + " ");
                k++;
            }
            System.out.println("");
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
