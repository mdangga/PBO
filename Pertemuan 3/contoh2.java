interface Hewan {
    void bersuara();
}

class Kucing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Kucing mengeong: Meow Meow!");
    }
}
class Anjing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Anjing menggonggong: Guk! Guk!");
    }

}
public class contoh2 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.bersuara();
        System.out.println();
        anjing.bersuara();

    }
}
