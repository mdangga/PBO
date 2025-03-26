import java.util.Random;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random shuffle = new Random();
        int target = shuffle.nextInt(100);
        int attempt = 0;

        while (attempt >= 0) {
            int guestNumber = 0;
            System.out.print("masukkan tebakan anda (1-100): ");
            guestNumber = input.nextInt();
            attempt++;

            if (guestNumber == 0) {
                break;
            }else if (guestNumber == target) {
                System.out.println("ketemu! dengan percobaan ke " + attempt);
                break;
            } else if (guestNumber > target) {
                System.out.println("terlalu besar");
            }else if (guestNumber < target) {
                System.out.println("terlalu kecil");
            } else {
                System.out.println("invalid input");
            }
        }
        input.close();
    }
}
