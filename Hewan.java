public class Hewan {
    //    attribute
    String nama;
    String jenis;
    int umur;

    //    constructure
    Hewan(String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    //    method
    void tampilkanInfo(){
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur);
    }

    void bertambahUmur(int umur){
        this.umur += umur;
        System.out.println(nama + " telah bertambah umur menjadi " + this.umur + " tahun");
    }

    void suaraHewan(){
        if (nama.equalsIgnoreCase("kucing")){
            System.out.println(nama + ": Meong");
        }else if (nama.equalsIgnoreCase("anjing")){
            System.out.println(nama + ": Guk Guk");
        }else if (nama.equalsIgnoreCase("ular")){
            System.out.println(nama + ": Sstt");
        }else{
            System.out.println(nama + ": Suara tidak ditemukan");
        }
    }
}