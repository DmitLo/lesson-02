import java.util.Arrays;
public class printColor {
    public static void main(String[] args) {
        int value;
        value = 101;
        if (value <=0 ) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
