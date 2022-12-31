package chapter2.shish;

public class OnlyOnions {
    public boolean forOnion(Shish s) {
        return s.onlyOnions();
    }

    public boolean forSkewer() {
        return true;
    }

    public boolean forLamb(Shish s) {
        return false;
    }

    public boolean forTomato(Shish s) {
        return false;
    }
}
