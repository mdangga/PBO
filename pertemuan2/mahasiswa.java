package pertemuan2;

class Mahasiswa1{
//    attribute
    String nama;
    long nim;

//    constructor
    Mahasiswa1(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }

//    method
    void tampilkanInfo(){
        System.out.println("Nama: " + nama + ",NIM: " + nim);
    }

}

public class mahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa1 mhs1 =  new Mahasiswa1("Angga", 2313231);
        Mahasiswa1 mhs2 =  new Mahasiswa1("Yuda", 2313230);

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}
