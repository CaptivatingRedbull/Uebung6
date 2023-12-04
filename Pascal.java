import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tiefe eingeben: ");
        int tiefe = scanner.nextInt();
        scanner.close();

        int[][] dreieck = new int[tiefe][];
        for (int i = 0; i < tiefe; i++) {
            dreieck[i] = new int[i + 1];
            dreieck[i][0] = 1;  //linke und rechte "kante"
            dreieck[i][dreieck[i].length - 1] = 1;
            for (int j = 1; j < i; j++) {
                dreieck[i][j] = dreieck[i - 1][j - 1] + dreieck[i - 1][j];
            }
        }

        for (int i = 0; i < tiefe; i++) {
            if(i%2 ==0)
                System.out.printf("%3s", "");
            for (int k = 0; k < ((tiefe - i) / 2); k++) {
                System.out.printf("%6s", "");
            }

            for (int j = 0; j <= i; j++) {  //ausgeben der eigentlichen Werte
                System.out.printf("%6d", dreieck[i][j]);

            }

            System.out.println();
        }
    }
}