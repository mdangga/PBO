import java.util.Random;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random shuffle = new Random();
        int target = shuffle.nextInt(100)+1;
        int percobaan = 0;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka diantara 1 sampai 100!");
        System.out.println("coba tebak atau ketik 0 untuk keluar!");

        while (percobaan >= 0) {
            int guestNumber = 0;
            System.out.print("masukkan tebakan anda: ");
            guestNumber = input.nextInt();
            percobaan++;

            if (guestNumber == 0) {
                System.out.println("Terima Kasih");
                break;
            }else if (guestNumber == target) {
                System.out.println("wah kamu hebat!, kamu menebak tepat di percobaan ke " + percobaan);
                break;
            } else if (guestNumber > target) {
                System.out.println("terlalu besar! Coba lagi.");
            }else if (guestNumber < target) {
                System.out.println("terlalu kecil! Coba lagi");
            } else {
                System.out.println("invalid input");
            }
        }
        input.close();
    }
}
