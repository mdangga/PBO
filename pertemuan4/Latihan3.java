package pertemuan4;

class Hewan3 {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing3 extends Hewan3 {
    void suara() {
        System.out.println("Meow!.");
    }
}

class Anjing3 extends Hewan3 {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

public class Latihan3 {
    public static void main(String[] args) {
        Hewan3 hewan = new Hewan3();
        Kucing3 kucing = new Kucing3();
        Anjing3 anjing = new Anjing3();

        hewan.makan();
        System.out.println();
        kucing.makan();
        kucing.suara();
        System.out.println();
        anjing.makan();
        anjing.suara();
    }
}
