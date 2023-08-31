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
            System.out.println("X");
            System.out.println("Y");
            System.out.println("A");
            System.out.println("B");
        }

    }
}
