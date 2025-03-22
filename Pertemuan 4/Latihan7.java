class Hewan7 {
    void bersuara(){
        System.out.println("Hewan bersuara .....");
    }
}

class Kucing7 extends Hewan7 {
    @Override
    void bersuara() {
        System.out.println("Meow! Meow!");
    }
}

class Anjing7 extends Hewan7 {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}
public class Latihan7 {
    public static void main(String[] args) {
        Hewan7 kucing = new Kucing7();
        Hewan7 anjing = new Anjing7();

        kucing.bersuara();
        anjing.bersuara();
    }
}
