package SS7.colorable;

public class Test {
    public static void main(String[] args) {
        Square square = new Square("red", true, 30);
        System.out.println(square.toString());
        square.howToColor();
    }
}

