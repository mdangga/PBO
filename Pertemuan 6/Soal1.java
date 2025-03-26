import java.util.Scanner;

public class Soal1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String USERNAME = "Angga";
        final String PASSWORD = "Angga123";
        final int MAX_ATTEMPT = 3;
        int inputCount = 0;
        boolean login = false;

        while (inputCount < MAX_ATTEMPT) {
            System.out.print("Masukkan Username: ");
            String inputUsername = input.nextLine();
            System.out.print("Masukkan Password: ");
            String inputPassword = input.nextLine();
            
            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                login = true;
                break;
            }else{
                inputCount++;
                System.out.println("Username atau Password salah! percobaan ke " + inputCount + "/" + MAX_ATTEMPT);
            }
        }

        input.close();

        if (login) {
            System.out.println("Selamat Datang, " + USERNAME);
        }else{
            System.out.println("Akun diblokir!");
        }

    }
}