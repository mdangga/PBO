class Animal {
//  attribute
    String nama;
    String jenis;
    int umur;

//  constructor
    Animal(String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

//  method
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

public class Hewan {
    public static void main(String[] args) {

        Animal kucing = new Animal("kucing", "mamalia", 3);
        Animal anjing = new Animal("anjing", "mamalia", 3);
        Animal ular = new Animal("ular", "reptil", 1);
        Animal burung = new Animal("burung", "unggas", 1);

        kucing.tampilkanInfo();
        kucing.suaraHewan();
        kucing.bertambahUmur(2);
        kucing.tampilkanInfo();

        System.out.println();

        anjing.tampilkanInfo();
        anjing.suaraHewan();
        anjing.bertambahUmur(3);
        anjing.tampilkanInfo();

        System.out.println();

        ular.tampilkanInfo();
        ular.suaraHewan();
        ular.bertambahUmur(4);
        ular.tampilkanInfo();

        System.out.println();

        burung.tampilkanInfo();
        burung.suaraHewan();
        burung.bertambahUmur(4);
        burung.tampilkanInfo();
    }
}
