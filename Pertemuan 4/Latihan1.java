class Hewan1{
    String nama;
    void makan(){
        System.out.println(nama + " sedang makan.");
    }
}

class Kucing1 extends Hewan1{
    void suara(){
        System.out.println(nama + " mengeong: Meow!.");
    }
}
public class Latihan1 {
    public static void main(String[] args) {
        Kucing1 kucing1 = new Kucing1();
        kucing1.nama = "Tom";
        kucing1.makan();
        kucing1.suara();
    }
}
