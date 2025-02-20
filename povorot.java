import java.util.Random;
import java.util.Scanner;

public class povorot {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Заполняем массив случайными значениями
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        System.out.println("Исходная матрица:");
        printField(colors);

        System.out.println("Введите угол поворота (90, 180, 270): ");
        int pov = scanner.nextInt();
        scanner.close();

        switch (pov) {
            case 90:
                System.out.println("Поворот на 90:");
                rotatedColors = rotate90(colors);
                printField(rotatedColors);
                break;
            case 180:
                System.out.println("Поворот на 180:");
                rotatedColors = rotate180(colors);
                printField(rotatedColors);
                break;
            case 270:
                System.out.println("Поворот на 270:");
                rotatedColors = rotate270(colors);
                printField(rotatedColors);
                break;
            default:
                System.out.println("Некорректный угол. Допустимые значения: 90, 180, 270.");
        }
    }

    // Метод вывода матрицы
    public static void printField(int[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", field[i][j]);
            }
            System.out.println();
        }
    }

    // Метод поворота на 90 градусов
    public static int[][] rotate90(int[][] field) {
        int[][] rotated = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[j][SIZE - 1 - i] = field[i][j];
            }
        }
        return rotated;
    }

    // Метод поворота на 180 градусов
    public static int[][] rotate180(int[][] field) {
        int[][] rotated = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[SIZE - 1 - i][SIZE - 1 - j] = field[i][j];
            }
        }
        return rotated;
    }

    // Метод поворота на 270 градусов
    public static int[][] rotate270(int[][] field) {
        int[][] rotated = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[SIZE - 1 - j][i] = field[i][j];
            }
        }
        return rotated;
    }
}