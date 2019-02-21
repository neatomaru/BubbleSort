import java.util.Scanner;

class DemonstrateArray {
      void demonstrateArr(int array[]) {
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}

class SortingB {
    void sortArray(int array[]) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                }
            }
        }
    }
}

class BubbleSort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Введите элементы массива для сортировки:");
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println();
        DemonstrateArray demonstrate = new DemonstrateArray();
        demonstrate.demonstrateArr(array);
        System.out.println();
        System.out.println("Отсортировать массив?(1 - yes, another key - quit)");
        int choice = input.nextInt();
        if(choice == 1) {
            SortingB returnSort = new SortingB();
            returnSort.sortArray(array);
            System.out.print("Отсортированный ");
            demonstrate.demonstrateArr(array);
        }
    }
}