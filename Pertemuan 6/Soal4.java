import java.util.ArrayList;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarTugas = new ArrayList<String>();
        int pilihan = 0; // setel default pilihan
        
        while (pilihan != 5) {
            System.out.println("=== MENU TO-DO LIST ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Edit Tugas");
            System.out.println("3. Lihat Semua Tugas");
            System.out.println("4. Hapus Tugas");
            System.out.println("5. Keluar Tugas");

            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();
            System.out.println();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tugas baru: ");
                    daftarTugas.add(input.nextLine());
                    System.out.println();
                    break;
                
                case 2:
                    if (daftarTugas.size() > 0) {
                        System.out.print("Masukkan nomor tugas yang ingin diedit: ");
                        int index = input.nextInt();
                        input.nextLine();

                        if ((index - 1) < daftarTugas.size()) {
                            System.out.print("masukkan tugas untuk nomor " + index + ": ");
                            daftarTugas.set(index - 1, input.nextLine());
        
                            System.out.println("Tugas berhasil diedit");
                        }else{
                            System.out.println("Tidak ada antrian tugas yang bernomor " + index);
                        }
    
                    }else{
                        System.out.println("tidak ada yang bisa diedit, daftar masih kosong");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (daftarTugas.size() > 0) {
                        System.out.println("=== DAFTAR TUGAS ===");
                        for(int i = 0; i < daftarTugas.size(); i++){
                            System.out.println((i+1) + ". " + daftarTugas.get(i));
                        }
                    }else{
                        System.out.println("Daftar Kosong");
                    }
                    System.out.println();
                    break;

                case 4:
                    if(daftarTugas.size() > 0){
                        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                        int index = input.nextInt();
                        input.nextLine();
    
                        if ((index - 1) < daftarTugas.size()) {
                            daftarTugas.remove(index - 1);
                            System.out.println("Tugas berhasil dihapus");
                        }else{
                            System.out.println("nomor tidak ada di daftar");
                        }
                    }else{
                        System.out.println("tidak ada yang bisa dihapus, daftar masih kosong");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Terima Kasih telah menggunakan layanan kami");
                    break;
                
                default:
                    System.out.println("input invalid");
                    System.out.println();
                    break;
            }
        }

        input.close();
    }
}
