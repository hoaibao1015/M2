package SS2;

public class Showtype {
    public static void main(String[] args) {
        int i;
        int j;
        System.out.println("In hình chữ nhật");
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 7; j++) {
                System.out.print("* ");
                if (j == 7) {
                    System.out.println();
                }
            }
        }
        System.out.println("In hình tam giác vuông");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
                if (j == i) {
                    System.out.println();
                }
            }
        }
        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
                if (j == i) {
                    System.out.println();
                }
            }
        }
    }
}

