import java.util.Scanner;

public class RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printFigure(number);
    }


    public static void printFigure(int number) {
        if(number == 0) {
            return;
        }
        printLineOfChars("*", number);
        printFigure(number - 1);
        printLineOfChars("#", number);
    }

    private static void printLineOfChars(String s, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(s);
        }
        System.out.println();
    }
}
