import org.task1.Cat;

public class MainTask1 {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 10,"british");
        barsik.showCat();
        System.out.println(barsik.newName("Sharik"));
        barsik.showCat();
    }
}
