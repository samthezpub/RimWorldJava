import entity.World;
import exception.WorldTypeNoSelectedException;

public class Main {
    public static void main(String[] args) {
        try {
            World world = new World("Новый мир");
            System.out.println(world);
        } catch (WorldTypeNoSelectedException e) {
            throw new RuntimeException(e);
        }
    }
}