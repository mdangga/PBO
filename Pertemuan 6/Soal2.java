import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choose;
        do{
            double result;

            System.out.print("Masukkan Angka Pertama: ");
            double angkaPertama = input.nextDouble();
            input.nextLine();

            System.out.print("Masukkan Operator (+, -, *, /, %): ");
            String operatorBilangan = input.nextLine();

            System.out.print("Masukkan Angka Kedua: ");
            double angkaKedua = input.nextDouble();
            input.nextLine();

            switch (operatorBilangan) {
                case "+":
                    result = angkaPertama + angkaKedua;
                    System.out.println("Hasil: " + result);
                    break;
                    
                case "-":
                    result = angkaPertama - angkaKedua;
                    System.out.println("Hasil: " + result);
                    break;

                case "*":
                    result = angkaPertama * angkaKedua;
                    System.out.println("Hasil: " + result);
                    break;

                case "/":
                    if (angkaKedua != 0) {
                        result = angkaPertama / angkaKedua;
                        System.out.println("Hasil: " + result);
                    }else{
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan");
                    }
                    break;

                case "%":
                    if (angkaKedua != 0) {
                        result = angkaPertama % angkaKedua;
                        System.out.println("Hasil: " + result);
                    }else{
                        System.out.println("Error: Modulus dengan nol tidak diperbolehkan");
                    }
                    break;

                default:
                    System.out.println("Operator Invalid");
                    break;
            }

            System.out.print("apakah ingin mencoba lagi(y/n): ");
            choose = input.nextLine();
        
        }
        while (choose.equalsIgnoreCase("y"));

        System.out.println("Terima Kasih");
        input.close();
    }
}
