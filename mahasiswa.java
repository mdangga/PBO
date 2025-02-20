public class mahasiswa{
//    attribute
    String nama;
    long nim;

//    constructure
    mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }

//    method
    void tampilkanInfo(){
        System.out.println("Nama: " + nama + ",NIM: " + nim);
    }

}
