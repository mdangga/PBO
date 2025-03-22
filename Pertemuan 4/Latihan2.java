class Hewan2{
    void makan(){
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing2 extends Hewan2{
    void suara(){
        System.out.println("Meow!.");
    }
}

class KucingAnggora2 extends Kucing2{
    void jenis(){
        System.out.println("Ini adalah kucing anggora.");
    }
}
public class Latihan2 {
    public static void main(String[] args) {
        KucingAnggora2 Anggora = new KucingAnggora2();

        Anggora.makan();
        Anggora.suara();
        Anggora.jenis();
    }
}
