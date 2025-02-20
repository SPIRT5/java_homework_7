import java.util.Random;
import java.util.Scanner;

public class povorot {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Заполняем массив случайными значениями
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        printField(colors);

        System.out.println("Введите угол поворота (90, 180, 270): ");
        int pov = scanner.nextInt();
        scanner.close();
        //int[][] rotatedColors = new int[SIZE][SIZE];

        switch (pov) {
            case 90:
                System.out.println("Поворот на 90:");
                printField90(colors);
                break;
            case 180:
                System.out.println("Поворот на 180:");
                printField180(colors);
                break;
            case 270:
                System.out.println("Поворот на 270:");
                printField270(colors);
                break;
            default:
                System.out.println("Некорректный угол. Допустимые значения: 90, 180, 270.");
                return;
        }

    }

    // Массив без поворотов
    public static void printField(int[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", field[i][j]);
            }
            System.out.println();
        }
    }

    // Поворот массива на 90 градусов
    public static void printField90(int[][] field){
        for (int j = 0; j < SIZE; j++) {
            for (int i = SIZE-1; i >= 0; i--) {
                System.out.format("%4d", field[i][j]);
            }
            System.out.println();
        }
    }

    // Поворот массива на 180 градусов
    public static void printField180(int[][] field) {
        for (int i = SIZE-1; i >= 0; i--) {
            for (int j = SIZE-1; j >= 0; j--) {
                System.out.format("%4d", field[i][j]);
            }
            System.out.println();
        }
    }

    // Поворот массива на 270 градусов
    public static void printField270(int[][] field) {
        for (int j = SIZE-1; j >= 0; j--) {
            for (int i = 0; i < SIZE; i++) {
                System.out.format("%4d", field[i][j]);
            }
            System.out.println();
        }
    }

}
