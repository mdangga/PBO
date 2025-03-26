class Mahasiswa{
    private String nama;
    private int umur;

//    constructor
    public Mahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
// getter and setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

//    getter and setter umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 0){
            this.umur = umur;
        }else{
            System.out.println("Invalid Input");
        }
    }

}
public class Latihan1 {
    public static void main(String[] args) {
        
        Mahasiswa mhs = new Mahasiswa("angga", 19);

//        mengakses menggunakan getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Umur: " + mhs.getUmur());
//        mengubah value menggunakan setter
        mhs.setNama("murdika");
        mhs.setUmur(20);
//        mengakses menggunakan getter
        System.out.println("Nama Baru: " + mhs.getNama());
        System.out.println("Umur Baru: " + mhs.getUmur());
    }
}
