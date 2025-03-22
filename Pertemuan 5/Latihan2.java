class Mahasiswa {
    private String nama;

    // Constructor
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }
}

public class Latihan2 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Angga");
        // System.out.println(mhs.nama);
        System.out.println(mhs.getNama());
    }
}
